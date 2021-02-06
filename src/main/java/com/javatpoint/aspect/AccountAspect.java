package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.javatpoint.model.Account;

@Aspect
@Component
public class AccountAspect {
	
@AfterThrowing(value="execution(* com.javatpoint.service.AccountServiceImpl.*(..))",throwing ="ex")


public void afterReturningAdvice(JoinPoint joinPoint,Exception ex) throws Throwable {
	System.out.println("after returning  "+ex.getMessage());
	}
}
