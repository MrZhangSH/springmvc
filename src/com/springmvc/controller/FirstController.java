package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	public static String SUCCESS = "success";

	@RequestMapping("/firstRequest")
	public String firstRequest() {
		System.out.println("firstRequest");
		return SUCCESS;
	}

}
