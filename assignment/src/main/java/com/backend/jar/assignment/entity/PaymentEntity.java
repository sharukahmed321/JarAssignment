package com.backend.jar.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is Entity class where all the variables created here would be reflected in DB
 */


@Entity
@Table(name="Payment")
public class PaymentEntity {

	@Id
	private long transaction_id;
	private String from_account;
	private String to_account;
	private String amount;
	

	//Constructor using fields - ArgsConstructor 
	public PaymentEntity(long transaction_id, String from_account, String to_account, String amount) {
		this.transaction_id=transaction_id;
		this.from_account = from_account;
		this.to_account = to_account;
		this.amount = amount;
	}
	
	//Constructor without fields - NoArgs Constructor
	public PaymentEntity() {
		
	}
	
	//getters and setters
	public long getTransaction_id() {
		return transaction_id;
	}

	
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getFrom_account() {
		return from_account;
	}
	
	public void setFrom_account(String from_account) {
		this.from_account = from_account;
	}
	
	public String getTo_account() {
		return to_account;
	}
	
	public void setTo_account(String to_account) {
		this.to_account = to_account;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
