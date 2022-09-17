package com.backend.jar.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is Entity class where all the variables created here would be reflected in DB
 */

@Entity
@Table(name="Account")
public class AccountEntity {
	
	@Id
	private String id;
	private String owner;
	private int balance;
	private String Currency;
	
	//Constructor using fields - ArgsConstructor 
	public AccountEntity(String id, String owner, int balance, String currency) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		this.Currency = currency;
	}
	
	//Constructor without fields - NoArgs Constructor
	public AccountEntity() {
		
	}

	//getters and setters
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getOwner() {
		return owner;
	}

	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	public int getBalance() {
		return balance;
	}

	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public String getCurrency() {
		return Currency;
	}

	
	public void setCurrency(String currency) {
		Currency = currency;
	}


}
