package com.ds.metrocabs.model.usermodel;

public class Driver extends Employee {
	private String licenseno;

	public String getLicenseno() {
		return licenseno;
	}

	public void setLicenseno(String licenseno) {
		this.licenseno = licenseno;
	}
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(String licenseno) {
		super();
		this.licenseno = licenseno;
	}
	
}

