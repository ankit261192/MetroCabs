package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.vehiclemodel.FuelType;

public interface FuelTypeDao {
	public int save(final FuelType fueltype) throws Exception;
	public boolean update(final FuelType fueltype) throws Exception;
	public boolean delete(final FuelType fueltype) throws Exception;
	public FuelType find(final int id) throws Exception;
	public List<FuelType>findAll() throws Exception;
	
}
