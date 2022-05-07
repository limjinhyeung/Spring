package com.developer.project.users.dao;

import com.developer.project.users.dto.UsersDto;

public interface UsersDao {

	public void insert(UsersDto dto); 
	public UsersDto getData(String id);
	public boolean isExist(String inputId);

}
