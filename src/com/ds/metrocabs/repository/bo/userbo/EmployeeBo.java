package com.ds.metrocabs.repository.bo.userbo;

import java.util.List;

import com.ds.metrocabs.model.usermodel.Employee;
import com.ds.metrocabs.model.usermodel.User;

public interface EmployeeBo {
public int save(Employee employee) throws Exception;
public boolean delete(Employee employee) throws Exception;
public boolean update(Employee employee) throws Exception;
public User selectEmployee(int id) throws Exception;
public List<Employee> selectAllEmployee() throws Exception;
}
