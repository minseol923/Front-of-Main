package com.Finally.dao.impl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Finally.dao.memberVo;
import com.Finally.dao.member_dao;

@Repository
public class MemberDAOImpl implements member_dao {
	
	@Inject SqlSession sql;
	// 회원가입

	@Override
	public void Register(memberVo vo) throws Exception {
		sql.insert("memberMapper.Register", vo);
	}
}