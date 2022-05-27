package com.proj.boot.account;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	private static final Logger LOG = Logger.getLogger("AccountController");
	@RequestMapping("/account")
	public Account getAccount() {
		Account acc = new Account(6850, "Arun S", 4500.80);
		return acc;

	}

	@RequestMapping("/accounts")
	public List<Account> getAllAccounts(){
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(1002,"John T",3456.65));
		accounts.add(new Account(1034,"Kumar",7890));
		accounts.add(new Account(1054,"Sree",1883.78));
		return accounts;
	}

	@PostMapping("/add-account")
	public String addAccount(@RequestBody Account account) {
		LOG.info(account.toString());
		return "success";
	}
}
