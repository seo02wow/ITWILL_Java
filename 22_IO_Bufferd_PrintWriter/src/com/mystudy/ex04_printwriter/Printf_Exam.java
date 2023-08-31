package com.mystudy.ex04_printwriter;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		// Printf() 메소드 사용시 형식문자 사용 
		int a = 20;
		long b = 300_000_000_000L;
		float c = 34.95f;
		double d = 234.234; 
		char e = 'A';
		String f = "Hello ~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF",today);
		System.out.println();
		
		System.out.println(">>" + a + " " + b + " " + c + " " + 
		d + " " + " " + e + " " + f + " " + g);
		System.out.println();
		
		/* [ ] : 생략 가능
		%[인덱스$][-][크기]형식문자 : %, 형식문자 필수 
		- 기본은 우측정렬 
		= 마이너스 부호는 좌측정렬 사용. 예 ) %-10d
		--------------------------------------*/
		System.out.printf("%d %d %c %s%n", 100, 123 , 'A', "Hello!");
		
		System.out.println("--- 인덱스(파라미터위치값) 사용 ---");
		//[인덱스%] 파라미터 위치값 $ 부호와 함께 사용 (1$ = 1번째 데이터 매칭)
		//[주의] 인덱스 사용하면 데이터 매칭에서 제외됨 %c 첫번째부터 시작 (66 66 B A)
		System.out.printf("%1$d %1$d %c %s%n", 66, 'A', "Hello!"); 
		System.out.println("--- 실수형 데이터 표시 : %f---");
		System.out.printf("%f %1$a %1$e %1$g %n", 65.812345678);
		System.out.printf("%10.3f%n", 65.567890); // 전체자리수 10, 소수점이하 3
		System.out.printf("%-10.3f%n", 65.567890); // 좌측정렬
		System.out.printf("%30.6f%n", 65.5678901234); 
		
		System.out.println("----- 날짜관련 -----");
		System.out.printf("%tF %n", today); // 년월일 2023-08-02 
		System.out.printf("%tT %n", today); // 시간 16:03:11 
		System.out.printf("%ta %n", today); // 요일 수 
		System.out.printf("%1$tY/%1$tm/%1$td %n", today); // 2023/08/02 
		System.out.printf("%1$tY/%1$tm/%1$td(%ta) %n", today);// 2023/08/02(수)
		System.out.printf("%1$tH:%1$tM:%1$tS %n", today); // 시분초 16:03:11 
		System.out.println("-----------------");
		
		String name = "홍길동";
		int kor = 100, eng = 90, math = 81;
		System.out.printf("%s은 국어 %d, 영어 %d, 수학 %d 입니다.%n"
				,name, kor, eng, math);
		System.out.println(name + "은 국어 " + kor + ", 영어 " + eng 
				+ ", 수학 " + math + " 입니다.");
		
		
		
	}

}
