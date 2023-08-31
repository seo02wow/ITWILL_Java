package com.mystudy.jdbc2_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Insert_PreparedStatement {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		
		try {//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			System.out.println(">> DB 연결 성공");
			//3. Statement 문 실행(SQL 문 실행)
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "	   (ID, NAME, KOR, ENG, MATH)";
			sql += "VALUES (?, ?, ?, ?, ?)";
			//3-1. SQL문 실행을 위한 준비(PreparedStatement 객체 생성)
			pstmt = conn.prepareStatement(sql);
			
			//3-2. SQL 문장 ? 위치에 값 설정(매칭,대입)
			String id = "";
			String name = "테스트11";
			int kor = 100;
			int eng = 90;
			int math = 82;
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, math);
			
			//3-3. 준비된 SQL문 실행요청 
			int result = pstmt.executeUpdate();
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
			System.out.println("처리건수 : " + result);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//5. 클로징 처리에 의한 자원 반납
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
