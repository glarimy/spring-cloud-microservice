package com.glarimy.bank.api;

public interface Bank {
	public Account openAccount(Customer customer) throws InvalidRequestException, BankException;
}
