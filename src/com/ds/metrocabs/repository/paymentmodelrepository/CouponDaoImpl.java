package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.Coupon;
@Repository
public class CouponDaoImpl implements CouponDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Coupon coupon) throws Exception {
		
		return (Integer)ht.save(coupon);
	}

	@Override
	public boolean update(Coupon coupon) throws Exception {
		ht.update(coupon);
		return true;
	}

	@Override
	public boolean delete(Coupon coupon) throws Exception {
		ht.delete(coupon);
		return true;
	}

	@Override
	public Coupon find(int id) throws Exception {
		
		return (Coupon)ht.get(Coupon.class, id);
	}

	@Override
	public List<Coupon> findAll() throws Exception {
		List<Coupon> list=ht.find("from Coupon");
		return list;
	}

}
