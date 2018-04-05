package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.PaymentType;
@Repository
public class PaymentTypeDaoImpl implements PaymentTypeDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(PaymentType paymenttype) throws Exception {
		
		return (Integer)ht.save(paymenttype);
	}

	@Override
	public boolean update(PaymentType paymenttype) throws Exception {
		ht.update(paymenttype);
		return true;
	}

	@Override
	public boolean delete(PaymentType paymenttype) throws Exception {
		ht.delete(paymenttype);
		return true;
	}

	@Override
	public PaymentType find(int id) throws Exception {
		
		return (PaymentType)ht.get(PaymentType.class, id);
	}

	@Override
	public List<PaymentType> findAll() throws Exception {
		List<PaymentType> list=ht.find("from PaymentType");
		return list;
	}

}
