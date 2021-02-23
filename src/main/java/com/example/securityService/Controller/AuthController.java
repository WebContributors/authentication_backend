package com.example.securityService.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AuthController{
	@GetMapping("/")
	public String test (){
		return ("<h1>Welcome</h1>");
	}

}
