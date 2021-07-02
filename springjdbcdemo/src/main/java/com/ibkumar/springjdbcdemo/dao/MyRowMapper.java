package com.ibkumar.springjdbcdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.setEmpId(rs.getInt(1));
		obj.setEmpName(rs.getString(2));
		obj.setDept(rs.getString(3));
		return obj;
	}

	

	

}
