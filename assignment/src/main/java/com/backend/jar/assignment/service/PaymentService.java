package com.backend.jar.assignment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.jar.assignment.entity.AccountEntity;
import com.backend.jar.assignment.entity.PaymentEntity;
import com.backend.jar.assignment.model.Account;
import com.backend.jar.assignment.model.Payment;
import com.backend.jar.assignment.repository.AccountRepository;
import com.backend.jar.assignment.repository.PaymentRepository;

/**
 * Payment Service - Payment Related business logic is written
 */


@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountService accountService;
	
	public List<Payment> getAllPayments(){
		List<PaymentEntity> paymentEntity= paymentRepository.findAll();

		System.out.println("---------------------I'm in Payment Service -------------------------");
		List<Payment> allPayments = paymentEntity.stream().map(pay -> new Payment(
										pay.getTransaction_id(),
										pay.getFrom_account(),
										pay.getTo_account(),
										pay.getAmount()))
										.collect(Collectors.toList());

		return allPayments;

	}

	// updating balance would be calculated when corresponding payment is made
	public Payment createPayment(Payment payment) {
		
		PaymentEntity paymentEntity = new PaymentEntity();
		
		AccountEntity accountEntity = new AccountEntity();

        BeanUtils.copyProperties(payment, paymentEntity);
        
        paymentRepository.save(paymentEntity);
        
        int amount = Integer.parseInt(payment.getAmount());
        
        List<Account> allAccounts = accountService.getAllAccounts();
        
        for(Account account : allAccounts) {
        	//you're sending money
        	if(account.getId().equals(payment.getFrom_account())) {
        		account.setBalance(account.getBalance() - amount); // if sending, money would deduct
        		BeanUtils.copyProperties(account, accountEntity);
        		accountRepository.save(accountEntity); // after updating balances, store them back into DB
        	}
        	//you're receiving money
        	if(account.getId().equals(payment.getTo_account())) {
        		account.setBalance(account.getBalance() + amount); // if receiving , money would add up
        		BeanUtils.copyProperties(account, accountEntity);
        		accountRepository.save(accountEntity);// after updating balances, store them back into DB
        	}
        		
        }
           
        return payment;
		
	}
}
