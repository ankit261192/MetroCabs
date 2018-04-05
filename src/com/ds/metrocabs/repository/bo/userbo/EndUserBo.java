package com.ds.metrocabs.repository.bo.userbo;

import java.util.List;

import com.ds.metrocabs.model.usermodel.User;

public interface EndUserBo {

	public int createUser(User user) throws Exception;
	public boolean updateUser(User user) throws Exception;
	public boolean deleteUser(User user) throws Exception;
	public User selectUser(int id) throws Exception;
	public List<User> selectAllUser() throws Exception;
}
