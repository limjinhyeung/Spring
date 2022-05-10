package com.developer.project.users.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
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
	
	@RequestMapping("/users/logout") //로그아웃 추가하기
	public String logout(HttpSession session) {
		//세션에서 id 라는 키값으로 저장된 값 삭제 
		session.removeAttribute("id");
		return "redirect:/home.do";
	}
	
	@RequestMapping("/users/delete")
	public ModelAndView delete(HttpSession session, ModelAndView mView,HttpServletRequest request) {
		service.deleteUser(session, mView);
		mView.setViewName("users/delete");
		return mView;
	}
	
	@RequestMapping("/users/private/info")
	public ModelAndView info(HttpSession session, ModelAndView mView) {
		service.getInfo(session, mView);
		mView.setViewName("users/info");
		return mView;
	}
	
	@RequestMapping("/users/private/mypage")
	public ModelAndView mypage(HttpSession session, ModelAndView mView, HttpServletRequest request,UsersDto dto) {
		service.getInfo(session, mView);
		mView.setViewName("users/mypage");
		return mView;
	}
	
	@RequestMapping(value="/users/mypageupdate", method = RequestMethod.POST)
	public ModelAndView update(UsersDto dto, HttpSession session, ModelAndView mView, HttpServletRequest request) {
		service.updateUser(dto, session);
		mView.setViewName("users/mypageup");
		return mView;
	}
}
