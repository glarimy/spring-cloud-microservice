package com.glarimy.bank.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.glarimy.bank.api.Account;
import com.glarimy.bank.api.Bank;
import com.glarimy.bank.api.Customer;

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
}
