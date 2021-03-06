package com.example.BankApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankApp.service.TransactionsService;
import com.example.BankApp.model.Transactions;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

	@Autowired
	TransactionsService transServices;

	// create new transactions
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/newTrans", method = RequestMethod.POST)
	public Transactions createTransaction(@RequestBody Transactions trans) {
		
		return transServices.createTransaction(trans);
		
	}

	// deposit
	@CrossOrigin(origins = "*")
	@PatchMapping("deposit/{id}/{name}/{amount}")
	public Transactions deposit(@PathVariable(value = "id") Long Id, @PathVariable(value = "amount") double amount, @PathVariable(value = "name") String name) {
		
		return transServices.deposit(Id, amount, name);
		
	}

	// withdraw
	@CrossOrigin(origins = "*")
	@PatchMapping("withdraw/{id}/{name}/{amount}")
	public Transactions widthDraw(@PathVariable(value = "id") Long Id, @PathVariable(value = "amount") double amount, @PathVariable(value = "name") String name) {
		
		return transServices.widthDraw(Id, amount, name);
		
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Long Id) {
		
		transServices.deleteTransaction(Id);

		System.out.println("The following transaction has been deleted " + Id);

	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "balance/{id}", method = RequestMethod.GET)
	public double balance(@PathVariable(value = "id") Long Id) {

		return transServices.Balance(Id);

	}

	@CrossOrigin(origins = "*")

	@RequestMapping(value = "/gt/transactions{account_id}", method = RequestMethod.GET)
	public List<Transactions> getTransactions(@PathVariable(value = "account_id") Long account_id) {
		
		return transServices.getTransactions(account_id);
		
	}

}
