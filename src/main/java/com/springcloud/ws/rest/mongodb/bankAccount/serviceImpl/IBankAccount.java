package com.springcloud.ws.rest.mongodb.bankAccount.serviceImpl;
 

import org.springframework.stereotype.Service;

import com.springcloud.ws.rest.mongodb.bankAccount.model.BankAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface IBankAccount {
	 Mono<BankAccount> create(BankAccount bankAccount);
	 Flux<BankAccount> findAll();
	 Mono<BankAccount> update(String id, BankAccount bankAccount);
	 Mono<BankAccount> getById(String id);
	 Mono delete(String id);

}
