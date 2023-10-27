package com.priya.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {
@GetMapping("/")
	public String index() {
		return "index";
	}
@GetMapping("/register")
public String reg() {
	return "reg";
}
@GetMapping("/login")
public String log() {
	return "login";
}
@GetMapping("/home")
public String home() {
	return "Home";
}
}
