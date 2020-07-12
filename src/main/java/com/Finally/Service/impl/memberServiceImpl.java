package com.Finally.Service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.Finally.dao.memberVo;
import com.Finally.dao.member_dao;

public class memberServiceImpl {
	@Service
	public class MemberServiceImpl implements memberService {
		
		@Inject member_dao dao;
		@Override
		public void Register(memberVo vo) throws Exception {
			dao.Register(vo);
			
		}
		
	}

}
