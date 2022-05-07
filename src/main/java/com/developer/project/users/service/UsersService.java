package com.developer.project.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.developer.project.users.dto.UsersDto;

public interface UsersService {

	public void addUser(UsersDto dto);
	public void loginProcess(UsersDto dto, HttpSession session);
	public Map<String, Object> isExistId(String inputId);
}
