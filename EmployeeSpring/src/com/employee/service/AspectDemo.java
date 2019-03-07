package com.employee.service;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;

@Aspect
public class AspectDemo {
   
	@Before("execution(* getAll(..))")
	public void beforeAdvice( )
	{
		  Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
		  logger.info("getAll() called");
	}
}
