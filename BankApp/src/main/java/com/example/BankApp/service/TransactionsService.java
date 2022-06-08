package com.example.BankApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApp.model.Accounts;
import com.example.BankApp.model.Transactions;
import com.example.BankApp.repository.TransactionsRepository;

@Service
public class TransactionsService extends Transactions{
	
	
	@Autowired
	TransactionsRepository TransactionsRepo;  
	
	// create a new Transaction
		public Transactions createTransaction(Transactions trans) {
			return TransactionsRepo.save(trans);
		}

		// delete
			public void deleteTransaction(Long Id) {
				TransactionsRepo.deleteById(Id);
				
			}
			// deposit
			public Transactions deposit (Long Id, double ammount) {
				Transactions trans = TransactionsRepo.findById(Id).get();
				trans.setBalance(getBalance() + ammount);
				return TransactionsRepo.save(trans); 				
				
			}
			
			//get balance
			
			public double Balance (Long Id) {
				Transactions trans = TransactionsRepo.findById(Id).get();
				
				return  trans.getBalance(); 
			
			}
			
			//widthdraw
			public Transactions widthDraw (Long Id, double amount) {
				Transactions trans = TransactionsRepo.findById(Id).get();
				trans.setBalance(getBalance() - amount);
				return TransactionsRepo.save(trans); 				
				
			}
			
			public Transactions getTransactions (Long account_id) {
				
				Transactions trans = TransactionsRepo.findById(account_id).get();

				
				return trans; 
			}
			
}
