package com.bank.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
   
	public User getUserByUsername(String username);
}
