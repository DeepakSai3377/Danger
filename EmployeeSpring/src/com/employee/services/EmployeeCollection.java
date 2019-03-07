package com.employee.services;

import java.util.ArrayList;
import java.util.List;

import com.employee.pojo.Employee;

public class EmployeeCollection implements EmployeeServices {
	
	ArrayList<Employee> empList=null;
	public EmployeeCollection() {
		empList = new ArrayList<>();
	}

	@Override
	
	public boolean addEmp(Employee e) {
		empList.add(e); 
		 System.out.println(empList);
		return false;
	}

	@Override
	public List<Employee> getEmp(Employee e) {
	
	return empList;
	 
	}

	@Override
	public boolean updateEmpSal(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMaxSal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmp(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getWithoutComm() {
		// TODO Auto-generated method stub
		return false;
	}

}
