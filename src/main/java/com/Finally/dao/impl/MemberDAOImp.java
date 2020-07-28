package com.Finally.dao.impl;

import javax.servlet.http.HttpSession; 
import org.mybatis.spring.SqlSessionTemplate;

import com.Finally.dto.MemberDTO; 



public class MemberDAOImp implements MemberDAO {
	private SqlSessionTemplate sqlSession; 
	public MemberDAOImp() {
		
	} 
public void setSqlSession(SqlSessionTemplate sqlSession) { 
		this.sqlSession = sqlSession; 
} 
public void memberJoinMethod(MemberDTO dto) { 
		sqlSession.insert("member.join", dto); 
}

}

