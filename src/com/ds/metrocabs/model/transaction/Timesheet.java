package com.ds.metrocabs.model.transaction;

import java.sql.Timestamp;
import java.util.Date;

public class Timesheet {

	private int timesheet_id;
	private Date from_time;
	private Date to_time;
	private Date from_date;
	private Date to_date;
	public Timesheet() {
		// TODO Auto-generated constructor stub
	}
	public Timesheet(int timesheet_id, Date from_time, Date to_time, Date from_date, Date to_date) {
		super();
		this.timesheet_id = timesheet_id;
		this.from_time = from_time;
		this.to_time = to_time;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	public int getTimesheet_id() {
		return timesheet_id;
	}
	public void setTimesheet_id(int timesheet_id) {
		this.timesheet_id = timesheet_id;
	}
	public Date getFrom_time() {
		return from_time;
	}
	public void setFrom_time(Date from_time) {
		this.from_time = from_time;
	}
	public Date getTo_time() {
		return to_time;
	}
	public void setTo_time(Date to_time) {
		this.to_time = to_time;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	
}
