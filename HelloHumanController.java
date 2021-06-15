package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloHumanController {
	
	@RequestMapping("/")
	public String helloName(@RequestParam(value = "first_name", required = false) String first_name,
							@RequestParam(value = "last_name", required = false) String last_name) {
		
		if (first_name != null) {
			if(last_name != null) {
				return "Hello " + first_name + " " + last_name + "!" + " Welcome to Springboot!";
			}
			return "Hello " + first_name + "!" + " Welcome to Springboot!";
		} else {
			return "Hello Human! Welcome to SpringBoot!";
		}
	}
//	@RequestMapping("/my_server")
//	public String helloHuman() {
//		return "Hello Human! Welcome to SpringBoot!";
//		
//	}
//	
//	@RequestMapping("/my_server/{f_name}")
//	public String helloName(@PathVariable("f_name") String x) {
//		String output = "";
//		if (x.equals(x)) {
//			output = "Hello " + x + "! Welcome to SpringBoot!";
//		}
//		return output;
//	}
//	
//	@RequestMapping("/my_server/{f_name}/{l_name}")
//	public String helloName(@PathVariable("f_name") String x, @PathVariable("l_name") String y) {
//		String output = "";
//		if (x.equals(x)) {
//			output = "Hello " + x + " " + y + "! Welcome to SpringBoot!";
//		}
//		return output;
//	}
}
