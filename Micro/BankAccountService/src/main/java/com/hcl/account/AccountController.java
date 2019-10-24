package com.hcl.account;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/account")
public class AccountController {
	@Autowired 
	AccountService as;
	@RequestMapping(value="get/{userid}")
	public Account getAccountByuser(@PathVariable int userid) {
		
	return as.getAccountByuserid(userid);
	}
	@RequestMapping(value="getAll")
	public List<Account> getAllAccounts(){
		return as.getAllAccounts();
	}
	@RequestMapping(value="add")
	public String addAccounts(@RequestBody Account account){
		return as.addAccounts(account);
	}
	@RequestMapping(value="delete/{accno}")
	public String deleteAccounts(@PathVariable int accno){
		return as.deleteAccounts(accno);
	}
}
