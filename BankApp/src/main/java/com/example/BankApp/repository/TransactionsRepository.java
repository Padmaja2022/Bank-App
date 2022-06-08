package com.example.BankApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankApp.model.Transactions;
@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long>{

}
