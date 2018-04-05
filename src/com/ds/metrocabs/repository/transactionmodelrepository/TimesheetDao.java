package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.transaction.Timesheet;

public interface TimesheetDao {
	public int save(final Timesheet timesheet) throws Exception;
	public boolean update(final Timesheet timesheet) throws Exception;
	public boolean delete(final Timesheet timesheet) throws Exception;
	public Timesheet find(final int id) throws Exception;
	public List<Timesheet> findAll() throws Exception;
}
