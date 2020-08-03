package com.Finally.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Finally.dto.SignupVO;

@Service
public class SignupServiceImpl implements SignupService { 
		private SignupVO vo;
		public void setDao(SignupVO vo) { 
			this.vo = vo; 
		} // 회원가입 
	public void insertSignupProcess(SignupVO vo) {
			vo.insertSignupVO(vo); 
			
		} 
	}



