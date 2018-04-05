package com.ds.metrocabs.model.vehiclemodel;

import java.util.Date;

public class FuelReading {
private int fuel_read_id;
private Date fuel_read_date;
private Date fuel_read_time;
private int fuel_reading;
private int fuel_read_version;
private Car car;//many to one
public FuelReading() {
	// TODO Auto-generated constructor stub
}

public FuelReading(int fuel_read_id, Date fuel_read_date, Date fuel_read_time, int fuel_reading, int fuel_read_version,
		Car car) {
	super();
	this.fuel_read_id = fuel_read_id;
	this.fuel_read_date = fuel_read_date;
	this.fuel_read_time = fuel_read_time;
	this.fuel_reading = fuel_reading;
	this.fuel_read_version = fuel_read_version;
	this.car = car;
}

public int getFuel_read_id() {
	return fuel_read_id;
}
public void setFuel_read_id(int fuel_read_id) {
	this.fuel_read_id = fuel_read_id;
}
public Date getFuel_read_date() {
	return fuel_read_date;
}
public void setFuel_read_date(Date fuel_read_date) {
	this.fuel_read_date = fuel_read_date;
}
public Date getFuel_read_time() {
	return fuel_read_time;
}
public void setFuel_read_time(Date fuel_read_time) {
	this.fuel_read_time = fuel_read_time;
}
public int getFuel_reading() {
	return fuel_reading;
}
public void setFuel_reading(int fuel_reading) {
	this.fuel_reading = fuel_reading;
}
public int getFuel_read_version() {
	return fuel_read_version;
}
public void setFuel_read_version(int fuel_read_version) {
	this.fuel_read_version = fuel_read_version;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

}
