package com.example.BankApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApp.model.Accounts;
import com.example.BankApp.service.TransactionsService;
import com.example.BankApp.model.Transactions;


@RestController
@RequestMapping("/transactions")
public class TransactionsController {
	
	@Autowired
	TransactionsService transServices;
	
	//create new transactions
	@CrossOrigin(origins ="*")
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public Transactions createTransaction(@RequestBody Transactions trans) {
		return transServices.createTransaction(trans);
	}

	@CrossOrigin(origins = "*")
	@PatchMapping("deposit/{id}/{amount}")
	public Transactions deposit(@PathVariable(value = "id") Long id, @PathVariable(value = "amount") Long amount) {
		return transServices.deposit(id, amount);
	}

	// withdraw
	@CrossOrigin(origins = "*")
	@PatchMapping("deposit/{id}/{amount}")
	public Transactions withdraw(@PathVariable(value = "id") Long id, @PathVariable(value = "amount") Long amount) {
		return transServices.deposit(id, amount);
	}
	

}
