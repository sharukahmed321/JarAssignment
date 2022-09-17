package com.backend.jar.assignment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.jar.assignment.entity.AccountEntity;
import com.backend.jar.assignment.model.Account;
import com.backend.jar.assignment.repository.AccountRepository;

/**
 * Account Service - Account Related business logic is written
 */

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;

	public List<Account> getAllAccounts(){
		List<AccountEntity> accountEntity= accountRepository.findAll();

		System.out.println("------------------------I'm in Account Service -------------------------");
		List<Account> allAccounts = accountEntity.stream().map(acc -> new Account(
										acc.getId(),
										acc.getOwner(),
										acc.getBalance(),
										acc.getCurrency()))
										.collect(Collectors.toList());

		return allAccounts;

	}

}
