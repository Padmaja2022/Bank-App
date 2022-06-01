package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
