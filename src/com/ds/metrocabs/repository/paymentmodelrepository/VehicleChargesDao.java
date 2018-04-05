package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.VehicleCharges;

public interface VehicleChargesDao {
	public int save(final VehicleCharges vehiclecharges) throws Exception;
	public boolean update(final VehicleCharges vehiclecharges) throws Exception;
	public boolean delete(final VehicleCharges vehiclecharges) throws Exception;
	public VehicleCharges find(final int id) throws Exception;
	public List<VehicleCharges> findAll() throws Exception;
}
