package com.Finally.dao.impl;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Finally.dto.SignupVO;


@Repository
public abstract class SignupDAO {
	@Inject
	SqlSession sqlSession;
	
	public void insertSignupVO(SignupVO vo) {
		sqlSession.insert("member.insertSignupVO",vo);
	 
	}
}

