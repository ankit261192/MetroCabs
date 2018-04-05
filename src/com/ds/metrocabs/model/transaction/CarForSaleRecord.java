package com.ds.metrocabs.model.transaction;

import java.util.Date;

import com.ds.metrocabs.model.place.Location;
import com.ds.metrocabs.model.vehiclemodel.Car;

public class CarForSaleRecord {
private int car_for_sale_id;
private Date date_of_added;
private String branch_location;
private double sale_price;
private int speedo_reading;
private Car car;
public CarForSaleRecord() {
	// TODO Auto-generated constructor stub
}
public CarForSaleRecord(int car_for_sale_id, Date date_of_added, String branch_location, double sale_price,
		int speedo_reading, Car car) {
	super();
	this.car_for_sale_id = car_for_sale_id;
	this.date_of_added = date_of_added;
	this.branch_location = branch_location;
	this.sale_price = sale_price;
	this.speedo_reading = speedo_reading;
	this.car = car;
}
public int getCar_for_sale_id() {
	return car_for_sale_id;
}
public void setCar_for_sale_id(int car_for_sale_id) {
	this.car_for_sale_id = car_for_sale_id;
}
public Date getDate_of_added() {
	return date_of_added;
}
public void setDate_of_added(Date date_of_added) {
	this.date_of_added = date_of_added;
}
public String getBranch_location() {
	return branch_location;
}
public void setBranch_location(String branch_location) {
	this.branch_location = branch_location;
}
public double getSale_price() {
	return sale_price;
}
public void setSale_price(double sale_price) {
	this.sale_price = sale_price;
}
public int getSpeedo_reading() {
	return speedo_reading;
}
public void setSpeedo_reading(int speedo_reading) {
	this.speedo_reading = speedo_reading;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

}
