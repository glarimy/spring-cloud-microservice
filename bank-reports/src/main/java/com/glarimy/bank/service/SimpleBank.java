package com.glarimy.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.AccountNotFoundException;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.BankException;
import com.glarimy.bank.api.Transaction;

@Service
public class SimpleBank implements Bank {

	public SimpleBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Transaction> history(int number) throws AccountNotFoundException, BankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account find(int number) throws AccountNotFoundException, BankException {
		// TODO Auto-generated method stub
		return null;
	}

}
