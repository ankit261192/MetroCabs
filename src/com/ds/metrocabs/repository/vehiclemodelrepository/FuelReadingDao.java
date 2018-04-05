package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.vehiclemodel.FuelReading;

public interface FuelReadingDao {
	public int save(final FuelReading fuelreading) throws Exception;
	public boolean update(final FuelReading fuelreading) throws Exception;
	public boolean delete(final FuelReading fuelreading) throws Exception;
	public FuelReading find(final int id) throws Exception;
	public List<FuelReading> findAll() throws Exception;
}
