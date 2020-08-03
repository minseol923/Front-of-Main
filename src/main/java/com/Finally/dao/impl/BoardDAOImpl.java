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
	//01.게시글 작성
	@Override
	public void create(BoardVO vo) throws Exception{
		SqlSession.insert("board.insert",vo);
	}
	//02.게시글 상세보기
	@Override
	public BoardVO read(int num) throws Exception {
		return SqlSession.selectOne("boardView",num);
	}
	//03.게시글 수정
	@Override 
	public void update(BoardVO vo) throws Exception{
		SqlSession.update("board.updateArticle", vo);
	}//04.게시글 삭제
	@Override
	public void delete(int num) throws Exception{
		SqlSession.delete("board.deleteArticle",num);
	}
	//05.게시글 전체 목록
	@Override
	public List<BoardVO> listAll() throws Exception{
		return SqlSession.selectList("board.listAll");
	}
	//06.게시글 조회수 증가
	@Override
	public void increasereadcount(int num) throws Exception{
		SqlSession.update("board.increasereadcount",num);
		
	}
	
}