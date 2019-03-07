package com.employee.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

public class EmployeeServicesImpl implements EmployeeServices{
	
	public EmployeeDao dao;

	@Override
	public boolean addEmp(Employee e)throws Exception {
		dao.insert(e);
		System.out.println("in service");
		throw new Exception("employee not addedd successfully");
		
		//return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
	  return dao.delete(empId);
	}

	public void setDao(EmployeeDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public boolean updateSalary(Employee e) {
		return dao.update(e);
	}

	@Override
	public double getMaxsalary() {
		return dao.getMaxSalary();
	}

	@Override
	public List<String> getEmployeeWithoutCommision() {
		return dao.getEmployeeWithoutCommission();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAll();
	}

	@Override
	public Map<Integer, Long> getNoOfEmpDeptWise() {
	  return	dao.getNoOfEmpDeptWise();
	
	}

//	@Override
//	public ArrayList<Employee> orderedListEmp(int x) {
//		List<Employee> empList=dao.getAll();
//		List<Employee> orderedList;
//		switch(x) {
//		case 1:
//			empList.stream()
//			
//		
//		}
//	    
//		return null;
//	}

	
	

}
