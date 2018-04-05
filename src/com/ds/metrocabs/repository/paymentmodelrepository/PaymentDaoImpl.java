package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.Payment;
@Repository
public class PaymentDaoImpl implements PaymentDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Payment payment) throws Exception {
		
		return (Integer)ht.save(payment);
	}

	@Override
	public boolean update(Payment payment) throws Exception {
		ht.update(payment);
		return true;
	}

	@Override
	public boolean delete(Payment payment) throws Exception {
		ht.delete(payment);
		return true;
	}

	@Override
	public Payment find(int id) throws Exception {
		
		return (Payment)ht.get(Payment.class, id);
	}

	@Override
	public List<Payment> findAll() throws Exception {
		List<Payment> list=ht.find("from Payment");
		return list;
	}

}
