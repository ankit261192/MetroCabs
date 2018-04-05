package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.vehiclemodel.SpeedometerReading;
@Repository
public class SpeedometerReadingDaoImpl implements SpeedometerReadingDao {
@Autowired
private HibernateTemplate ht;

	@Override
	public int save(SpeedometerReading speedometerreading) throws Exception {
		
		return (Integer)ht.save(speedometerreading);
	}

	@Override
	public boolean update(SpeedometerReading speedometerreading) throws Exception {
		ht.update(speedometerreading);
		return true;
	}

	@Override
	public boolean delete(SpeedometerReading speedometerreading) throws Exception {
		ht.delete(speedometerreading);
		return true;
	}

	@Override
	public SpeedometerReading find(int id) throws Exception {
		
		return (SpeedometerReading)ht.get(SpeedometerReading.class, id);
	}

	@Override
	public List<SpeedometerReading> findAll() throws Exception {
		List<SpeedometerReading> list=ht.find("from SpeedometerReading");
		return list;
	}

}
