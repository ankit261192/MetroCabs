package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.DriverCharges;

@Repository
public class DriverChargesDaoImpl implements DriverChargesDao {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int save(DriverCharges drivercharges) throws Exception {
		
		return (Integer)ht.save(drivercharges);
	}

	@Override
	public boolean update(DriverCharges drivercharges) throws Exception {
		ht.update(drivercharges);
		return true;
	}

	@Override
	public boolean delete(DriverCharges drivercharges) throws Exception {
		ht.delete(drivercharges);
		return true;
	}

	@Override
	public DriverCharges find(int id) throws Exception {
		
		return (DriverCharges)ht.get(DriverCharges.class, id);
	}

	@Override
	public List<DriverCharges> findAll() throws Exception {
		List<DriverCharges> list=ht.find("from DriverCharges");
		return list;
	}

}
