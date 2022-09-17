package com.backend.jar.assignment.model;



public class Payment {
	
	private long transaction_id; 
	private String from_account;
	private String to_account;
	private String amount;
	

	//Constructor using fields - ArgsConstructor 
	public Payment(long transaction_id, String from_account, String to_account, String amount) {
		this.transaction_id=transaction_id;
		this.from_account = from_account;
		this.to_account = to_account;
		this.amount = amount;
	}
	
	//Constructor without fields - NoArgs Constructor
	public Payment() {
		
	}

	
	/**
	 * @return the transaction_id
	 */
	public long getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the from_account
	 */
	public String getFrom_account() {
		return from_account;
	}
	/**
	 * @param from_account the from_account to set
	 */
	public void setFrom_account(String from_account) {
		this.from_account = from_account;
	}
	/**
	 * @return the to_account
	 */
	public String getTo_account() {
		return to_account;
	}
	/**
	 * @param to_account the to_account to set
	 */
	public void setTo_account(String to_account) {
		this.to_account = to_account;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	

}
