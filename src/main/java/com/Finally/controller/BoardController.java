package com.Finally.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Finally.Service.impl.BoardService;
import com.Finally.VO.BoardVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	BoardService boardService;
	
	//1.�Խñ� ���
	@RequestMapping("list.do")
	public ModelAndView list() throws Exception{
		List<BoardVO> list =boardService.listAll();
		ModelAndView mav =new ModelAndView();
		mav.setViewName("board/list");
		mav.addObject("list",list);
		return mav;

	}
	//2.�Խñ� �ۼ�ȭ��
		@RequestMapping(value="write.do",method=RequestMethod.GET)
		public String write() {
			return "board/write";		
		}
	//2-1.�ۼ�ó��
		@RequestMapping(value="insert.do",method=RequestMethod.POST)
		public String insert(@ModelAttribute BoardVO vo) throws Exception{
			boardService.create(vo);
			return "redirect:list.do";
		}
		
		//3.�󼼳��� ��ȸ,��ȸ�� ����
		@RequestMapping(value="view.do",method=RequestMethod.GET)
		public ModelAndView ModelAndView(@RequestParam int num,HttpSession session) throws Exception{
			boardService.increasereadcount(num,session);  
			ModelAndView mav =new ModelAndView();
			mav.setViewName("board/view");
			mav.addObject("dto",boardService.read(num));
			return mav;
		}
		
		//4.�Խñ� ����
		@RequestMapping(value="update.do",method=RequestMethod.POST)
		public String update(@ModelAttribute BoardVO vo) throws Exception{
			boardService.update(vo);
			return "redirect:list.do";
		}
		
		//5.�Խñ� ����
		@RequestMapping(value="delete.do")
		public String delete(@RequestParam int num) throws Exception{
			boardService.delete(num);
			return "redirect:list.do";
		}
}
