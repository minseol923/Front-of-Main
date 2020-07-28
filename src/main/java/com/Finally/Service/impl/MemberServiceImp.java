package com.Finally.Service.impl;

import java.io.IOException; 
import java.util.List; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.Finally.dao.impl.MemberDAO;
import com.Finally.dto.MemberDTO;

public class MemberServiceImp implements MemberService { 
	private MemberDAO dao; 
	public void setDao(MemberDAO dao) { 
			this.dao = dao;
 } 
// 회원가입 
@Override 
public void memberJoinProcess(MemberDTO dto) {
	dao.memberJoinMethod(dto);
 }
}
