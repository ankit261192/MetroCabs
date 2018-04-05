package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.DriverCharges;

public interface DriverChargesDao {
public int save(final DriverCharges drivercharges) throws Exception;
public boolean update(final DriverCharges drivercharges) throws Exception;
public boolean delete(final DriverCharges drivercharges) throws Exception;
public DriverCharges find(final int id) throws Exception;
public List<DriverCharges> findAll() throws Exception;
}
