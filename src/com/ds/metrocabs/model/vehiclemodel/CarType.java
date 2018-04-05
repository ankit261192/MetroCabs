package com.ds.metrocabs.model.vehiclemodel;

public class CarType {
private int car_typ_id;
private String car_typ_name;
private String car_typ_desc;
public CarType() {
	// TODO Auto-generated constructor stub
}
public CarType(int car_typ_id, String car_typ_name, String car_typ_desc) {
	super();
	this.car_typ_id = car_typ_id;
	this.car_typ_name = car_typ_name;
	this.car_typ_desc = car_typ_desc;
}
public int getCar_typ_id() {
	return car_typ_id;
}
public void setCar_typ_id(int car_typ_id) {
	this.car_typ_id = car_typ_id;
}
public String getCar_typ_name() {
	return car_typ_name;
}
public void setCar_typ_name(String car_typ_name) {
	this.car_typ_name = car_typ_name;
}
public String getCar_typ_desc() {
	return car_typ_desc;
}
public void setCar_typ_desc(String car_typ_desc) {
	this.car_typ_desc = car_typ_desc;
}

}
