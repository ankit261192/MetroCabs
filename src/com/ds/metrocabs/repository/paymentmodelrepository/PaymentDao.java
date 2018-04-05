package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.Payment;

public interface PaymentDao {
	public int save(final Payment payment) throws Exception;
	public boolean update(final Payment payment ) throws Exception;
	public boolean delete(final Payment payment ) throws Exception;
	public Payment find(final int id) throws Exception;
	public List<Payment> findAll() throws Exception;
}
