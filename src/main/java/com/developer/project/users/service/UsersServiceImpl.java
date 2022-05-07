package com.developer.project.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.project.users.dao.UsersDao;
import com.developer.project.users.dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao dao;
	
	@Override
	public void addUser(UsersDto dto) {
		
		// UsersDao에 있는 insert
		dao.insert(dto);
	}

	
}
