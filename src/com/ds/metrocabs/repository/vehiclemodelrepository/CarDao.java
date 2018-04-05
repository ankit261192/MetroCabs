package com.ds.metrocabs.repository.vehiclemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.vehiclemodel.Car;

public interface CarDao {
public int save(final Car car) throws Exception;
public boolean update(final Car car) throws Exception;
public boolean delete(final Car car) throws Exception;
public Car find(final int id) throws Exception;
public List<Car> findAll() throws Exception;

}
