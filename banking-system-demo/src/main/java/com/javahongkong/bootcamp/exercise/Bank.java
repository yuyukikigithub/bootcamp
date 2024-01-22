package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface{
	private LinkedHashMap<Long, Account> accounts; // object reference
	public static Long accountNo= Long.valueOf(442165000000L);

	public Bank() {
		// complete the function
		this.accounts=new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		if (!(this.accounts.containsKey(accountNumber))) {
			throw new IllegalArgumentException("Invalid accountNumer");
		}
		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		accountNo++;
		Long openCommercialAccount = accountNo;
		CommercialAccount comAcc=new CommercialAccount(company,openCommercialAccount , pin, startingDeposit);
		this.accounts.put(openCommercialAccount, comAcc);
		return openCommercialAccount;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		accountNo++;
		Long openConsumerAccount = accountNo;
		ConsumerAccount conAcc=new ConsumerAccount(person,openConsumerAccount, pin, startingDeposit);
		this.accounts.put(openConsumerAccount, conAcc);
		return openConsumerAccount;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return pin==this.accounts.get(accountNumber).getPin();
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		if (!(this.accounts.containsKey(accountNumber))) {
			throw new IllegalArgumentException("Invalid accountNumer");
		}
		return this.getAccount(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return this.accounts.get(accountNumber).debitAccount(amount);
	}
	public static void main(String[] args) {
		Bank bank= new Bank();
		Person person1ameliaPond = new Person("Amelia", "Pond", 1);
		Long ameliaPond = bank.openConsumerAccount(person1ameliaPond, 1111, 0.0);
		System.out.println(ameliaPond);

		Company company1acmeCorp = new Company("Acme Corp", 1);
		Long acmeCorp = bank.openCommercialAccount(company1acmeCorp, 1111, 0.0);
		System.out.println(acmeCorp);
	
	}
}
