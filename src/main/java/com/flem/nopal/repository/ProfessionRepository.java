package com.flem.nopal.repository;

import com.flem.nopal.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession,Integer> {
}
