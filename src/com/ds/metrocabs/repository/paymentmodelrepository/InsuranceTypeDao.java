package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.InsuranceType;

public interface InsuranceTypeDao {
public int save(final InsuranceType insurancetype) throws Exception;
public boolean update(final InsuranceType insurancetype) throws Exception;
public boolean delete(final InsuranceType insurancetype) throws Exception;
public InsuranceType find(final int id) throws Exception;
public List<InsuranceType> findAll() throws Exception;
}
