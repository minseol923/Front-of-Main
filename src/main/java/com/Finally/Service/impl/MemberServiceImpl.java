package com.Finally.Service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Finally.VO.MemberVO;
import com.Finally.dao.impl.MemberDAO;


@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	
	@Override
	public boolean loginCheck(MemberVO vo,HttpSession session) {
		
		boolean result = dao.loginCheck(vo);
		if (result == true) {	//true 일경우 세션 등록
			//세션 변수 등록
			session.setAttribute("mem_id",vo.getMem_id());
		}
		
		return result;
	}

	@Override
	public void logout(HttpSession session) {
		dao.logout(session);
	}
	
	
}