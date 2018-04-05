package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.PaymentType;

public interface PaymentTypeDao {
	public int save(final PaymentType paymenttype) throws Exception;
	public boolean update(final PaymentType paymenttype) throws Exception;
	public boolean delete(final PaymentType paymenttype) throws Exception;
	public PaymentType find(final int id) throws Exception;
	public List<PaymentType> findAll() throws Exception;
}
