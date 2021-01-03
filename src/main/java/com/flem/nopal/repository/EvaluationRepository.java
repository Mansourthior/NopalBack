package com.flem.nopal.repository;

import com.flem.nopal.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation,Integer> {
}
