package com.lta.springthymeleaflayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("title", "My index");
		model.addAttribute("pageNumber", 1);
		
		return "index";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("title", "My list");
		model.addAttribute("pageNumber", 2);		
		
		return "list";
	}
	
	@RequestMapping("/contact")
	public String contact(Model model) {
		
		model.addAttribute("title", "My contact");
		model.addAttribute("pageNumber", 3);		
		
		return "contact";
	}	
}
