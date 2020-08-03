package com.Finally.Service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.Finally.VO.BoardVO;
import com.Finally.dao.impl.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO boardDao;
	
	//1.게시글 쓰기
	@Override
	public void create(BoardVO vo) throws Exception{
		String content=vo.getContent();
		//줄바꿈 문자 처리
		content=content.replace("<","&lt;");
		vo.setContent(content);
		boardDao.create(vo);
	}
	//2.게시글 상세보기
	@Override
	public BoardVO read(int num) throws Exception{
		return boardDao.read(num);
		
	}
	//3.게시글 수정
	@Override 
	public void update(BoardVO vo) throws Exception{
		boardDao.update(vo);
	}
	//4.게시글 삭제
	@Override
	public void delete(int num) throws Exception{
		 boardDao.delete(num);
	}
	//5.게시글 전체 목록
	@Override
	public List<BoardVO> listAll() throws Exception{
		return boardDao.listAll();
	}
	//6.게시글 조회수증가
	@Override
	public void increasereadcount(int num, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		long update_time=0;
		if (session.getAttribute("update_time_"+num) !=null) {
			update_time=(long)session.getAttribute("update_time_"+num);
		}
		//현재 시간 current_time에 저장
		long current_time=System.currentTimeMillis();
		//현재시간-열람시간>일정시간
		if(current_time - update_time>5*1000) {
			boardDao.increasereadcount(num);
			session.setAttribute("update_time"+num,current_time);
			
		}
	}
		
	}