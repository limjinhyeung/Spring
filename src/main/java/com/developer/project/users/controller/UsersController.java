package com.developer.project.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.developer.project.users.dto.UsersDto;
import com.developer.project.users.service.UsersService;


@Controller
public class UsersController {

	@Autowired
	private UsersService service;
	
	@RequestMapping("/users/signupform") //""요청에 대해서 
	public String signupform() {
	
		return "/users/signupform";//""요청으로 처리한다. 
	}	
	
	@RequestMapping(value = "/users/signup", method = RequestMethod.POST)
	public ModelAndView signup(ModelAndView mView, UsersDto dto) {
		
		service.addUser(dto);
		mView.setViewName("users/signup");
		return mView;
	}
}
