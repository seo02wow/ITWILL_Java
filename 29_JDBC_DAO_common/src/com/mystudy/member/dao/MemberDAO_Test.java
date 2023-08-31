package com.mystudy.member.dao;

import java.util.List;

import com.mystudy.member.vo.MemberVO;

public class MemberDAO_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		List<MemberVO> list = dao.selelctAll();
		
		for (MemberVO vo : list) {
			System.out.println(vo);
		}
		
		System.out.println("--- insert(vo) ---");
		MemberVO member = new MemberVO("seo0","김서영","1234","010-3333-3333","의정부");
		int insertCount = dao.insert(member);
		System.out.println("입력 건수 : " + insertCount);
		
		for (MemberVO vo : list) {
			System.out.println(vo);
		}
	}

}
