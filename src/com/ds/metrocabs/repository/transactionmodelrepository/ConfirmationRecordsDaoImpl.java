package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.transaction.ConfirmationRecords;
@Repository
public class ConfirmationRecordsDaoImpl implements ConfirmationRecordsDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(ConfirmationRecords confirmationrecord) throws Exception {
		
		return (Integer)ht.save(confirmationrecord);
	}

	@Override
	public boolean update(ConfirmationRecords confirmationrecord) throws Exception {
		ht.update(confirmationrecord);
		return true;
	}

	@Override
	public boolean delete(ConfirmationRecords confirmationrecord) throws Exception {
		ht.delete(confirmationrecord);
		return true;
	}

	@Override
	public ConfirmationRecords find(int id) throws Exception {
		
		return (ConfirmationRecords)ht.get(ConfirmationRecords.class, id);
	}

	@Override
	public List<ConfirmationRecords> findAll() throws Exception {
		List<ConfirmationRecords> list=ht.find("from ConfirmationRecords");
		return list;
	}

}
