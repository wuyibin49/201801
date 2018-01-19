package com.wuyibin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wuyibin.vo.UserVo;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	/*
	 * 
	 */
	@RequestMapping("")
	public ModelAndView login() {
		System.out.println("===============login===============");
		ModelAndView model =  new ModelAndView("login");
		
		return model;
	}
	@RequestMapping("/love")
	public ModelAndView login1(UserVo user) {
		System.out.println("=================love===================");
		ModelAndView model =  new ModelAndView("index");
		if("username".equals(user.getUsername())&&"password".equals(user.getPassword())) {
			model.addObject("username", user.getUsername());
		}
		model.addObject("path", "/Zhuoku126.jpg");
		String rootpath = System.getProperty("user.dir");
		System.out.println(rootpath);
		System.out.println(model.toString());
		return model;
	}
}
