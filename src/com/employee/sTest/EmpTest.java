package com.employee.sTest;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServices;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		//BeanFactory c=new XmlBeanFactory (new ClassPathResource("employee.xml"));
//		Employee e=new Employee();
//		e.setEmpid(99);
//        e.setEname("sri");
//        e.setJob("head");
//        e.setMgr(5);
//        e.setSal(19999);
//        e.setComm(0);
//        e.setDeptno(10);
		EmployeeServices service=(EmployeeServices)c.getBean("service");
//		try {
//			//service.addEmp(e);
//		}
//		catch(Exception e1) {
//			System.out.println("in catch main");
//		}
		
		
		List<Employee> list= service.getAllEmployee();
        
        for(Employee e1:list)
        {
       	 System.out.println(e1);
        }
		
         
	}
	
	
	

}
