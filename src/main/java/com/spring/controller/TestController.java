package com.spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
	
	@GetMapping("test")
	public String getMethodName() {
		System.out.println("Testing..");
		return new String("Hello Spring3");
	}
	

}
