package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.payment.DemandDraft;
@Repository
public class DemandDraftDaoImpl implements DemandDraftDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(DemandDraft demanddraft) throws Exception {
		
		return (Integer)ht.save(demanddraft);
	}

	@Override
	public boolean update(DemandDraft demanddraft) throws Exception {
		ht.update(demanddraft);
		return true;
	}

	@Override
	public boolean delete(DemandDraft demanddraft) throws Exception {
		ht.delete(demanddraft);
		return true;
	}

	@Override
	public DemandDraft find(String id) throws Exception {
		
		return (DemandDraft)ht.get(DemandDraft.class, id);
	}

	@Override
	public List<DemandDraft> findAll() throws Exception {
		List<DemandDraft> list=ht.find("from DemandDraft");
		return list;
	}

}
