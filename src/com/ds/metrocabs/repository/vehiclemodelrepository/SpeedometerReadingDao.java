package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.vehiclemodel.SpeedometerReading;

public interface SpeedometerReadingDao {
public int save(final SpeedometerReading speedometerreading) throws Exception;
public boolean update(final SpeedometerReading speedometerreading) throws Exception;
public boolean delete(final SpeedometerReading speedometerreading) throws Exception;
public SpeedometerReading find(final int id) throws Exception;
public List<SpeedometerReading> findAll() throws Exception;
}
