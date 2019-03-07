package com.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class Logging {
	
	private final Logger log=LoggerFactory.getLogger(Logging.class);
	
	@AfterThrowing(pointcut = "execution(* com.employee.services.EmployeeServicesImpl.*(..))",   throwing = "error")
	public void afterThrowingAdvice( Exception error){
		System.out.println("in aspect");
		log.error(error.getMessage());
			 
	}
	
}
