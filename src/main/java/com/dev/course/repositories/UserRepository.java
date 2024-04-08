package com.dev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
