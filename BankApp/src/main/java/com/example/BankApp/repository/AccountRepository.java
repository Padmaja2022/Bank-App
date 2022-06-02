package com.example.BankApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BankApp.model.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
