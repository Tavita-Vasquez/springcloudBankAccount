package com.springcloud.ws.rest.mongodb.bankAccount.serviceImpl;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.springcloud.ws.rest.mongodb.bankAccount.model.BankAccount;
import com.springcloud.ws.rest.mongodb.bankAccount.repository.BankAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BankAccountService {
	
	@Autowired
	private BankAccountRepository repository;

	 @Autowired
	 MessageSource i18n;
	 
	//log
		private static final Logger log=(Logger) LogManager.getLogger(BankAccountService.class);

		
	 
	public Mono<BankAccount> create(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		//return template.save(availableBalance);
		log.info("Begin service save of bank Account.");
		Mono<BankAccount> saved = null;
		bankAccount.setAmountMinCreation(0.00);
		try {
			if (bankAccount.getMaxTransaction()!=null) {
				bankAccount.setAmountCommission(9999.99);
				log.error("Error Save Transaction - Superó su Limite.");
			} else {
				saved = repository.save(bankAccount);
				log.info("Save Correct Transaction..");
			}
		}catch(Exception e) {
			log.error("Error when saving Bank Account in data base.");
			
		}
		return saved;
		
		
	
	}

	public Flux<BankAccount> findAll() {
		// TODO Auto-generated method stub
		//return template.findAll(AvailableBalance.class);
		log.info("Begin service List All of bank Account.");
		 return repository.findAll();
		/*
		 * Flux<BankAccount> list = null; try {
		 * 
		 * list = repository.findAll();
		 * log.info("Get All List Bank Account Correct Transaction..");
		 * 
		 * }catch(Exception e) {
		 * log.error("Error when call method find All Bank Account in data.");
		 * 
		 * }
		 * 
		 *
		 */
	}

	/*
	 * @Override public Mono<AvailableBalance> update(String id) { // TODO
	 * Auto-generated method stub return template.update(AvailableBalance.class); }
	 */
	
	public  Mono<BankAccount> update(final String id,BankAccount bankAccount) {
		log.info("Begin Service Update Data Bank Account " + id + bankAccount.getIdClienType() );
		Mono<BankAccount> updateData = null;
	try {
		updateData = repository.save(bankAccount);
		log.info(" Update Data Bank Account for Client by Id " + id);
		
	} catch (Exception e) {
		log.error("Error when call method Service update Bank Account in data.");
	}
		
		
		
		return updateData;
}
	

	 @SuppressWarnings("rawtypes")
	public Mono delete(final String id) {
		 log.info("Begin Service Delete Data from Bank Account" + id);
		 Mono delete=null;
		 try {
			 final Mono<BankAccount> dbBankAccount = getById(id);
			  if (Objects.isNull(dbBankAccount)) {
			   return Mono.empty();
			  }
			  delete =  getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(BankAccountoBeDeleted -> repository
			    .delete(BankAccountoBeDeleted).then(Mono.just(BankAccountoBeDeleted)));
			 
			  log.info(" Delete Data Bank Account for Client by Id " + id);
				
			} catch (Exception e) {
				log.error("Error when call method Service Delete Bank Account in data.");
			}
		return delete;
		 
		  
		 }
		

	public Mono<BankAccount> getById(final String id) {
		 log.info("Begin Service get by Id Data from Bank Account" + id);
		 Mono<BankAccount> findById = null;
		 try {
			 	findById = repository.findById(id);
			  log.info(" Find Bank Account  by Id  " + id);
				
			} catch (Exception e) {
				log.error("Error when call method Service get All By Id data.");
			}
		 
	  return  findById;
	 }

	public Mono<BankAccount> findById(String id) {
		// TODO Auto-generated method stub
		 log.info("Begin Service Find by Id Data from Bank Account" + id);
		return repository.findById(id);
	}

}
