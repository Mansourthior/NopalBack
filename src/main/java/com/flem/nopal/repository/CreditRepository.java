package com.flem.nopal.repository;

import com.flem.nopal.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit,Integer> {
}
