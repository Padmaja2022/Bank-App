package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.BankApp.model.Accounts;
import com.example.repository.AccountRepository;


public class Services extends Accounts{
	
	@Autowired
	
	AccountRepository AccountRepo;
	


	public double deposit(Long id, double amount) {

		Accounts acct = AccountRepo.findById(id).get();
		
	return acct.getBalance() + amount; 
		
		

	}
	



	public double withDraw(Long id, double amount) {

		Accounts acct = AccountRepo.findById(id).get();
		
		return acct.getBalance() - amount;
		
		

	}
	
}

