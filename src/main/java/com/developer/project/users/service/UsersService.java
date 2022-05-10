package com.developer.project.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.developer.project.users.dto.UsersDto;

public interface UsersService {

	public void addUser(UsersDto dto);
	public void loginProcess(UsersDto dto, HttpSession session);
	public Map<String, Object> isExistId(String inputId);
	public void deleteUser(HttpSession session, ModelAndView mView);
	public void getInfo(HttpSession session, ModelAndView mView);
	public void updateUser(UsersDto dto, HttpSession session);
}
