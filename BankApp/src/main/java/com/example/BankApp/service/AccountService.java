package com.example.BankApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.BankApp.model.Accounts;
import com.example.BankApp.repository.AccountRepository;


public class AccountService extends Accounts {

@Autowired
AccountRepository AccountRepo;

// create a new account
	public Accounts createAccount(Accounts acc) {
		return AccountRepo.save(acc);
	}

// delete
	public void deleteAccount(Long Id) {
		AccountRepo.deleteById(Id);
	}



// update firstname
	public Accounts updateFirstName(Long id, String newName) {
		Accounts acc = AccountRepo.findById(id).get();
		acc.setFirstName(newName);
		return AccountRepo.save(acc);
	}



// update lastname
	public Accounts updateLastName(Long id, String newName) {
		Accounts acc = AccountRepo.findById(id).get();
		acc.setLastName(newName);
		return AccountRepo.save(acc);
	}



// update email
	public Accounts updateEmail(Long id, String email) {
		Accounts acc = AccountRepo.findById(id).get();
		acc.setEmail(email);
		return AccountRepo.save(acc);
	}



// update phonenumber
	public Accounts updatePhone(Long id, String phone) {
		Accounts acc = AccountRepo.findById(id).get();
		acc.setPhoneNumber(phone);
		return AccountRepo.save(acc);
	}
}