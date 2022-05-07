package com.developer.project.users.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("/users/loginform")
	public String loginform() {
		
		return "/users/loginform";
	}
	
	@RequestMapping("/users/login")
	public ModelAndView login(ModelAndView mView, UsersDto dto, String url, HttpSession session) {
		
		service.loginProcess(dto, session);
		String encodedUrl=URLEncoder.encode(url);
		// 다시 돌아갈 url정보를 받는다. 
		mView.addObject("url", url);
		mView.addObject("encodedUrl", encodedUrl);
		mView.setViewName("users/login");
		
		return mView;
	}
	
	@RequestMapping("/users/logout")
	public String logout(HttpSession session) {
		//세션에서 id 라는 키값으로 저장된 값 삭제 
		session.removeAttribute("id");
		return "redirect:/home.do";
	}
}
