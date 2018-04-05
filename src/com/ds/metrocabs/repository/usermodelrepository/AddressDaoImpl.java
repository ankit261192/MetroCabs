package com.ds.metrocabs.repository.usermodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.usermodel.Address;
@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int save(Address address) throws Exception {
		
		return (Integer)ht.save(address);
	}

	@Override
	public boolean update(Address address) throws Exception {
		ht.update(address);
		return true;
	}

	@Override
	public boolean delete(Address address) throws Exception {
		ht.delete(address);
		return true;
	}

	@Override
	public Address find(int id) throws Exception {
		
		return ht.get(Address.class, id);
	}

	@Override
	public List<Address> findAll() throws Exception {
		List<Address> list=ht.find("from Address");
		return list;
	}

}
