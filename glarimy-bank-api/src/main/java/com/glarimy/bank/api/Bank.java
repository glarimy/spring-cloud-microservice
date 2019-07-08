package com.glarimy.bank.api;

import java.util.List;

public interface Bank {
	public Account openAccount(Customer customer) throws InvalidRequestException, BankException;

	public Transaction deposite(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, BankException;

	public Transaction withdraw(int number, double amount)
			throws AccountNotFoundException, InvalidRequestException, InsufficientBalanceException, BankException;

	public List<Transaction> history(int number) throws AccountNotFoundException, BankException;;

	public Account find(int number) throws AccountNotFoundException, BankException;;
}
