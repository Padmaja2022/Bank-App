package com.example.BankApp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Account")
@NoArgsConstructor
@AllArgsConstructor

@Data
@Getter 
@Setter
public class Accounts {

	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")

	private long id;
		

	@Column(name="first_Name")
	private String firstName;
	
	@Column(name="last_Name")
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="phone_Number")
	private String phoneNumber ;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="account_Number")
	private String accountNumber;
	
	@Column(name="balance")
	private double balance;
		
	private static int index = 10000;

private String setAccountNumber() {

	String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
	int uniqueID = index;
	int randomNumber = (int) (Math.random() * Math.pow(10, 3));
	return lastTwoOfSSN + uniqueID + randomNumber;

}

}
