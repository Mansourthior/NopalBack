package com.flem.nopal.repository;

import com.flem.nopal.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {
}
