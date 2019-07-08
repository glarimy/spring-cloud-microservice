package com.glarimy.bank.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.Customer;
import com.glarimy.bank.api.Transaction;

// https://bitbucket.org/glarimy/glarimy-resources/src/master/rest-api

@RestController
public class BankController {
	@Autowired
	private Bank bank;

	@PostMapping("/account")
	public ResponseEntity<Account> open(@RequestBody Customer customer, UriComponentsBuilder builder) {
		Account account = bank.openAccount(customer);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/account/{number}").buildAndExpand(account.getNumber()).toUri());
		return new ResponseEntity<Account>(account, headers, HttpStatus.CREATED);
	}

	@PostMapping("/account/{number}/transaction")
	public ResponseEntity<Transaction> transact(@PathVariable("number") int number, @RequestParam("type") String type,
			@RequestParam("amount") double amount, UriComponentsBuilder builder) {
		if (type.equalsIgnoreCase("deposite")) {
			Transaction tx = bank.deposite(number, amount);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(
					builder.path("/account/{number}/transaction/{id}").buildAndExpand(number, tx.getId()).toUri());
			return new ResponseEntity<Transaction>(tx, headers, HttpStatus.CREATED);

		} else if (type.equalsIgnoreCase("withdraw")) {
			Transaction tx = bank.withdraw(number, amount);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(
					builder.path("/account/{number}/transaction/{id}").buildAndExpand(number, tx.getId()).toUri());
			return new ResponseEntity<Transaction>(tx, headers, HttpStatus.CREATED);

		} else {
			return new ResponseEntity<Transaction>(HttpStatus.BAD_REQUEST);
		}
	}

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
