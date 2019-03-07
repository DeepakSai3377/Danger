package com.employee.service;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDao;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeCollection;
import com.employee.services.EmployeeServices;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("employee1.xml");
		Employee e = new Employee();
//		e.setEmpid(1111);
//		e.setEname("Raja");
//		e.setJob("ceo");
//		e.setMgr(0);
//		e.setSal(29999);
//		e.setComm(0);
//		e.setDeptno(20);
		EmployeeDao ec=(EmployeeDao)c.getBean("edao");
	
		 List<Employee> list= ec.getAll();
         for(Employee e1:list)
      {
     	 System.out.println(e1);
     }

	}

}
