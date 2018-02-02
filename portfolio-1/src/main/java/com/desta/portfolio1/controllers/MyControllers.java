package com.desta.portfolio1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MyControllers {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/me")
	public String about() {
		return "about.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "myprojects.html";
	}

}
