package com.Finally.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Finally.Service.impl.SignupService;
import com.Finally.dto.SignupVO;

@Controller
public class MainController {
    
	
	  @Inject SignupService signupService;
	  
	  @RequestMapping(value="/signup.do", method =RequestMethod.POST)
	  
	  public String insertSignvo(@ModelAttribute SignupVO vo){
		  SignupService.insertSignupProcess(vo); 
		  return "index";
	  
	  }
	 
	/*
	 * @RequestMapping(value = "/signup.do",method =
	 * {RequestMethod.POST,RequestMethod.GET}) public ModelAndView
	 * memberJoinPro(SignupVO vo) { ModelAndView mav = new ModelAndView();
	 * SignupService.insertSignupProcess(vo); mav.setViewName("index"); return mav;
	 * }
	 */

}
