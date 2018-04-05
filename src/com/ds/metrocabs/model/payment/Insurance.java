package com.ds.metrocabs.model.payment;

import java.util.Date;

import com.ds.metrocabs.model.vehiclemodel.Car;

public class Insurance {
private int insurance_id;
private Car car;//many to one
private String company_name;
private double amount;
private Date date_of_insurance;
private Date renewal_date;
private int version;
private InsuranceType insurance_typ;//many to one
public Insurance() {
	// TODO Auto-generated constructor stub
}
public Insurance(int insurance_id, Car car, String company_name, double amount, Date date_of_insurance,
		Date renewal_date, int version, InsuranceType insurance_typ) {
	super();
	this.insurance_id = insurance_id;
	this.car = car;
	this.company_name = company_name;
	this.amount = amount;
	this.date_of_insurance = date_of_insurance;
	this.renewal_date = renewal_date;
	this.version = version;
	this.insurance_typ = insurance_typ;
}
public int getInsurance_id() {
	return insurance_id;
}
public void setInsurance_id(int insurance_id) {
	this.insurance_id = insurance_id;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Date getDate_of_insurance() {
	return date_of_insurance;
}
public void setDate_of_insurance(Date date_of_insurance) {
	this.date_of_insurance = date_of_insurance;
}
public Date getRenewal_date() {
	return renewal_date;
}
public void setRenewal_date(Date renewal_date) {
	this.renewal_date = renewal_date;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
public InsuranceType getInsurance_typ() {
	return insurance_typ;
}
public void setInsurance_typ(InsuranceType insurance_typ) {
	this.insurance_typ = insurance_typ;
}

}
