package com.springcloud.ws.rest.mongodb.bankAccount.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data  
@AllArgsConstructor  
@NoArgsConstructor  
@Getter
@Setter
@ToString
@Document(value = "bankAccount")
public class BankAccount {

	@Id
	private String id;
	
	private String idHeadline;
	private String nameHeadline;
	private String idAuthorizedSignatories;
	private String idProductType;   //Productos cuentas bancarias (ahorro, cuentas corrientes, o cuentas a plazo fijo)
	private String idCreditType; //y créditos (personal, empresarial, tarjetas de crédito y adelanto de efectivo).
	private String idClienType; //Empresarial o Personal	
	private double amountCommission = 00.00; // 0 comisión
	private double amountMinCreation = 00.00;
	private String idPaymentCredit;
	private Integer maxTransaction;
	private String  idBankAccount;
	
	
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BankAccount(String idHeadline, String nameHeadline, String idAuthorizedSignatories, String idProductType,
			String idCreditType, String idClienType, double amountCommission, double amountMinCreation,
			String idPaymentCredit, Integer maxTransaction, String idBankAccount) {
		super();
		this.idHeadline = idHeadline;
		this.nameHeadline = nameHeadline;
		this.idAuthorizedSignatories = idAuthorizedSignatories;
		this.idProductType = idProductType;
		this.idCreditType = idCreditType;
		this.idClienType = idClienType;
		this.amountCommission = amountCommission;
		this.amountMinCreation = amountMinCreation;
		this.idPaymentCredit = idPaymentCredit;
		this.maxTransaction = maxTransaction;
		this.idBankAccount = idBankAccount;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdHeadline() {
		return idHeadline;
	}
	public void setIdHeadline(String idHeadline) {
		this.idHeadline = idHeadline;
	}
	public String getNameHeadline() {
		return nameHeadline;
	}

	public void setNameHeadline(String nameHeadline) {
		this.nameHeadline = nameHeadline;
	}
	public String getIdAuthorizedSignatories() {
		return idAuthorizedSignatories;
	}
	public void setIdAuthorizedSignatories(String idAuthorizedSignatories) {
		this.idAuthorizedSignatories = idAuthorizedSignatories;
	}
	public String getIdProductType() {
		return idProductType;
	}
	public void setIdProductType(String idProductType) {
		this.idProductType = idProductType;
	}
	public String getIdCreditType() {
		return idCreditType;
	}
	public void setIdCreditType(String idCreditType) {
		this.idCreditType = idCreditType;
	}
	public String getIdClienType() {
		return idClienType;
	}
	public void setIdClienType(String idClienType) {
		this.idClienType = idClienType;
	}
	public double getAmountCommission() {
		return amountCommission;
	}
	public void setAmountCommission(double amountCommission) {
		this.amountCommission = amountCommission;
	}
	public double getAmountMinCreation() {
		return amountMinCreation;
	}
	public void setAmountMinCreation(double amountMinCreation) {
		this.amountMinCreation = amountMinCreation;
	}
	public String getIdPaymentCredit() {
		return idPaymentCredit;
	}
	public void setIdPaymentCredit(String idPaymentCredit) {
		this.idPaymentCredit = idPaymentCredit;
	}
	public Integer getMaxTransaction() {
		return maxTransaction;
	}
	public void setMaxTransaction(Integer maxTransaction) {
		this.maxTransaction = maxTransaction;
	}

	public String getIdBankAccount() {
		return idBankAccount;
	}
	public void setIdBankAccount(String idBankAccount) {
		this.idBankAccount = idBankAccount;
	}



	
		
}
