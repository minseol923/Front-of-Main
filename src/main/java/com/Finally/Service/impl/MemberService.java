package com.Finally.Service.impl;

import javax.servlet.http.HttpSession;

import com.Finally.VO.MemberVO;


public interface MemberService {

	//�α��� üũ
	public boolean loginCheck(MemberVO vo,HttpSession session);
	
	//�α� �ƿ�
	public void logout(HttpSession session);
	
}
