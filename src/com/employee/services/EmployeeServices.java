package com.employee.services;

import java.util.List;
import java.util.Map;

import com.employee.pojo.Employee;

public interface EmployeeServices {

	public boolean addEmp(Employee e)throws Exception;
	public boolean deleteEmployee(int empId);
	public boolean updateSalary(Employee e);
	public double getMaxsalary();
	public List<String> getEmployeeWithoutCommision();
	public List<Employee> getAllEmployee();
	
	public Map<Integer,Long> getNoOfEmpDeptWise();
	//public List<Employee> orderedListEmp(int x);
	
	
	
	
}
