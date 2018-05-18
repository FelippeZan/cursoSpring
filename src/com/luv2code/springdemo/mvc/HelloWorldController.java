package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld";	
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorldShow";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String toUpperCase(@RequestParam("studentName") String name, Model model) {
		
		name = name.toUpperCase();
		
		String result = "\\o/ \\o/ , " + name;
		
		model.addAttribute("message", result);
		
		return "helloWorldShow";
	}
	
	
}
