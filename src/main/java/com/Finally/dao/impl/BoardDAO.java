package com.Finally.dao.impl;

import java.util.List;

import com.Finally.VO.BoardVO;

public interface BoardDAO{
		//1.게시글 작성
		public void create(BoardVO vo) throws Exception;
		//2.게시글 상세보기
		public BoardVO read(int num) throws Exception;
		//3.게시글 수정
		public void update(BoardVO vo) throws Exception;
		//4.게시글 삭제
		public void delete(int num) throws Exception;
		//5.게시글 전체 목록
		public List<BoardVO> listAll() throws Exception;
		//6.게시글 조회 증가
		public void increasereadcount(int num) throws Exception;
		
}