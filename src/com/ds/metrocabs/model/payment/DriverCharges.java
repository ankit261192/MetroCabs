package com.ds.metrocabs.model.payment;

import java.util.Date;

public class DriverCharges {
private int driver_ch_id;
private double hr_ch_per_day;
private double ch_per_night;
private double ch_per_day;
private double ch_per_week;
private double ch_per_month;
private double wait_ch_per_min;
public DriverCharges() {
	// TODO Auto-generated constructor stub
}
public DriverCharges(int driver_ch_id, double hr_ch_per_day, double ch_per_night, double ch_per_day, double ch_per_week,
		double ch_per_month, double wait_ch_per_min) {
	super();
	this.driver_ch_id = driver_ch_id;
	this.hr_ch_per_day = hr_ch_per_day;
	this.ch_per_night = ch_per_night;
	this.ch_per_day = ch_per_day;
	this.ch_per_week = ch_per_week;
	this.ch_per_month = ch_per_month;
	this.wait_ch_per_min = wait_ch_per_min;
}
public int getDriver_ch_id() {
	return driver_ch_id;
}
public void setDriver_ch_id(int driver_ch_id) {
	this.driver_ch_id = driver_ch_id;
}
public double getHr_ch_per_day() {
	return hr_ch_per_day;
}
public void setHr_ch_per_day(double hr_ch_per_day) {
	this.hr_ch_per_day = hr_ch_per_day;
}
public double getCh_per_night() {
	return ch_per_night;
}
public void setCh_per_night(double ch_per_night) {
	this.ch_per_night = ch_per_night;
}
public double getCh_per_day() {
	return ch_per_day;
}
public void setCh_per_day(double ch_per_day) {
	this.ch_per_day = ch_per_day;
}
public double getCh_per_week() {
	return ch_per_week;
}
public void setCh_per_week(double ch_per_week) {
	this.ch_per_week = ch_per_week;
}
public double getCh_per_month() {
	return ch_per_month;
}
public void setCh_per_month(double ch_per_month) {
	this.ch_per_month = ch_per_month;
}
public double getWait_ch_per_min() {
	return wait_ch_per_min;
}
public void setWait_ch_per_min(double wait_ch_per_min) {
	this.wait_ch_per_min = wait_ch_per_min;
}

}
