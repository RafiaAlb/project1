package com.EIF.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	//@GetMapping("/hi") use this or requestmapping both are same
	@RequestMapping("/hi")
	public String hi() {
		return "Good Afternoon User";
	}
	@GetMapping ("/Hello")
	public String Hello()
	{
		return "Hello user how are you";
	}

}
