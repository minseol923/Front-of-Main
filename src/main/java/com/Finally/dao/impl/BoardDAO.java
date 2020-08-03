package com.Finally.dao.impl;

import java.util.List;

import com.Finally.VO.BoardVO;

public interface BoardDAO{
		//1.�Խñ� �ۼ�
		public void create(BoardVO vo) throws Exception;
		//2.�Խñ� �󼼺���
		public BoardVO read(int num) throws Exception;
		//3.�Խñ� ����
		public void update(BoardVO vo) throws Exception;
		//4.�Խñ� ����
		public void delete(int num) throws Exception;
		//5.�Խñ� ��ü ���
		public List<BoardVO> listAll() throws Exception;
		//6.�Խñ� ��ȸ ����
		public void increasereadcount(int num) throws Exception;
		
}