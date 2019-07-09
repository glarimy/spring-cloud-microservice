package com.glarimy.bank.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.glarimy.bank.api.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

}
