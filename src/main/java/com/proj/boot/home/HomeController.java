package com.proj.boot.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String getHome() {
		return "This is Home Page Response";
		
	}

}
