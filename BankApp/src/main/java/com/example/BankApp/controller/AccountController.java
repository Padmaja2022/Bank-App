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
import com.example.BankApp.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {



	@Autowired
	AccountService accServices;



// creating new account
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/newAcc", method = RequestMethod.POST)
	public Accounts createAccount(@RequestBody Accounts acc) {
		return accServices.createAccount(acc);
	}



	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
	public void deleteAccount(@PathVariable(value = "Id") Long id) {
		accServices.deleteAccount(id);
	}



	// update first name
	@CrossOrigin(origins = "*")
	@PatchMapping("/{id}/{firstNewName}")
	public Accounts updateFname(@PathVariable(value = "id") Long id,
			@PathVariable(value = "firstNewName") String newName) {
		return accServices.updateFirstName(id, newName);
	}



	// update lastname
	@CrossOrigin(origins = "*")
	@PatchMapping("/{id}/{lastNewName}")
	public Accounts updateLName(@PathVariable(value = "id") Long id,
			@PathVariable(value = "lastNewName") String newName) {
		return accServices.updateLastName(id, newName);
	}

	// update email
	@CrossOrigin(origins = "*")
	@PatchMapping("/{id}/{email}")
	public Accounts updateEmail(@PathVariable(value = "id") Long id, @PathVariable(value = "email") String email) {
		return accServices.updateEmail(id, email);
	}

	// update phone
	@CrossOrigin(origins = "*")
	@PatchMapping("/{id}/{phone}")
	public Accounts updatePhone(@PathVariable(value = "id") Long id, @PathVariable(value = "phone") String phone) {
		return accServices.updatePhone(id, phone);
	}

	/*
	// deposit
	@CrossOrigin(origins = "*")
	@PatchMapping("deposit/{id}/{amount}")
	public Accounts deposit(@PathVariable(value = "id") Long id, @PathVariable(value = "amount") Long amount) {
		return accServices.deposit(id, amount);
	}

	// withdraw
	@CrossOrigin(origins = "*")
	@PatchMapping("deposit/{id}/{amount}")
	public Accounts withdraw(@PathVariable(value = "id") Long id, @PathVariable(value = "amount") Long amount) {
		return accServices.deposit(id, amount);
	}
	*/
}