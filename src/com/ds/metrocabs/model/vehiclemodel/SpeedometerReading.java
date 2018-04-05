package com.ds.metrocabs.model.vehiclemodel;

import java.util.Date;

public class SpeedometerReading {
private int speedo_id;
private Car car;//many to one
private Date sp_read_date;
private Date sp_read_time;
private int Speedo_reading;
private int speedo_version;
public SpeedometerReading() {
	// TODO Auto-generated constructor stub
}
public SpeedometerReading(int speedo_id, Car car, Date sp_read_date, Date sp_read_time, int speedo_reading,
		int speedo_version) {
	super();
	this.speedo_id = speedo_id;
	this.car = car;
	this.sp_read_date = sp_read_date;
	this.sp_read_time = sp_read_time;
	Speedo_reading = speedo_reading;
	this.speedo_version = speedo_version;
}
public int getSpeedo_id() {
	return speedo_id;
}
public void setSpeedo_id(int speedo_id) {
	this.speedo_id = speedo_id;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Date getSp_read_date() {
	return sp_read_date;
}
public void setSp_read_date(Date sp_read_date) {
	this.sp_read_date = sp_read_date;
}
public Date getSp_read_time() {
	return sp_read_time;
}
public void setSp_read_time(Date sp_read_time) {
	this.sp_read_time = sp_read_time;
}
public int getSpeedo_reading() {
	return Speedo_reading;
}
public void setSpeedo_reading(int speedo_reading) {
	Speedo_reading = speedo_reading;
}
public int getSpeedo_version() {
	return speedo_version;
}
public void setSpeedo_version(int speedo_version) {
	this.speedo_version = speedo_version;
}

}
