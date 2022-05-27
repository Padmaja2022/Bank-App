package com.example.BankApp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
		

	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="phoneNumber")
	private String phoneNumber ;

	
}

