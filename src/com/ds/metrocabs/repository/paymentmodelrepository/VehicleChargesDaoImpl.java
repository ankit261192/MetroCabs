package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.VehicleCharges;
@Repository
public class VehicleChargesDaoImpl implements VehicleChargesDao {
@Autowired
private HibernateTemplate ht;

	@Override
	public int save(VehicleCharges vehiclecharges) throws Exception {
		
		return (Integer)ht.save(vehiclecharges);
	}

	@Override
	public boolean update(VehicleCharges vehiclecharges) throws Exception {
		ht.update(vehiclecharges);
		return true;
	}

	@Override
	public boolean delete(VehicleCharges vehiclecharges) throws Exception {
		ht.delete(vehiclecharges);
		return true;
	}

	@Override
	public VehicleCharges find(int id) throws Exception {
		
		return (VehicleCharges)ht.get(VehicleCharges.class, id);
	}

	@Override
	public List<VehicleCharges> findAll() throws Exception {
		List<VehicleCharges>list=ht.find("from VehicleCharges");
		return null;
	}

}
