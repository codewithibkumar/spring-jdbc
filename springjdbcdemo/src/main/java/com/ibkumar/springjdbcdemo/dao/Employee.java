package com.ibkumar.springjdbcdemo.dao;
public class Employee {
	private int empId;
	private String empName;
	private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}
	public Employee(int empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	public Employee() {
		
	}
	
	
	
}
