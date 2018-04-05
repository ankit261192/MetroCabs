package com.ds.metrocabs.model.transaction;

import java.util.Date;

import com.ds.metrocabs.model.place.Location;
import com.ds.metrocabs.model.usermodel.User;
import com.ds.metrocabs.model.vehiclemodel.Car;

public class BookingRecord {
private int bookingid;
private Location source;
private Location destination;
private User user;
private Car car;
private Timesheet timesheet;
private Date date_of_journey;
private int distance;
private int no_of_passengers;
private byte driver_flag;
private byte confirm_flag;
public BookingRecord() {
	// TODO Auto-generated constructor stub
}

public BookingRecord(int bookingid, Location source, Location destination, User user, Car car, Timesheet timesheet,
		Date date_of_journey, int distance, int no_of_passengers, byte driver_flag, byte confirm_flag) {
	super();
	this.bookingid = bookingid;
	this.source = source;
	this.destination = destination;
	this.user = user;
	this.car = car;
	this.timesheet = timesheet;
	this.date_of_journey = date_of_journey;
	this.distance = distance;
	this.no_of_passengers = no_of_passengers;
	this.driver_flag = driver_flag;
	this.confirm_flag = confirm_flag;
}

public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public Location getSource() {
	return source;
}
public void setSource(Location source) {
	this.source = source;
}
public Location getDestination() {
	return destination;
}
public void setDestination(Location destination) {
	this.destination = destination;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Timesheet getTimesheet() {
	return timesheet;
}
public void setTimesheet(Timesheet timesheet) {
	this.timesheet = timesheet;
}
public Date getDate_of_journey() {
	return date_of_journey;
}
public void setDate_of_journey(Date date_of_journey) {
	this.date_of_journey = date_of_journey;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public int getNo_of_passengers() {
	return no_of_passengers;
}
public void setNo_of_passengers(int no_of_passengers) {
	this.no_of_passengers = no_of_passengers;
}
public byte getDriver_flag() {
	return driver_flag;
}
public void setDriver_flag(byte driver_flag) {
	this.driver_flag = driver_flag;
}
public byte getConfirm_flag() {
	return confirm_flag;
}
public void setConfirm_flag(byte confirm_flag) {
	this.confirm_flag = confirm_flag;
}

}
