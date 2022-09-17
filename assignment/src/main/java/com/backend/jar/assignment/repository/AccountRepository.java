package com.backend.jar.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.backend.jar.assignment.entity.AccountEntity;

/**
 * This is the where repositories are created for storing data into DB
 */

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String>{

}
