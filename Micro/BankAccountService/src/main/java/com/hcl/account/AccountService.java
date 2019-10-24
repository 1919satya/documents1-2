package com.hcl.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public Account getAccountByuserid(int userid) {
		Account a=accountRepository.getAccountByuserid(userid);
		return a;
	}
public List<Account> getAllAccounts(){
	List<Account> lst=(List<Account>) accountRepository.findAll();
	return lst;
}
public String addAccounts(Account accno){
	Account lst= accountRepository.save(accno);
	return "Account saved";
}
public String deleteAccounts(int  accno){
 accountRepository.deleteById(accno);
	return "Removed";
}
}
