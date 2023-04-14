package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddingMoreAttributesToModel {
	@GetMapping("/moreAttributes")
	public String getCourse(Model model) {
		model.addAttribute("courseId","120");
		model.addAttribute("courseName","Java");
		model.addAttribute("coursePrice","12000");
		
		
		return "course";
	}

}
