package com.backend.jar.assignment.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.jar.assignment.model.Account;

import com.backend.jar.assignment.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService; // business logic is written in services
	
	
	@GetMapping("/v1/accounts")
	public List<Account> getAllAccounts(){
		System.out.println("-----------I'm in controller-------------"); //debug statement
		return accountService.getAllAccounts();
	}
	
}
