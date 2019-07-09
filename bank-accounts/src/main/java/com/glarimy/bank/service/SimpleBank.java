package com.glarimy.bank.service;

import org.springframework.stereotype.Service;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.BankException;
import com.glarimy.bank.api.Customer;
import com.glarimy.bank.api.InvalidRequestException;

@Service
public class SimpleBank implements Bank {

	public SimpleBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Account openAccount(Customer customer) throws InvalidRequestException, BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
