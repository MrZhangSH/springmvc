package com.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.model.User;

@SessionAttributes("user")
@Controller
public class SpringMVCController {

	// @ModelAttribute
	public void getUser(
			@RequestParam(value = "id", required = false) Integer id,
			Map<String, Object> map) {
		if (null != id) {
			// 模拟从数据库中获取数据
			User user = new User(id, "章先生", "abcdefg");
			System.out.println("User from DB:" + user);
			map.put("testuser", user);
		}

	}

	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(@ModelAttribute("testuser") User user) {
		System.out.println("修改User：" + user);
		return "success";
	}
}
