package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "Hello World !");
		model.addAttribute("hello2", "yoyo");
		return "hello";
	}
	
}