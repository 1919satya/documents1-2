package com.bank.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	public UserRepository userRepository;
	
	public User getUserByUsername(String username) {
		System.out.println("controller "+username);
		User user=userRepository.getUserByUsername(username);
		return user;
	}

}
