package com.example.BankApp;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BankApp.model.Accounts;
import com.example.BankApp.repository.AccountRepository;
import com.example.BankApp.repository.TransactionsRepository;
import com.example.BankApp.service.AccountService;
import com.example.BankApp.service.TransactionsService;

@SpringBootTest
class BankAppApplicationTests {
/*	@Mock
	AccountRepository aaa;
	@Mock
	TransactionsRepository bbb; 
*/
	@Autowired
	TransactionsService abc = new TransactionsService(); 
	@Autowired 
	AccountService bcd = new AccountService();
	
	@Test
	void contextLoads() {
	}
	
	@Test 
void makeDeposit() {
		
		//var makeDeposit = new TransactionsService();
	abc.deposit(15L, 123.0);
		
	}
	//@Test 
	//void getBalance() {
	//	var getBalance = new TransactionsService();
	//	abc.Balance(1L);
		
	//}
	
	
	
	@Test 
	void makeWidthDraw() {
	//	var makeWidthDraw = new TransactionsService();
		abc.widthDraw(15L, 100); 
	} 
	
	@Test 
	void initDeposit() {
		bcd.initDeposit(1L, 1000);
		
	}
	
	@Test
	void getAccount() {
//		var getAccount = new AccountService(); 
		bcd.getAccount(1L);
		
	}
	@Test
	void updatePhoneNumber() {
		
	//	var updatePhoneNumber = new AccountService();
		bcd.updatePhone(1L, "5555555555");
		
		
	}
	
	@Test
	void updateEmail() { 
	//	var updateEmail = new AccountService();
		bcd.updateEmail(1L, "yes@gmail.com");
	}
	
	@Test
	void updateFirstName() {
	//	var updateFirstName = new AccountService() ;
		bcd.updateFirstName(1L, "Dylan");
	}
	
	@Test
	void updateLastName() {
		//var updateLastName = new AccountService();
		bcd.updateLastName(1L, "Henry");
	}
		
}
