package com.mystudy.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mystudy.common.CommonJDBCUtill;
import com.mystudy.member.vo.MemberVO;

public class MemberDAO {
	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 전체 데이터 검색(찾기) - selelctAll() : list<MemberVO>
	public List<MemberVO> selelctAll(){
		List<MemberVO> list = null;
			

		try {
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = CommonJDBCUtill.getConnection();
			
			StringBuilder sb = new StringBuilder(); 
			sb.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ");
			sb.append("	FROM MEMBER ");
			sb.append("	ORDER BY ID");
			
			//3. Statement 문 실행(SQL 문 실행)
			pstmt = conn.prepareStatement(sb.toString());
			
			list = new ArrayList<MemberVO>();
			rs = pstmt.executeQuery();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			while (rs.next()) {
				MemberVO vo = new MemberVO(
						rs.getString("ID"),
						rs.getString("NAME"),
						rs.getString("PASSWORD"),
						rs.getString("PHONE"),
						rs.getString("ADDRESS"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CommonJDBCUtill.close(conn, pstmt, rs);
		}
		
		//5. 클로징 처리에 의한 자원 반납
		
		return list;
	}
	
	//(실습) INSERT : VO 전달받아 데이터 입력처리 - insert(vo) : int
	public int insert(MemberVO vo) {
		int count = 0;
		
		try {
			conn = CommonJDBCUtill.getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO MEMBER ");
			sql.append("	   (ID, NAME, PASSWORD, PHONE, ADDRESS) ");
			sql.append("VALUES (?, ?, ?, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			int i = 1;
			pstmt.setString(i++, vo.getId());
			pstmt.setString(i++, vo.getName());
			pstmt.setString(i++, vo.getPassword());
			pstmt.setString(i++, vo.getPhone());
			pstmt.setString(i++, vo.getAddress());
		
			count = pstmt.executeUpdate();
		
		} catch (Exception e) { // 모든 예외 잡기
			System.out.println("[예외발생] 접속 실패 : " + e.getMessage());
			count = -1;
		} finally {
			CommonJDBCUtill.close(conn, pstmt);
		}
		
		return count;
		
	}
	
	
	
}
