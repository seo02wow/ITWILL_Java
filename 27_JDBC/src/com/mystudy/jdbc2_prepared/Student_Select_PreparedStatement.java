package com.mystudy.jdbc2_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_Select_PreparedStatement {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
			
			//2. DB연결 - Connection 객체 생성 <- DriverManager
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"mystudy", "mystudypw");
			
			//3. Statement 문 실행(SQL 문 실행)
			String sql = ""
					+ "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG "
					+ "FROM STUDENT "
					+ "WHERE ID = ? "; // ? : 데이터 설정 위치 지정
			// 3-1. Connection 객체로부터 PreparedStatement 객체 생성 
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수) 위치에 값 설정
			String id = "2023011";
			pstmt.setString(1, id);
			
			System.out.println("sql : " + sql);
			rs = pstmt.executeQuery(); // 준비되어 있는 SQL문 실행요청 
			
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			// while -> 데이터 여러개(전체) , if -> 데이터 1개
			if (rs.next()) {
				String str = ""
						+ rs.getString("ID") + "\t"
						+ rs.getString("NAME") + "\t"
						+ rs.getInt("KOR") + "\t"
						+ rs.getInt("ENG") + "\t"
						+ rs.getInt("MATH") + "\t"
						+ rs.getInt("TOT") + "\t"
						+ rs.getDouble("AVG");
				System.out.println(str);
			}
			//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
			
			//5. 클로징 처리에 의한 자원 반납
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
