package com.ds.metrocabs.model.vehiclemodel;

public class FuelType {
private int fuel_typ_id;
private String fuel_typ_name;
private String fuel_typ_desc;
public FuelType() {
	// TODO Auto-generated constructor stub
}
public FuelType(int fuel_typ_id, String fuel_typ_name, String fuel_typ_desc) {
	super();
	this.fuel_typ_id = fuel_typ_id;
	this.fuel_typ_name = fuel_typ_name;
	this.fuel_typ_desc = fuel_typ_desc;
}
public int getFuel_typ_id() {
	return fuel_typ_id;
}
public void setFuel_typ_id(int fuel_typ_id) {
	this.fuel_typ_id = fuel_typ_id;
}
public String getFuel_typ_name() {
	return fuel_typ_name;
}
public void setFuel_typ_name(String fuel_typ_name) {
	this.fuel_typ_name = fuel_typ_name;
}
public String getFuel_typ_desc() {
	return fuel_typ_desc;
}
public void setFuel_typ_desc(String fuel_typ_desc) {
	this.fuel_typ_desc = fuel_typ_desc;
}

}
