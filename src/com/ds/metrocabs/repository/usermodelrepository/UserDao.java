package com.ds.metrocabs.repository.usermodelrepository;

import java.util.List;

import com.ds.metrocabs.model.usermodel.User;

public interface UserDao {
	//it will return p.k. value after save.making arguments final so that they cannot be changed inside Daoimpl class 
public int save(final User user) throws Exception;
//it will return boolean value after update
public boolean update(final User user) throws Exception;
//it will return boolean value after delete
public boolean delete(final User user) throws Exception;
//it will return user object when we pass p.k. make sure to make argument type as string for tables where p.k. is String
public User find(final int id) throws Exception;
//it will return entire list of users
public List<User> findAll() throws Exception;
}
