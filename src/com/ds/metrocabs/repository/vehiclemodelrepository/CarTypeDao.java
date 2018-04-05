package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.vehiclemodel.CarType;

public interface CarTypeDao {
	public int save(final CarType cartype) throws Exception;
	public boolean update(final CarType cartype) throws Exception;
	public boolean delete(final CarType cartype) throws Exception;
	public CarType find(final int id) throws Exception;
	public List<CarType> findAll() throws Exception;
}
