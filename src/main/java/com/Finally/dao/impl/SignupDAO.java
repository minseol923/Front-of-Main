package com.Finally.dao.impl;

import java.util.List; 
import javax.servlet.http.HttpSession;

import com.Finally.dto.MemberDTO; 

public interface MemberDAO {
	// ȸ������ �޼ҵ� 
	public void memberJoinMethod(MemberDTO dto);
}

