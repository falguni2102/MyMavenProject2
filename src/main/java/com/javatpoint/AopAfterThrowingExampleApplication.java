package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.javatpoint.model.Account;
import com.javatpoint.service.AccountService;
import com.javatpoint.service.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopAfterThrowingExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(AopAfterThrowingExampleApplication.class, args);
	AccountService accountService=context.getBean(AccountServiceImpl.class);
	Account acc;
	try {
		acc = accountService.getAccountByCustomerId(null);
		if(acc!=null) {
			System.out.println(acc.getAccountNumber() +" :: " +acc.getAccountType());
		}
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		e.getStackTrace();
	}
	finally {
		context.close();
	}
	
	}

}
