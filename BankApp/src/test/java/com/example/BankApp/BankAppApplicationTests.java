package com.example.BankApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BankApp.repository.AccountRepository;
import com.example.BankApp.repository.TransactionsRepository;
import com.example.BankApp.service.AccountService;
import com.example.BankApp.service.TransactionsService;

@SpringBootTest
class BankAppApplicationTests {
@Autowired
	private AccountRepository aaa;
	private TransactionsRepository bbb; 

	@Test
	void contextLoads() {
	}
	
	@Test 
	void makeDeposit() {
		
		var makeDeposit = new TransactionsService();
		makeDeposit.deposit(1L, 123) ;
		
	}
	@Test 
	void getBalance() {
		var getBalance = new TransactionsService();
		getBalance.Balance(1L);
		
	}
	@Test 
	void makeWidthDraw() {
		var makeWidthDraw = new TransactionsService();
		makeWidthDraw.widthDraw(1L, 100); 
	}
	
/*	@Test 
	void asdfs() {
		var asdf = new TransactionsService();
		asdf.
	}
*/	
	@Test
	void getAccount() {
		var getAccount = new AccountService(); 
		getAccount.getAccount(1L);
		
	}
	@Test
	void updatePhoneNumber() {
		
		var updatePhoneNumber = new AccountService();
		updatePhoneNumber.updatePhone(1L, "5555555555");
		
		
	}
	
	@Test
	void updateEmail() { 
		var updateEmail = new AccountService();
		updateEmail.updateEmail(1L, "yes@gmail.com");
	}
	
	@Test
	void updateFirstName() {
		var updateFirstName = new AccountService() ;
		updateFirstName.updateFirstName(1L, "Dylan");
	}
	
	@Test
	void updateLastName() {
		var updateLastName = new AccountService();
		updateLastName.updateLastName(1L, "Henry");
	}
		
}
