package com.sangamone.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class AppController {
	
	@GetMapping("/getMsg")
	public String testing() {
		return "Spring Security";
		
	}

}
