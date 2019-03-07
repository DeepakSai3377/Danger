package com.employee.dao;

import java.util.List;
import java.util.Map;

import com.employee.pojo.Employee;

public interface EmployeeDao {

	public List<Employee> getAll();
	public boolean insert(Employee e);
	public boolean delete(int empId);
	public boolean update(Employee e);
	public List<String> getEmployeeWithoutCommission(); 
	public double getMaxSalary();
	public Map<Integer,Long> getNoOfEmpDeptWise();
}
