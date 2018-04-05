package com.ds.metrocabs.model.payment;

import java.util.Date;

public class Payment {

	private int payment_id;
	private int amount;
	private Date txtime;
	private PaymentType payment_type;//many to one
	//0 for extra charges,1 for confirmation 
	//private byte payment_for_number;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(int payment_id, int amount, Date txtime, PaymentType payment_type) {
		super();
		this.payment_id = payment_id;
		this.amount = amount;
		this.txtime = txtime;
		this.payment_type = payment_type;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getTxtime() {
		return txtime;
	}
	public void setTxtime(Date txtime) {
		this.txtime = txtime;
	}
	public PaymentType getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(PaymentType payment_type) {
		this.payment_type = payment_type;
	}
	
	
}
