package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.vehiclemodel.FuelReading;
@Repository
public class FuelReadingDaoImpl implements FuelReadingDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(FuelReading fuelreading) throws Exception {
		
		return (Integer)ht.save(fuelreading);
	}

	@Override
	public boolean update(FuelReading fuelreading) throws Exception {
		ht.update(fuelreading);
		return true;
	}

	@Override
	public boolean delete(FuelReading fuelreading) throws Exception {
		ht.delete(fuelreading);
		return true;
	}

	@Override
	public FuelReading find(int id) throws Exception {
		
		return (FuelReading)ht.get(FuelReading.class, id);
	}

	@Override
	public List<FuelReading> findAll() throws Exception {
		List<FuelReading> list=ht.find("from FuelReading");
		return list;
	}

}
