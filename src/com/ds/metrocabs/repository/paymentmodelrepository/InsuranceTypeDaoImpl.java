package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.InsuranceType;
@Repository
public class InsuranceTypeDaoImpl implements InsuranceTypeDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(InsuranceType insurancetype) throws Exception {
		
		return (Integer)ht.save(insurancetype);
	}

	@Override
	public boolean update(InsuranceType insurancetype) throws Exception {
		ht.update(insurancetype);
		return true;
	}

	@Override
	public boolean delete(InsuranceType insurancetype) throws Exception {
		ht.delete(insurancetype);
		return true;
	}

	@Override
	public InsuranceType find(int id) throws Exception {
		
		return (InsuranceType)ht.get(InsuranceType.class, id);
	}

	@Override
	public List<InsuranceType> findAll() throws Exception {
		List<InsuranceType> list=ht.find("from InsuranceType");
		return null;
	}

}
