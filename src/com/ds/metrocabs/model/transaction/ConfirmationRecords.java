package com.ds.metrocabs.model.transaction;

import com.ds.metrocabs.model.payment.Payment;

public class ConfirmationRecords {

	//for confirm,cancellation and return
	private int ccr_id;
	private BookingRecord booking_record;//one to one
	private Payment payment;//many to one
	//for confirm value=1,cancellation value=2 and return value=3 flag value
	private byte ccr_flag;
	 public ConfirmationRecords() {
		// TODO Auto-generated constructor stub
	}
	public ConfirmationRecords(int ccr_id, BookingRecord booking_record, Payment payment, byte ccr_flag) {
		super();
		this.ccr_id = ccr_id;
		this.booking_record = booking_record;
		this.payment = payment;
		this.ccr_flag = ccr_flag;
	}
	public int getCcr_id() {
		return ccr_id;
	}
	public void setCcr_id(int ccr_id) {
		this.ccr_id = ccr_id;
	}
	public BookingRecord getBooking_record() {
		return booking_record;
	}
	public void setBooking_record(BookingRecord booking_record) {
		this.booking_record = booking_record;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public byte getCcr_flag() {
		return ccr_flag;
	}
	public void setCcr_flag(byte ccr_flag) {
		this.ccr_flag = ccr_flag;
	}
	 
}
