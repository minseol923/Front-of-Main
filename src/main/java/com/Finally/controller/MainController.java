package com.Finally.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Finally.Service.impl.SignupService;
import com.Finally.VO.SignupVO;

@Controller
public class MainController {
	 @Inject 
	 SignupService signupService; 
	  @RequestMapping(value="/signup.do", method =RequestMethod.POST)
	  public ModelAndView insertSignvo(@RequestParam SignupVO vo){
		  ModelAndView mav = new ModelAndView();
		  SignupService.insertSignupProcess(vo); 
		  mav.setViewName("memberloginform");
		  return mav;
	  
	  }

}
