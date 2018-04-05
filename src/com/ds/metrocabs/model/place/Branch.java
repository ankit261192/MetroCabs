package com.ds.metrocabs.model.place;

public class Branch {
private int branchid;
private String location_name;
private String contact;
private String fax_no;
public Branch() {
	// TODO Auto-generated constructor stub
}
public Branch(int branchid, String location_name, String contact, String fax_no) {
	super();
	this.branchid = branchid;
	this.location_name = location_name;
	this.contact = contact;
	this.fax_no = fax_no;
}
public int getBranchid() {
	return branchid;
}
public void setBranchid(int branchid) {
	this.branchid = branchid;
}
public String getLocation_name() {
	return location_name;
}
public void setLocation_name(String location_name) {
	this.location_name = location_name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getFax_no() {
	return fax_no;
}
public void setFax_no(String fax_no) {
	this.fax_no = fax_no;
}


}
