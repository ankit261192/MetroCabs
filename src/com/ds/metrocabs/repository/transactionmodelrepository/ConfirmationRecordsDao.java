package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.transaction.ConfirmationRecords;

public interface ConfirmationRecordsDao {
	public int save(final ConfirmationRecords confirmationrecord) throws Exception;
	public boolean update(final ConfirmationRecords confirmationrecord) throws Exception;
	public boolean delete(final ConfirmationRecords confirmationrecord) throws Exception;
	public ConfirmationRecords find(final int id) throws Exception;
	public List<ConfirmationRecords> findAll() throws Exception;
}
