package com.springcloud.ws.rest.mongodb.bankAccount.repository;
 
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.springcloud.ws.rest.mongodb.bankAccount.model.BankAccount;

@Repository
public interface BankAccountRepository extends ReactiveMongoRepository<BankAccount, String>{
	 // List<BankAccount> findByAccountType(Long idAccountType);
	  
}
