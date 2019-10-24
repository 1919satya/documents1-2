package com.bank.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class UserController {
	protected Logger logger = Logger
			.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	@RequestMapping("/{username}/user")
	public ResponseEntity<User> byUserName(@PathVariable("username") String username) {
		System.out.println("controller "+username);
		logger.info("user-microservice byUsername() invoked: " + username);
		User user = userRepository.getUserByUsername(username);
		logger.info("user-microservice byUsername() found: " + user);
		return new ResponseEntity<User>(user,new HttpHeaders(),HttpStatus.OK);
	}
}
