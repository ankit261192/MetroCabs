package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.Insurance;
@Repository
public class InsuranceDaoImpl implements InsuranceDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Insurance insurance) throws Exception {
	
		return (Integer)ht.save(insurance);
	}

	@Override
	public boolean update(Insurance insurance) throws Exception {
		ht.update(insurance);
		return true;
	}

	@Override
	public boolean delete(Insurance insurance) throws Exception {
		ht.delete(insurance);
		return true;
	}

	@Override
	public Insurance find(int id) throws Exception {
		
		return (Insurance)ht.get(Insurance.class, id) ;
	}

	@Override
	public List<Insurance> findAll() throws Exception {
		List<Insurance> list=ht.find("from Insurance");
		return list;
	}

}
