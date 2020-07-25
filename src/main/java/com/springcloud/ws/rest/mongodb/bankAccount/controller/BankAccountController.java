package com.springcloud.ws.rest.mongodb.bankAccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.ws.rest.mongodb.bankAccount.model.BankAccount;
import com.springcloud.ws.rest.mongodb.bankAccount.serviceImpl.BankAccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("/rest/bankAccount")
@RestController
public class BankAccountController  {

	@Autowired
	private BankAccountService bankaccountservice;
	

	
	@PostMapping("/save")
	public Mono<BankAccount> save(@RequestBody final BankAccount bankAccount) {
	System.out.println("Will register the Available Balance :: "+ bankAccount.toString());
	return bankaccountservice.create(bankAccount);
	}
	
	
	@GetMapping("/all")
	public Flux<BankAccount> getAll() {
	System.out.println("::GET_ALL Bank Account::");
	return bankaccountservice.findAll();
	}
	
	
 	@PutMapping("/update/{id}")
	public Mono<BankAccount> updateById(@PathVariable("id") final String id, @RequestBody final BankAccount bankAccount) {
	System.out.println("::Update the Bank Account record::");
	return bankaccountservice.update(id, bankAccount);
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public Mono<BankAccount> delete(@PathVariable final String id) {
	System.out.println("::Will delete a Available Balance ::");
	return bankaccountservice.delete(id);
	}
	
	
	@GetMapping("/findById/{id}")
	public Mono<BankAccount> findById(@PathVariable final String id) {
	System.out.println("::Will GetAllBankAccountById a BankAccount  ::");
	return bankaccountservice.findById(id);
	}
	
	
	 
	
	
	
}
