package com.glarimy.bank.api;

public interface Bank {
	public Transaction deposite(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, BankException;

	public Transaction withdraw(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, InsufficientBalanceException, BankException;
}
