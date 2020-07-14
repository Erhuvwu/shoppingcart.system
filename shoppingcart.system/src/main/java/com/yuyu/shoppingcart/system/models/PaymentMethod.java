package com.yuyu.shoppingcart.system.models;

public class PaymentMethod {

private String cardName="Blessing";
private long cardNo=456778;
private int cardPin=1350;
private double balance=400;





public PaymentMethod() {
	
}

public PaymentMethod(String cardName, long cardNo, int cardPin, double balance) {
this.cardName = cardName;
this.balance = balance;
this.cardNo = cardNo;
this.cardPin = cardPin;
}

public String getCardName() {
	return cardName;
}

public long getCardNo() {
	return cardNo;
}

public int getCardPin() {
	return cardPin;
}

public double getBalance() {
	return balance;
}







}
