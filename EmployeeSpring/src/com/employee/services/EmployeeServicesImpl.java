package com.employee.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

public class EmployeeServicesImpl implements EmployeeServices{
	ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	 EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
	@Override
	public boolean addEmp(Employee e) {
		
		d.insert(e);
		return true;
	}

	@Override
	public List<Employee> getEmp(Employee e) {
		return d.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Employee e) {
	  d.update(e);
		return true;
	}

	@Override
	public String getMaxSal() {
		List<Employee> l=d.getAll();
		Integer maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		System.out.println(maxSal);
		return null;
	}

	@Override
	public boolean deleteEmp(Employee e) {
		d.delete(e);
		return true;
	}

	@Override
	public boolean getWithoutComm() {
		List<Employee> l=d.getAll();
		 List<String> result = l.stream() .filter(line ->line.getComm()==0).map(e->e.getEname()).collect(Collectors.toList());
		 result.forEach(emp -> System.out.println(emp));
		/*
		 * for(String s:result) { System.out.println(result); }
		 */
	                         
		return true;
	}
	

}
