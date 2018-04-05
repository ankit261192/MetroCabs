package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.vehiclemodel.FuelType;
@Repository
public class FuelTypeDaoImpl implements FuelTypeDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(FuelType fueltype) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(fueltype);
	}

	@Override
	public boolean update(FuelType fueltype) throws Exception {
		ht.update(fueltype);	
		return true;
	}

	@Override
	public boolean delete(FuelType fueltype) throws Exception {
		ht.delete(fueltype);
		return true;
	}

	@Override
	public FuelType find(int id) throws Exception {
		// TODO Auto-generated method stub
		return (FuelType)ht.get(FuelType.class, id);
	}

	@Override
	public List<FuelType> findAll() throws Exception {
		List<FuelType> list=ht.find("from FuelType");
		return list;
	}

}
