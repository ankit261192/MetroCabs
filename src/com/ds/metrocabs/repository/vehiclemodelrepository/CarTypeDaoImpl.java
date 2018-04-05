package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.vehiclemodel.CarType;
@Repository
public class CarTypeDaoImpl implements CarTypeDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(CarType cartype) throws Exception {
		// TODO Auto-generated method stub
		return (Integer)ht.save(cartype);
	}

	@Override
	public boolean update(CarType cartype) throws Exception {
		ht.update(cartype);
		return true;
	}

	@Override
	public boolean delete(CarType cartype) throws Exception {
		ht.delete(cartype);
		return true;
	}

	@Override
	public CarType find(int id) throws Exception {
		
		return (CarType)ht.get(CarType.class, id);
	}

	@Override
	public List<CarType> findAll() throws Exception {
		List<CarType> list=ht.find("from CarType");
		return list;
	}

}
