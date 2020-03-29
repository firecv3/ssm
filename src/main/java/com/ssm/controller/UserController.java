package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.dto.Emp;
import com.ssm.service.ISelectEmpService;
import com.ssm.service.IUserLoginService;

@Controller
public class UserController {
	@Autowired
	IUserLoginService LoginService;
	@RequestMapping("/Login")
	public ModelAndView name(String userName,Integer userPwd ) {
		ModelAndView modelAndView = new ModelAndView();
		if (LoginService.Login(userName, userPwd)) {
			modelAndView.setViewName("res");
		}else {
			modelAndView.setViewName("redirect:/index.jsp");
		}
		return modelAndView;
	}
	@Autowired
	ISelectEmpService selectEmp;
	@RequestMapping("gotoSelect")
	public ModelAndView GotoSelect() {
		ModelAndView modelAndView = new ModelAndView();
		List<Emp> emps = selectEmp.SelectEmp();
		modelAndView.addObject(emps);
		modelAndView.setViewName("forward:/res.jsp");
		return modelAndView;
	}

}
