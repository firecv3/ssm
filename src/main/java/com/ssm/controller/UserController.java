package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.service.IUserLoginService;

@Controller
public class UserController {
	@Autowired
	IUserLoginService LoginService;
	@RequestMapping("/Login.action")
	public ModelAndView name(String userName,String userPwd ) {
		ModelAndView modelAndView = new ModelAndView();
		if (LoginService.Login(userName, userName)) {
			modelAndView.setViewName("res");
		}else {
			modelAndView.setViewName("forward:/index.jsp");
		}
		return modelAndView;
	}
}
