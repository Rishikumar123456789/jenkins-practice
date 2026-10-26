package com.sri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	@GetMapping("/welcome")
  public String wleocome() {
	  return "Welcome to App";
  }
}
