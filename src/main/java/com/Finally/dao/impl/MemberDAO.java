package com.Finally.dao.impl;

import java.util.List; 
import javax.servlet.http.HttpSession;

import com.Finally.dto.MemberDTO; 

public interface MemberDAO {
	// 회원가입 메소드 
	public void memberJoinMethod(MemberDTO dto);
}

