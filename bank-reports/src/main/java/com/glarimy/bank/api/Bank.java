package com.glarimy.bank.api;

import java.util.List;

public interface Bank {
	public List<Transaction> history(int number) throws AccountNotFoundException, BankException;;

	public Account find(int number) throws AccountNotFoundException, BankException;;
}
