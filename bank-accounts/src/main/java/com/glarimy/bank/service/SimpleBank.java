package com.glarimy.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.BankException;
import com.glarimy.bank.api.Customer;
import com.glarimy.bank.api.InvalidRequestException;
import com.glarimy.bank.db.AccountRepository;

@Service
public class SimpleBank implements Bank {
	@Autowired
	private AccountRepository repo;

	public SimpleBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account openAccount(Customer customer) throws InvalidRequestException, BankException {
		Account account = new Account();
		account.setCustomer(customer);
		return repo.save(account);
	}

}
