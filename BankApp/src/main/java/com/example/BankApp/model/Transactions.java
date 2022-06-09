package com.example.BankApp.model;


import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Transactions")

@Data
@Getter
@Setter
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trsid")
	private long id;

	@Column(name = "amount")
	private double amount;

	@Column(name = "category")
	private String type;

	@Column(name = "date_of_trans")
	private LocalDateTime dateOfTrans;

	@Column(name = "account")
	private Long account;
	
	@Column(name = "transactionName")
	private String transactionName;
	
	public Transactions() {
		this.dateOfTrans = LocalDateTime.now();
	}

	public Transactions(double amount, String type, long account, String transactionName) {
		
		this.amount = amount;
		this.type = type;
		this.account = account;
		this.transactionName = transactionName;
		this.dateOfTrans = LocalDateTime.now();
		
	}
}
