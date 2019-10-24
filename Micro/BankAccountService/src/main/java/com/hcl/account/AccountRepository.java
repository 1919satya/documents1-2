package com.hcl.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
		   
		public Account getAccountByuserid(int userid);
	}


