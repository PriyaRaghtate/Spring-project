package com.priya.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priya.Registration.model.User;
import com.priya.Registration.repository.repo;
@Controller
public class Homecontroller {
	@Autowired
private repo r;
@RequestMapping("/")
String home() {
	return "index";
}
@RequestMapping("/reg")
String reg(Model m) {
	m.addAttribute("user", new User());
	return "registration";
}
@RequestMapping("/process_register")
String process(User u) {
	BCryptPasswordEncoder pass=new BCryptPasswordEncoder();
	String EncodedPass=pass.encode(u.getPass());
	u.setPass(EncodedPass);
	r.save(u);
	return "reg_success";
}
@RequestMapping("/users")
String listUser(Model m) {
	List<User> listUsers=r.findAll();
	m.addAttribute("listUsers", listUsers);
	return "user";
}
}
