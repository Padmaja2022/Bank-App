package com.example.BankApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankApp.model.Accounts;
@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
