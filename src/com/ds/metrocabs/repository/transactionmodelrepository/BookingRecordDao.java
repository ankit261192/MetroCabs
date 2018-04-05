package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.transaction.BookingRecord;

public interface BookingRecordDao {
	public int save(final BookingRecord bookingrecord) throws Exception;
	public boolean update(final BookingRecord bookingrecord) throws Exception;
	public boolean delete(final BookingRecord bookingrecord) throws Exception;
	public BookingRecord find(final int id) throws Exception;
	public List<BookingRecord> findAll() throws Exception;
}
