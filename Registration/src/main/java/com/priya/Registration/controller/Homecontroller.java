package com.priya.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priya.Registration.repository.repo;
@Controller
public class Homecontroller {
	@Autowired
private repo r;
@RequestMapping("/")
String home() {
	return "index";
}
}
