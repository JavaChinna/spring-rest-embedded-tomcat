package com.javachinna.controller;

import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	private Logger logger = Logger.getLogger(GreetController.class);

	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name, ModelMap model) {
		String greet = "Hello!!! " + name + " How are You?";
		logger.info(greet);
		return greet;
	}
}