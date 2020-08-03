package com.Finally.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Finally.VO.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	SqlSession SqlSession;
	//01.�Խñ� �ۼ�
	@Override
	public void create(BoardVO vo) throws Exception{
		SqlSession.insert("board.insert",vo);
	}
	//02.�Խñ� �󼼺���
	@Override
	public BoardVO read(int num) throws Exception {
		return SqlSession.selectOne("boardView",num);
	}
	//03.�Խñ� ����
	@Override 
	public void update(BoardVO vo) throws Exception{
		SqlSession.update("board.updateArticle", vo);
	}//04.�Խñ� ����
	@Override
	public void delete(int num) throws Exception{
		SqlSession.delete("board.deleteArticle",num);
	}
	//05.�Խñ� ��ü ���
	@Override
	public List<BoardVO> listAll() throws Exception{
		return SqlSession.selectList("board.listAll");
	}
	//06.�Խñ� ��ȸ�� ����
	@Override
	public void increasereadcount(int num) throws Exception{
		SqlSession.update("board.increasereadcount",num);
		
	}
	
}