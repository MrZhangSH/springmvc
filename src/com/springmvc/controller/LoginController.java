package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(User user) {
		if (null != user && !user.getUserName().isEmpty() && !user.getPassWord().isEmpty()) {
			System.out.println(user);
			return "success";
		}
		return "error";
	}
}
