package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		//String str = "901012-1234567"; //주민번호
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인
		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		//   예) 90년 10월 12일 또는 1990년 10월 12일
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		//참고) int num = Integer.parseInt("10"); // "10" -> 10
		//---------------------------------------------------
		// 1.
		String str = "951012-1234567";
		System.out.println("주민번호 : " + str);
		System.out.println("----------");
		
		if (str.length() == 14) {
			System.out.println("[정상] 전체자리수 : " + str.length());
		} else {
			System.out.println("[비정상] 전체자리수 : " + str.length());
			// return; // break와 유사, 비정상이면 여기서 끝(작업진행 X) 
		}
		System.out.println("--- 위치 ---");
		// str.substring() 
		if (str.substring(6, 7).equals("-")) {
			System.out.println("[정상] 7번째 문자 '-' ");
		} else {
			System.out.println("[비정상] 7번째 문자 " + str.substring(6, 7));
		}
		// 7번째 문자가 '-'이 아닌 경우 
		if (!"-".equals(str.substring(6, 7))) {
			System.out.println("[비정상2] 7번째 문자 " + str.substring(6, 7));
		}
		
		// str.indexOf()
		if (str.indexOf('-') == 6) { // '-' ->  "-" 도 가능 
			System.out.println("[정상] '-'위치 : " + str.indexOf('-'));
		} 
		if (str.indexOf('-') != 6) { // '-' ->  "-" 도 가능 
			System.out.println("[비정상3] 7번째 문자 '-'가 아님" );
		} 
		// str.charAt() 7번째 위치하는 문자가 뭐냐
		System.out.println("str.charAt(6) : " + str.charAt(6));
		if (str.charAt(6)!='-') {
			System.out.println("[비정상4] 7번째 문자 '-'가 아님");
		}
		System.out.println("--- 생년월일 ---");
		
		// 2.
		//강사님
		String yymmdd = str.substring(0, 6);
		System.out.println("yymmdd : " + yymmdd);
		
		String yy = str.substring(0, 2);
		String mm = str.substring(2, 4);
		String dd = str.substring(4, 6);
		System.out.println(yy + "년 " + mm + "월 " + dd + "일");
		
		char charFlag = str.charAt(7); // 1,2 -> 1900 , 3,4 -> 2000
		String yyyy = "";
		if (charFlag == '1' || charFlag == '2') {
			//System.out.println("19" + yy + "년 " + mm + "월 " + dd + "일");
			yyyy = "19" + yy;
		} else if (charFlag == '3' || charFlag == '4') {
			//System.out.println("20" + yy + "년 " + mm + "월 " + dd + "일");
			yyyy = "20" + yy;
		}
		System.out.println(yyyy + "년 " + mm + "월 " + dd + "일");
		
		String flag = str.substring(7,8);
		System.out.println("flag : " + flag);
		if ("1".equals(flag) || "2".equals(flag)) { // 문자열 비교 equals !! 
			yyyy = "19" + yy;
		} else if("3".equals(flag) || "4".equals(flag)) {
			yyyy = "20" + yy;
		}
		System.out.println(yyyy + "년 " + mm + "월 " + dd + "일");

		System.out.println("--- 성별 ---");
		// 3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		int num = Integer.parseInt(str.substring(7, 8)); // str.charAt(7) 로 하는 법??
		if (num == 1 || num == 3) {
			System.out.println("성별 : 남성");
		} else if (num == 2 || num == 4) {
			System.out.println("성별 : 여성");
		}
		
		// 강사님
		char gender = str.charAt(7);
		if (gender == '1' || gender == '3') {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(남성)");
		} else if (gender == '2' || gender == '4') {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(여성)");
		} else {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(외국인)");
		}
		
		//switch문
		switch (gender) {
			case '1' :
			case '3' : 
				System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(남성)");
				break;
			case '2' : case '4' : 
				System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(여성)");
				break;
			default : 
				System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(외국인)");
		}
		
		System.out.println("--- 월,일 값 검증 ---");
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		str = "951012-1234567";
		String sMonth = str.substring(2, 4); // "10"
		int month = Integer.parseInt(sMonth); // "10" -> int 10
		if (month >= 1 && month <= 12) {   
			System.out.println("[정상] 월 데이터 정상 (1~12)");
		} else {
			System.out.println("[비정상] 월 데이터 : " + sMonth);
		}
		
		if (month < 1 || month > 12) {   // 범위 벗어나면 비정상 
			System.out.println("[비정상] 월 데이터가 1~12가 아님");
		}
		
		int date = Integer.parseInt(str.substring(4, 6)); // 
		if (date >= 1 && date <= 31) {   
			System.out.println("[정상] 일 데이터 정상 (1~31)");
		} else {
			System.out.println("[비정상] 일 데이터가 1~31가 아님");
		}
		
	

		
		
		
		

		
	}

}
