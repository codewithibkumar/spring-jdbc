package com.ibkumar.springjdbcdemo;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.ibkumar.springjdbcdemo.dao.Employee;
import com.ibkumar.springjdbcdemo.dao.EmployeeDao;
public class App {
	public static void main( String[] args )
    {  
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/ibkumar/springjdbcdemo/springjdbcconfig.xml");
    	//JdbcTemplate template = context.getBean("jdbctemp",JdbcTemplate.class);
    	
    	//Insert operation
    	//String query1 = "insert into employee values(?,?,?)";
    	//int row = template.update(query1,4,"Vishal","Advance Java");
    	//System.out.println(row + " row inserted");  
    	
    	//update operation
    	//String query2 = "update employee set dept=? where empId=?";
    	//int row = template.update(query2,"Php",4);
    	//System.out.println(row + " row updated");  	
    	
    	//delete operation
    	//String query3 = "delete from employee where empId=?";
    	//int row = template.update(query3,3);
    	//System.out.println("Employee deleted");
    	
    	//Insert
    	Employee e1 = new Employee();
    	e1.setEmpId(7);
    	e1.setEmpName("Anooj");
    	e1.setDept("Spring");
    	EmployeeDao dao = context.getBean("dao",EmployeeDao.class);
    	//int row = dao.save(e1);
    	//System.out.println(row + " row inserted");
    	
    	//update
    	Employee e2 = new Employee();
    	e2.setEmpId(6);
    	e2.setEmpName("Palak");
    	e2.setDept("Hibernate");
    	//EmployeeDao dao = context.getBean("dao",EmployeeDao.class);
    	//int row1 = dao.update(e2);
    	//System.out.println(row1 + " row updated");
    	
    	//delete
    	//int row2 =	dao.delete(7);
    	//System.out.println(row2 +"Record deleted");
    	Employee e4;
    	try
    	{
    	e4 = dao.fetchEmployeeById(3);
    	System.out.println(e4);
    	}catch(EmptyResultDataAccessException e)
    	{
    		System.err.println("Employee not found");
    	}
    	
    	//Fetch All Employee
    	List<Employee> allEmployee = dao.fetchAllEmployee();
    	for(Employee k: allEmployee)
    	{
    		System.out.println(k);
    	}
    	
    	
    	    	
    	
    	
    }
}
/*  JdbcTemplate
	method - update (insert , delete, update)
	method - execute (select)
	
*/