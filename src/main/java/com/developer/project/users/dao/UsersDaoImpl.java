package com.developer.project.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.developer.project.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{

	@Autowired
	private SqlSession session; 

	@Override  // 회원가입
	public void insert(UsersDto dto) { //User의 정보가 담긴 dto를 인자로 받아 mapper로 넘긴다. 
		//mapper에 설정된 insert문을 실행한다.
		session.insert("users.insert",dto);
	}

	@Override // DB에 저장된 id불러오기
	public UsersDto getData(String id) {
		//id 여부를 확인할 클래스
		return session.selectOne("users.getData", id);
	}

	@Override
	public boolean isExist(String inputId) { //로그인시 id가 존재하는지 확인 여부
		String id=session.selectOne("users.isExist", inputId);
		if(id==null) {
			return false;
		}else {
			return true;
		}
	}
}
