package com.ibkumar.springjdbcdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapperForAll implements RowMapper<List<Employee>>{

	public List<Employee> mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Employee> allemployee = new ArrayList<Employee>();
		int i =0;
		while(rs.next())
		{
			allemployee.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3)));
			//Employee obj = new Employee();
			//obj.setEmpId(rs.getInt(1));
			//obj.setEmpName(rs.getString(2));
			//obj.setDept(rs.getString(3));
			//allemployee.add(obj);
		}
		
		
		return allemployee;
	}

}
