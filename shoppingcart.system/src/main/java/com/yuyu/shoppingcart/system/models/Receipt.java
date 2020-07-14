package com.yuyu.shoppingcart.system.models;

import java.util.List;

public class Receipt {
public double totalAmount;
public double amountPaid;
public List<Item> itemBought;
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public double getAmountPaid() {
	return amountPaid;
}
public void setAmountPaid(double amountPaid) {
	this.amountPaid = amountPaid;
}
public List<Item> getItemBought() {
	return itemBought;
}
public void setItemBought(List<Item> itemBought) {
	this.itemBought = itemBought;
}

}
