package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Witaj w Sklepie Internetowym!");
		model.addAttribute("tagline", "Wyj¹tkowym i jedynym sklepie internetowym!");
		model.addAttribute("text", "Moj tekst");
		return "welcome";
	}
	@RequestMapping("/przyklad")
	public String ex() {
		return "ex";
	}

}
