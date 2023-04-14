package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myskills.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/getStudent")
	public String getData(Model model) {
		Student stu= new Student();
		stu.setSid(100);
		stu.setSname("Madhu");
		stu.setAge(33);
		stu.setAddress("hyd");
		
		stu.setDegree("Degree");
		
		model.addAttribute("student", stu);
		
		
		return "student";
	}

}
