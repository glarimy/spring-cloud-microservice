package com.glarimy.bank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.Transaction;

@RestController
public class BankController {
	@Autowired
	private Bank bank;

	@GetMapping("/account/{number}/transaction")
	public ResponseEntity<List<Transaction>> history(@PathVariable("number") int number) {
		List<Transaction> list = bank.history(number);
		return new ResponseEntity<List<Transaction>>(list, HttpStatus.OK);
	}

	@GetMapping("/account/{number}")
	public ResponseEntity<Account> find(@PathVariable("number") int number) {
		Account account = bank.find(number);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

}
