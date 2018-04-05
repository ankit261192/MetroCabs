package com.ds.metrocabs.repository.placemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.place.Branch;
@Repository
public class BranchDaoImpl implements BranchDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Branch branch) throws Exception {
		
		return (Integer)ht.save(branch);
	}

	@Override
	public boolean update(Branch branch) throws Exception {
		ht.update(branch);
		return true;
	}

	@Override
	public boolean delete(Branch branch) throws Exception {
		ht.delete(branch);
		return true;
	}

	@Override
	public Branch find(int id) throws Exception {
		
		return (Branch)ht.get(Branch.class, id);
	}

	@Override
	public List<Branch> findAll() throws Exception {
		List<Branch> list=ht.find("from Branch");
		return list;
	}

}
