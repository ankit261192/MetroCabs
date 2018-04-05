package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.transaction.Timesheet;
@Repository
public class TimesheetDaoImpl implements TimesheetDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Timesheet timesheet) throws Exception {
		
		return (Integer)ht.save(timesheet);
	}

	@Override
	public boolean update(Timesheet timesheet) throws Exception {
		ht.update(timesheet);
		return true;
	}

	@Override
	public boolean delete(Timesheet timesheet) throws Exception {
		ht.delete(timesheet);
		return true;
	}

	@Override
	public Timesheet find(int id) throws Exception {
		
		return (Timesheet)ht.get(Timesheet.class, id);
	}

	@Override
	public List<Timesheet> findAll() throws Exception {
		List<Timesheet> list=ht.find("from Timesheet");
		return list;
	}

}
