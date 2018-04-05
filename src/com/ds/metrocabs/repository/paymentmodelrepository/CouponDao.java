package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.Coupon;

public interface CouponDao {
public int save(final Coupon coupon) throws Exception;
public boolean update(final Coupon coupon) throws Exception;
public boolean delete(final Coupon coupon) throws Exception;
public Coupon find(final int id) throws Exception;
public List<Coupon> findAll() throws Exception;
}
