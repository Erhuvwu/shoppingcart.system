package com.yuyu.shoppingcart.system;

import com.yuyu.shoppingcart.system.models.Item;
import com.yuyu.shoppingcart.system.services.ShoppingCartService;


public class App 
{
    public static void main( String[] args )
    {
       Item item = new Item("box", 2.00,6);
       Item item2 = new Item("bag", 3.00, 4);
       Item item3 = new Item("toy", 4.00, 5);
       
       ShoppingCartService service = new ShoppingCartService();
       
       service.addItem(item);
       service.addItem(item2);
       service.addItem(item3);
       
       service.checkout("Yuyu", 400, 45);
       
       
     double total =   service.totalCostOfItemBought();
     
     System.out.println(total);
       
     service.generateReceipt();
    }
}
