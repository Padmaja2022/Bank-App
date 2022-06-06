package com.example.BankApp.model;



import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Transactions")
@NoArgsConstructor
@AllArgsConstructor

@Data
@Getter 
@Setter
public class Transactions {

	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="trsid")
	
	private long id;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="type_of_trans")
	private String type;
	
	@Column(name="date_of_trans")
	private LocalDateTime dateOfTrans;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	Accounts account;

	
	
}
	
	

	