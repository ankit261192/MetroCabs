package com.ds.metrocabs.model.payment;

public class PaymentType {

	private int pay_typ_id;
	private String pay_typ_desc;
	public PaymentType() {
		// TODO Auto-generated constructor stub
	}
	public PaymentType(int pay_typ_id, String pay_typ_desc) {
		super();
		this.pay_typ_id = pay_typ_id;
		this.pay_typ_desc = pay_typ_desc;
	}
	public int getPay_typ_id() {
		return pay_typ_id;
	}
	public void setPay_typ_id(int pay_typ_id) {
		this.pay_typ_id = pay_typ_id;
	}
	public String getPay_typ_desc() {
		return pay_typ_desc;
	}
	public void setPay_typ_desc(String pay_typ_desc) {
		this.pay_typ_desc = pay_typ_desc;
	}
		
}
