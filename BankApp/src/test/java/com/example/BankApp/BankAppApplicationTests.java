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

	@Autowired
	TransactionsService abc = new TransactionsService();
	@Autowired
	AccountService bcd = new AccountService();

	@Test
	void contextLoads() {
	}

	@Test
	void makeDeposit() {

		abc.deposit(1L, 50.0, null);

	}

	@Test
	void getBalance() {

		abc.Balance(2L);

	}

	@Test
	void makeWidthDraw() {

		abc.widthDraw(3L, 30.0, null);
		
	}

	@Test
	void initDeposit() {
		
		bcd.initDeposit(4L, 1000);

	}

	@Test
	void getAccount() {

		bcd.getAccount(5L);

	}

	@Test
	void updatePhoneNumber() {

		bcd.updatePhone(1L, "1234567654");

	}

	@Test
	void updateEmail() {

		bcd.updateEmail(2L, "no@gmail.com");
		
	}

	@Test
	void updateFirstName() {

		bcd.updateFirstName(3L, "Ashanti");
		
	}

	@Test
	void updateLastName() {

		bcd.updateLastName(3L, "Blount");
		
	}

}
