package com.ds.metrocabs.model.vehiclemodel;

import java.util.Date;

import com.ds.metrocabs.model.payment.VehicleCharges;
import com.ds.metrocabs.model.place.Branch;

public class Car {
private int car_id;
private String car_name;
private String reg_no;
private Date date_of_added;
private Date model_year;
private CarType car_type;//many to one
private FuelType fuel_type;//many to one
private byte availability_flag;
private Branch branch;//many to one
public Car() {
	// TODO Auto-generated constructor stub
}
public Car(int car_id, String car_name, String reg_no, Date date_of_added, Date model_year, CarType car_type,
		FuelType fuel_type, byte availability_flag, Branch branch) {
	super();
	this.car_id = car_id;
	this.car_name = car_name;
	this.reg_no = reg_no;
	this.date_of_added = date_of_added;
	this.model_year = model_year;
	this.car_type = car_type;
	this.fuel_type = fuel_type;
	this.availability_flag = availability_flag;
	this.branch = branch;
}
public int getCar_id() {
	return car_id;
}
public void setCar_id(int car_id) {
	this.car_id = car_id;
}
public String getCar_name() {
	return car_name;
}
public void setCar_name(String car_name) {
	this.car_name = car_name;
}
public String getReg_no() {
	return reg_no;
}
public void setReg_no(String reg_no) {
	this.reg_no = reg_no;
}
public Date getDate_of_added() {
	return date_of_added;
}
public void setDate_of_added(Date date_of_added) {
	this.date_of_added = date_of_added;
}
public Date getModel_year() {
	return model_year;
}
public void setModel_year(Date model_year) {
	this.model_year = model_year;
}
public CarType getCar_type() {
	return car_type;
}
public void setCar_type(CarType car_type) {
	this.car_type = car_type;
}
public FuelType getFuel_type() {
	return fuel_type;
}
public void setFuel_type(FuelType fuel_type) {
	this.fuel_type = fuel_type;
}
public byte getAvailability_flag() {
	return availability_flag;
}
public void setAvailability_flag(byte availability_flag) {
	this.availability_flag = availability_flag;
}
public Branch getBranch() {
	return branch;
}
public void setBranch(Branch branch) {
	this.branch = branch;
}
}
