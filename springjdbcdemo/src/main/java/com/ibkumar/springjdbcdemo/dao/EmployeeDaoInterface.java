package com.ibkumar.springjdbcdemo.dao;

import java.util.List;

public interface EmployeeDaoInterface {

	public int save(Employee obj);
	public int update(Employee obj);
	public int delete(int empId);
	public Employee fetchEmployeeById(int empId);
	public List<Employee> fetchAllEmployee();
	
	
}
