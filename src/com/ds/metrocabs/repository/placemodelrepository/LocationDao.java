package com.ds.metrocabs.repository.placemodelrepository;

import java.util.List;

import com.ds.metrocabs.model.place.Location;

public interface LocationDao {
	public int save(final Location location) throws Exception;
	public boolean update(final Location location ) throws Exception;
	public boolean delete(final Location location) throws Exception;
	public Location find(final int id) throws Exception;
	public List<Location> findAll() throws Exception;
}
