package com.priya.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.priya.project.Model.User;
import com.priya.project.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroller {
	@Autowired
	private UserService us;
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
@PostMapping("/save")
public String saveUser(@ModelAttribute User u, HttpSession s) {
	System.out.println(u);
	User u2=us.saveuser(u);
	if(u2!=null) {
		s.setAttribute("msg", "successfully register");
//		System.out.println("Successfull");
	}else {
		System.out.println("Something went wrong");
		s.setAttribute("msg", "something went wrong");
	}
	return "redirect:/register";
}
}
