package com.hef.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hef.entity.User;
import com.hef.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/register")
	public String save(@RequestBody User u) {
		
			return service.save(u);
			
	}
	
//	@PostMapping("/login")
//	public String longininfo(@RequestBody Map<String,String> logindata) {
//		
//		
//			return service.longininfo(logindata);
//		
//	}
	
//	@GetMapping("/login")
//	public String longininfo(@RequestParam String username, @RequestParam String password) {
//		
//		
//			return service.longininfo(username, password);
//		
//	}
	
	@GetMapping("/login")
	public String loginInfo(@RequestParam String username, @RequestParam String password) {
	    // Delegate the login logic to the service method
	    return service.longininfo(username, password);
	}

	
	
	
	
	
}
