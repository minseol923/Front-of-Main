package com.Finally.controller;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Finally.Service.impl.memberService;
import com.Finally.dao.memberVo;


	@Controller
	@RequestMapping("/index")
	public class MemberController {

		private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
		
		@Inject
		memberService service;
	// 회원가입 post
		@RequestMapping(value="/Register", method = {RequestMethod.GET, RequestMethod.POST})
		public String postRegister(memberVo vo) throws Exception {
			logger.info("post Register");
			service.Register(vo);
			return null;
		}
	}

