package com.ibkumar.springjdbcdemo.dao;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDao implements EmployeeDaoInterface {

	private JdbcTemplate template;
	public int save(Employee obj) {
		// insert employee record
		String query1 = "insert into employee values(?,?,?)";
		int row = template.update(query1,obj.getEmpId(), obj.getEmpName(),obj.getDept());
		return row;
	}
	public int update(Employee obj) {
		// update record
		String query2 = "update employee set dept=? where empId=?";
		int row = template.update(query2,obj.getDept(),obj.getEmpId());
		return row;
	}
	public int delete(int empId) {
		// delete record
		String query3 = "delete from employee where empId=?";
		int row = template.update(query3,empId);
		return row;
		
	}
	public Employee fetchEmployeeById(int empId) throws EmptyResultDataAccessException{
		
		String query = "select empId, empName,dept from employee where empId=?";
		Employee obj =	template.queryForObject(query, new MyRowMapper(),empId);
		return obj;
	}
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public List<Employee> fetchAllEmployee() {
		// TODO Auto-generated method stub
		String query = "select empId, empName,dept from employee";
		List<Employee> allEmployee =template.query(query, new MyRowMapper());
		return allEmployee;
	}
	

	
}
//RowMapper - 
