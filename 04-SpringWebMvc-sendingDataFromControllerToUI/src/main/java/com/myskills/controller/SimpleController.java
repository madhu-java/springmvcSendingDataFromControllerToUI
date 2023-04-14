package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	@GetMapping("/simple")
	public String display(Model model) {
		model.addAttribute("message","welcome to sending data from controll to UI");
		return "index";
		
	}

}
