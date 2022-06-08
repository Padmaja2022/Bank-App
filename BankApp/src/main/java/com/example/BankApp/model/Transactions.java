package com.example.BankApp.model;

import java.time.LocalDate;
//import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
	private LocalDate dateOfTrans;

	@Column(name = "account")
	private Long account;

	public Transactions() {
		this.dateOfTrans = LocalDate.now();
	}

	public Transactions(double amount, String type, long account) {
		
		this.amount = amount;
		this.type = type;
		this.account = account;
		this.dateOfTrans = LocalDate.now();
		
	}
}
