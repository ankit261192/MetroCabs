package com.ds.metrocabs.model.payment;

public class InsuranceType {
private int insurance_typ_id;
private String insurance_typ_desc;
public InsuranceType() {
	// TODO Auto-generated constructor stub
}
public InsuranceType(int insurance_typ_id, String insurance_typ_desc) {
	super();
	this.insurance_typ_id = insurance_typ_id;
	this.insurance_typ_desc = insurance_typ_desc;
}
public int getInsurance_typ_id() {
	return insurance_typ_id;
}
public void setInsurance_typ_id(int insurance_typ_id) {
	this.insurance_typ_id = insurance_typ_id;
}
public String getInsurance_typ_desc() {
	return insurance_typ_desc;
}
public void setInsurance_typ_desc(String insurance_typ_desc) {
	this.insurance_typ_desc = insurance_typ_desc;
}

}
