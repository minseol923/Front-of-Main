package com.Finally.dao.impl;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Finally.VO.MemberVO;



@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	//�α��� üũ
	public boolean loginCheck(MemberVO vo) {
		System.out.println("===> Mybatis�� loginCheck() ��� ó��");
		String name = sqlSession.selectOne("memberMapper.loginCheck",vo);
		
		// �˻��� �ȵǸ� 0�� ��ȯ���ֱ� ������ 0�� ���ؼ� ���̸� false, Ʋ���� true�� ��ȯ
		return (Integer.parseInt(name)==0)?false:true;
	}
	
	//�α� �ƿ�
	public void logout(HttpSession session) {
		System.out.println("===> �α׾ƿ� ��� ó��");
		session.invalidate();
	}
	
}