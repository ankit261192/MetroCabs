package com.ds.metrocabs.repository.bo.userbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.metrocabs.model.usermodel.User;
import com.ds.metrocabs.repository.usermodelrepository.UserDao;

@Service
@Transactional
public class EndUserBoImpl implements EndUserBo {

	/**
	 * business class has dependency on dao class.hence,creating object
	 * always use interface reference for loose coupling
	 */
	@Autowired
	private UserDao dao;
	@Override
	public int createUser(User user) throws Exception {
		
		return dao.save(user);
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		dao.update(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) throws Exception {
		dao.delete(user);
		return true;
	}

	@Override
	/**
	 * readonly =true because it is just DRL operation
	 * even if dao tries to update or delte internally ,it will not be supported
	 */
	@Transactional(readOnly=true)
	public User selectUser(int id) throws Exception {
		
		return dao.find(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> selectAllUser() throws Exception {
		
		return dao.findAll();
	}

}
