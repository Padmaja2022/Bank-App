package com.example.BankApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankApp.model.Accounts;
import com.example.BankApp.model.Transactions;
import com.example.BankApp.repository.AccountRepository;
import com.example.BankApp.repository.TransactionsRepository;

@Service
public class TransactionsService {

	
	
	@Autowired
	AccountRepository AccountRepo;
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
			public Transactions deposit (Long Id, double amount) {
				Transactions trans = new Transactions(amount, "deposit", Id);
				createTransaction(trans);
				Accounts acc = AccountRepo.findById(Id).get();
				acc.setBalance(acc.getBalance() + amount);
				AccountRepo.save(acc);
				return TransactionsRepo.save(trans);		
				
			}
			
			//get balance
			
			public double Balance (Long Id) {
				Accounts acc = AccountRepo.findById(Id).get();
				return acc.getBalance();
			}
		
			//widthdraw
			public Transactions widthDraw (Long Id, double amount) {
				Transactions trans = new Transactions(amount, "withdraw", Id);
				createTransaction(trans);
				Accounts acc = AccountRepo.findById(Id).get();
				acc.setBalance(acc.getBalance() - amount);
				AccountRepo.save(acc);
				return TransactionsRepo.save(trans); 				
				
			}
			
			/*public Transactions getTransactions (Long account_id) {
				
				Accounts acc = TransactionsRepo.findById(account_id).get();

				
				return trans; 
			} */
			
}
