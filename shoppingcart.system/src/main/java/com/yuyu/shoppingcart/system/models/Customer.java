package com.yuyu.shoppingcart.system.models;

import java.util.List;

import com.yuyu.shoppingcart.system.utilities.Gender;


public class Customer {
	private String name;
	private String id;
	private Gender gender;
	private PaymentMethod card;
	public List<Item> Items;
	public Receipt receipt;
	
public Customer(String name, String id, Gender gender, PaymentMethod card) {
	this.name = name;
	this.id = id;
	this.gender = gender;
	this.card = card;
}

public Customer(String name, String id) {
	
	this.name = name;
	this.id = id;
}

public List<Item> getItems() {
	return Items;
}

public void setItems(List<Item> items) {
	Items = items;
}

public Receipt getReceipt() {
	return receipt;
}

public void setReceipt(Receipt receipt) {
	this.receipt = receipt;
}

public String getName() {
	return name;
}

public String getId() {
	return id;
}

public Gender getGender() {
	return gender;
}

public PaymentMethod getCard() {
	return card;
}
	

}
