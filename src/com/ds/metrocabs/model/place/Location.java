package com.ds.metrocabs.model.place;

public class Location {
private int location_id;
private String street;
private String city;
private String state;
private String pin;
public Location() {
	// TODO Auto-generated constructor stub
}
public Location(int location_id, String street, String city, String state, String pin) {
	super();
	this.location_id = location_id;
	this.street = street;
	this.city = city;
	this.state = state;
	this.pin = pin;
}
public int getLocation_id() {
	return location_id;
}
public void setLocation_id(int location_id) {
	this.location_id = location_id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}



}
