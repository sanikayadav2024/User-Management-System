package com.sanika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
