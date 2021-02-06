package com.javatpoint.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.javatpoint.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

	public static Map<String,Account> map=null;
	static{
		map=new HashMap<String, Account>();
		map.put("M000001", new Account("10000099", "saving"));
		map.put("M000002", new Account("1343520099", "Current"));
		map.put("M000003", new Account("1024140099", "saving"));
	}
	@Override
	public Account getAccountByCustomerId(String custId) throws Exception {
		if(custId ==null) {
			throw new Exception("Invalid cust id");
		}
		Account account=null;
		Set<Entry<String,Account>> entrySet=map.entrySet();
		for(Entry<String,Account> entry:entrySet) {
			if(entry.getKey().equals(custId)) {
				account =entry.getValue();
			}
		
		}
		return account;
		
	}

	

}
