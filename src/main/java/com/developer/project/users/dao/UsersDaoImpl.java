package com.developer.project.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.developer.project.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{

	@Autowired
	private SqlSession session; 

	@Override
	public void insert(UsersDto dto) { //User의 정보가 담긴 dto를 인자로 받아 mapper로 넘긴다. 
		//mapper에 설정된 insert문을 실행한다.
		session.insert("users.insert",dto);
	}
}
