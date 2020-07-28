package com.Finally.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.Finally.Service.impl.MemberService;
import com.Finally.dto.MemberDTO;

public class MainController {
	@RequestMapping(value = "/memberjoinpro.do", method={RequestMethod.GET, RequestMethod.POST}) 
	@ResponseStatus(value=HttpStatus.OK)
	public ModelAndView memberJoinPro(MemberDTO dto) {
		ModelAndView mav = new ModelAndView(); 
		MemberService.memberJoinProcess(dto);
		mav.setViewName("memberloginform"); 
		return mav;
		
	}

}
