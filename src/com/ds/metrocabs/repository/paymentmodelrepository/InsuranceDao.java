package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.Insurance;

public interface InsuranceDao {
public int save(final Insurance insurance) throws Exception;
public boolean update(final Insurance insurance) throws Exception;
public boolean delete(final Insurance insurance) throws Exception;
public Insurance find(final int id) throws Exception;
public List<Insurance> findAll() throws Exception;
}
