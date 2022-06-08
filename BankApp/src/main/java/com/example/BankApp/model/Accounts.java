package com.example.BankApp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Account")
@Data

public class Accounts {

	/*
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 * @param ssn
	 * @param accountNumber
	 * @param balance
	 */
	
	public Accounts() {
	}

	public Accounts(long id) {
		
		this.accountNumber = setAccountNumber();
		
	}

	public Accounts(long id, String firstName, String lastName, String email, String phoneNumber, String ssn,
			double balance) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.accountNumber = setAccountNumber();
		this.balance = balance;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accid")

	private long id;

	@Column(name = "first_Name")
	private String firstName;

	@Column(name = "last_Name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_Number")
	private String phoneNumber;

	@Column(name = "ssn")
	private String ssn;

	@Column(name = "account_Number")
	private String accountNumber;

	@Column(name = "balance")
	private double balance;

	private static int index = 10000;

	private String setAccountNumber() {

		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}

	// one to many relationship, mappedBy - ownership of transactions
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "account")
	List<Transactions> transaction;
}
