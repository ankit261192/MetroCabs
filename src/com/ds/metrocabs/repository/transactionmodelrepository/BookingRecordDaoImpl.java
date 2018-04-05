package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.transaction.BookingRecord;
@Repository
public class BookingRecordDaoImpl implements BookingRecordDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(BookingRecord bookingrecord) throws Exception {
		
		return (Integer)ht.save(bookingrecord);
	}

	@Override
	public boolean update(BookingRecord bookingrecord) throws Exception {
		ht.update(bookingrecord);
		return true;
	}

	@Override
	public boolean delete(BookingRecord bookingrecord) throws Exception {
		ht.delete(bookingrecord);
		return true;
	}

	@Override
	public BookingRecord find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (BookingRecord)ht.get(BookingRecord.class, id);
	}

	@Override
	public List<BookingRecord> findAll() throws Exception {
		List<BookingRecord> list=ht.find("from BookingRecord");
		return list;
	}

}
