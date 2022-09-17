package com.backend.jar.assignment;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.backend.jar.assignment.entity.AccountEntity;
import com.backend.jar.assignment.entity.PaymentEntity;
import com.backend.jar.assignment.repository.AccountRepository;
import com.backend.jar.assignment.repository.PaymentRepository;
import com.backend.jar.assignment.service.AccountService;
import com.backend.jar.assignment.service.PaymentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class AssignmentApplicationTests {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private PaymentService paymentService;
	
	@MockBean
	private AccountRepository accountRepository;
	
	@MockBean
	private PaymentRepository paymentRepository;
	
	@Test
	public void getAccountsTest() {
		when(accountRepository.findAll()).thenReturn(Stream.of(
				new AccountEntity("sharuk123","sharuk",100,"INR"),
				new AccountEntity("ahmed456","ahmed",100,"INR")).collect(Collectors.toList()));
		
		assertEquals(2,accountService.getAllAccounts().size());
	}
	
	@Test
	public void getPaymentsTest() {
		when(paymentRepository.findAll()).thenReturn(Stream.of(
				new PaymentEntity(1,"sharuk123","ahmed456","100")).collect(Collectors.toList()));
		
		assertEquals(1,paymentService.getAllPayments().size());
	}

}
