package com.fashionkings.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("users")

public class usersController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String allUsers() {
		System.out.println("the users controller ran");
		///get products from DBase
		return "users";
	}

}

