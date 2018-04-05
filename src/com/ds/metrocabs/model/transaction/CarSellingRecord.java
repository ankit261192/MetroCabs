package com.ds.metrocabs.model.transaction;

import java.util.Date;

import com.ds.metrocabs.model.payment.Payment;
import com.ds.metrocabs.model.usermodel.User;

public class CarSellingRecord {
private int car_sale_id;
private User user;

//need to enter paymentid
private Payment payment;
private Date date_of_sale;

//for which car sale post,car is bought
private CarForSaleRecord car_for_sale_record;//one to one

public CarSellingRecord() {
	// TODO Auto-generated constructor stub
}

public CarSellingRecord(int car_sale_id, User user, Payment payment, Date date_of_sale,
		CarForSaleRecord car_for_sale_record) {
	super();
	this.car_sale_id = car_sale_id;
	this.user = user;
	this.payment = payment;
	this.date_of_sale = date_of_sale;
	this.car_for_sale_record = car_for_sale_record;
}

public int getCar_sale_id() {
	return car_sale_id;
}

public void setCar_sale_id(int car_sale_id) {
	this.car_sale_id = car_sale_id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Payment getPayment() {
	return payment;
}

public void setPayment(Payment payment) {
	this.payment = payment;
}

public Date getDate_of_sale() {
	return date_of_sale;
}

public void setDate_of_sale(Date date_of_sale) {
	this.date_of_sale = date_of_sale;
}

public CarForSaleRecord getCar_for_sale_record() {
	return car_for_sale_record;
}

public void setCar_for_sale_record(CarForSaleRecord car_for_sale_record) {
	this.car_for_sale_record = car_for_sale_record;
}

}
