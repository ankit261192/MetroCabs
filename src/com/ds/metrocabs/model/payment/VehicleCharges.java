package com.ds.metrocabs.model.payment;

import java.util.Date;

import com.ds.metrocabs.model.vehiclemodel.CarType;



public class VehicleCharges {
private int vehicle_charge_id;
private CarType car_type;
private int hr_chg_per_day;
private int hr_chg_per_night;
private int day_charge;
private int night_charge;
private int week_charge;
private int month_charge;
private Date wait_ch_p_min;
private Date extra_per_km;
public VehicleCharges() {
	// TODO Auto-generated constructor stub
}
public VehicleCharges(int vehicle_charge_id, CarType car_type, int hr_chg_per_day, int hr_chg_per_night, int day_charge,
		int night_charge, int week_charge, int month_charge, Date wait_ch_p_min, Date extra_per_km) {
	super();
	this.vehicle_charge_id = vehicle_charge_id;
	this.car_type = car_type;
	this.hr_chg_per_day = hr_chg_per_day;
	this.hr_chg_per_night = hr_chg_per_night;
	this.day_charge = day_charge;
	this.night_charge = night_charge;
	this.week_charge = week_charge;
	this.month_charge = month_charge;
	this.wait_ch_p_min = wait_ch_p_min;
	this.extra_per_km = extra_per_km;
}
public int getVehicle_charge_id() {
	return vehicle_charge_id;
}
public void setVehicle_charge_id(int vehicle_charge_id) {
	this.vehicle_charge_id = vehicle_charge_id;
}
public CarType getCar_type() {
	return car_type;
}
public void setCar_type(CarType car_type) {
	this.car_type = car_type;
}
public int getHr_chg_per_day() {
	return hr_chg_per_day;
}
public void setHr_chg_per_day(int hr_chg_per_day) {
	this.hr_chg_per_day = hr_chg_per_day;
}
public int getHr_chg_per_night() {
	return hr_chg_per_night;
}
public void setHr_chg_per_night(int hr_chg_per_night) {
	this.hr_chg_per_night = hr_chg_per_night;
}
public int getDay_charge() {
	return day_charge;
}
public void setDay_charge(int day_charge) {
	this.day_charge = day_charge;
}
public int getNight_charge() {
	return night_charge;
}
public void setNight_charge(int night_charge) {
	this.night_charge = night_charge;
}
public int getWeek_charge() {
	return week_charge;
}
public void setWeek_charge(int week_charge) {
	this.week_charge = week_charge;
}
public int getMonth_charge() {
	return month_charge;
}
public void setMonth_charge(int month_charge) {
	this.month_charge = month_charge;
}
public Date getWait_ch_p_min() {
	return wait_ch_p_min;
}
public void setWait_ch_p_min(Date wait_ch_p_min) {
	this.wait_ch_p_min = wait_ch_p_min;
}
public Date getExtra_per_km() {
	return extra_per_km;
}
public void setExtra_per_km(Date extra_per_km) {
	this.extra_per_km = extra_per_km;
}

}
