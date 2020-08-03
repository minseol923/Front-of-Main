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
	
	//1.�Խñ� ����
	@Override
	public void create(BoardVO vo) throws Exception{
		String content=vo.getContent();
		//�ٹٲ� ���� ó��
		content=content.replace("<","&lt;");
		vo.setContent(content);
		boardDao.create(vo);
	}
	//2.�Խñ� �󼼺���
	@Override
	public BoardVO read(int num) throws Exception{
		return boardDao.read(num);
		
	}
	//3.�Խñ� ����
	@Override 
	public void update(BoardVO vo) throws Exception{
		boardDao.update(vo);
	}
	//4.�Խñ� ����
	@Override
	public void delete(int num) throws Exception{
		 boardDao.delete(num);
	}
	//5.�Խñ� ��ü ���
	@Override
	public List<BoardVO> listAll() throws Exception{
		return boardDao.listAll();
	}
	//6.�Խñ� ��ȸ������
	@Override
	public void increasereadcount(int num, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		long update_time=0;
		if (session.getAttribute("update_time_"+num) !=null) {
			update_time=(long)session.getAttribute("update_time_"+num);
		}
		//���� �ð� current_time�� ����
		long current_time=System.currentTimeMillis();
		//����ð�-�����ð�>�����ð�
		if(current_time - update_time>5*1000) {
			boardDao.increasereadcount(num);
			session.setAttribute("update_time"+num,current_time);
			
		}
	}
		
	}