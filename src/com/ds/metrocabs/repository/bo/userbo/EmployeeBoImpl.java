package com.ds.metrocabs.repository.bo.userbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.metrocabs.model.usermodel.Employee;
import com.ds.metrocabs.model.usermodel.User;
import com.ds.metrocabs.repository.usermodelrepository.EmployeeDao;
@Service
@Transactional
public class EmployeeBoImpl implements EmployeeBo {
@Autowired
private EmployeeDao dao;
	@Override
	public int save(Employee employee) throws Exception {
	
		return dao.save(employee);
	}

	@Override
	public boolean delete(Employee employee) throws Exception {
		dao.delete(employee);
		return true;
	}

	@Override
	public boolean update(Employee employee) throws Exception {
		dao.update(employee);
		return true;
	}

	@Override
	public User selectEmployee(int id) throws Exception {
		
		return dao.find(id);
	}

	@Override
	public List<Employee> selectAllEmployee() throws Exception {
		
		return dao.findAll();
	}

}
