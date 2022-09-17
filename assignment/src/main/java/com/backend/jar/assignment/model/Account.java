package com.backend.jar.assignment.model;

public class Account {
	
	private String id;
	private String owner;
	private int balance;
	private String Currency;
	
	//Constructor using fields - ArgsConstructor 
	public Account(String id, String owner, int balance, String currency) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		this.Currency = currency;
	}
	
	//Constructor without fields - NoArgs Constructor
	public Account() {
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return Currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		Currency = currency;
	}
	
	

}

