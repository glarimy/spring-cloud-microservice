package com.glarimy.bank.service;

import org.springframework.stereotype.Service;

import com.glarimy.bank.api.AccountNotFoundException;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.BankException;
import com.glarimy.bank.api.InsufficientBalanceException;
import com.glarimy.bank.api.InvalidRequestException;
import com.glarimy.bank.api.Transaction;

@Service
public class SimpleBank implements Bank {

	public SimpleBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Transaction deposite(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction withdraw(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, InsufficientBalanceException, BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
