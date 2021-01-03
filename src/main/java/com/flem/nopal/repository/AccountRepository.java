package com.flem.nopal.repository;

import com.flem.nopal.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Integer> {

    Optional<Account> findById(Integer id);

    Account findByLogin(String login);
}
