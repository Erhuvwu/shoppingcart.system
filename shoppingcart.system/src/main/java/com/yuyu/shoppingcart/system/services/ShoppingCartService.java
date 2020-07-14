package com.yuyu.shoppingcart.system.services;


import java.util.ArrayList;
import java.util.List;

import com.yuyu.shoppingcart.system.models.Customer;
import com.yuyu.shoppingcart.system.models.Item;
import com.yuyu.shoppingcart.system.models.PaymentMethod;

public class ShoppingCartService {
public List<Item> items;
double sum = 0.0;

public ShoppingCartService() {
	items = new ArrayList<>();
}
	
public void addItem(Item item) {
	if(items!=null) {
		items.add(item);
	}else {
		items = new ArrayList<>();
		items.add(item);
		
	}
}
public List<Item> getAddedItems() {
	return items;
    }
public Customer createCustomer(String name, String id) {
	Customer customer = new Customer(name, id);
	 return customer;
	
}

public double totalCostOfItemBought() {
	for(Item item : items) {
	 double price = item.getPrice();
	 
	 int quantity = item.getQuantity();
	 
	 double total = price * quantity;
		
	 sum += total;
		
	}
	return sum;
}






public void removeItem(String name) {
	double total=0;
	for(Item item:items) {
		if(item.getName().equalsIgnoreCase(name)) {
			items.remove(name);
			
			int quantity = item.getQuantity();
			
			double price = item.getPrice();
			
			total = quantity * price;
			
			sum -= total;
		}
	}
	
	System.out.println("You have removed " + name + " and the price is " + total);
	
	
}

public void checkout(String cardName, long cardNo, int cardPin) {
	
	PaymentMethod paymentMethod = new PaymentMethod();
	
	if(paymentMethod.getCardName().equals(cardName) && paymentMethod.getCardPin()==cardPin && paymentMethod.getCardNo()==cardNo && paymentMethod.getBalance()>sum) {
		 System.out.println("You have succeessfully purchase this item");
	}else {
		System.out.println("Low balance please use another payment method");
	}
}
	
	public void generateReceipt() {
		for(Item item : items) {
			System.out.println(item.getName() + " " +  item.getPrice());
		}
		
		System.out.println("Thank you for shopping at Target, the total price of your item is " + sum);
	}
	
}

    

