package com.ds.metrocabs.model.payment;

import java.util.Date;

public class Coupon {
private int coupon_id;
private int max_amt;
private int min_amt;
private Date valid_upto;
private int discount_amt;
public Coupon() {
	// TODO Auto-generated constructor stub
}
public Coupon(int coupon_id, int max_amt, int min_amt, Date valid_upto, int discount_amt) {
	super();
	this.coupon_id = coupon_id;
	this.max_amt = max_amt;
	this.min_amt = min_amt;
	this.valid_upto = valid_upto;
	this.discount_amt = discount_amt;
}
public int getCoupon_id() {
	return coupon_id;
}
public void setCoupon_id(int coupon_id) {
	this.coupon_id = coupon_id;
}
public int getMax_amt() {
	return max_amt;
}
public void setMax_amt(int max_amt) {
	this.max_amt = max_amt;
}
public int getMin_amt() {
	return min_amt;
}
public void setMin_amt(int min_amt) {
	this.min_amt = min_amt;
}
public Date getValid_upto() {
	return valid_upto;
}
public void setValid_upto(Date valid_upto) {
	this.valid_upto = valid_upto;
}
public int getDiscount_amt() {
	return discount_amt;
}
public void setDiscount_amt(int discount_amt) {
	this.discount_amt = discount_amt;
}

}
