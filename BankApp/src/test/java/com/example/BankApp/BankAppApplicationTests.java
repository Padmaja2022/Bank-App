package com.example.BankApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BankApp.service.AccountService;
import com.example.BankApp.service.TransactionsService;
@SpringBootTest
class BankAppApplicationTests {

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
}
