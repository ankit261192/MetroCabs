package com.ds.metrocabs.repository.placemodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.place.Location;
@Repository
public class LocationDaoImpl implements LocationDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(Location location) throws Exception {
		
		return (Integer)ht.save(location);
	}

	@Override
	public boolean update(Location location) throws Exception {
		ht.update(location);
		return true;
	}

	@Override
	public boolean delete(Location location) throws Exception {
		ht.delete(location);
		return true;
	}

	@Override
	public Location find(int id) throws Exception {
		
		return (Location)ht.get(Location.class, id);
	}

	@Override
	public List<Location> findAll() throws Exception {
		List<Location> list=ht.find("from Location");
		return list;
	}

}
