package com.ds.metrocabs.model.payment;

import java.io.Serializable;
import java.util.Date;

public class DemandDraft implements Serializable {
private String dd_number;
private String bank_name;
private String branch_name;
private double amount;
private Date deposit_date;
private Date expire_date;
//to enter payment id
private Payment payment; //many to one
public DemandDraft() {
	// TODO Auto-generated constructor stub
}
public DemandDraft(String dd_number, String bank_name, String branch_name, double amount, Date deposit_date,
		Date expire_date, Payment payment) {
	super();
	this.dd_number = dd_number;
	this.bank_name = bank_name;
	this.branch_name = branch_name;
	this.amount = amount;
	this.deposit_date = deposit_date;
	this.expire_date = expire_date;
	this.payment = payment;
}
public String getDd_number() {
	return dd_number;
}
public void setDd_number(String dd_number) {
	this.dd_number = dd_number;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public String getBranch_name() {
	return branch_name;
}
public void setBranch_name(String branch_name) {
	this.branch_name = branch_name;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Date getDeposit_date() {
	return deposit_date;
}
public void setDeposit_date(Date deposit_date) {
	this.deposit_date = deposit_date;
}
public Date getExpire_date() {
	return expire_date;
}
public void setExpire_date(Date expire_date) {
	this.expire_date = expire_date;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}

}
