package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class Random_Exam3 {

	public static void main(String[] args) {
		// 오늘 당신의 행운지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기 
		// 실행결과 출력 
		// 예) 2023년 7월 31일 당신의 행운지수(0~100) : 
		//-----------------------------------------------
		Calendar calendar = Calendar.getInstance(); // new X
		int year = calendar.get(Calendar.YEAR); // == get(1); 
		int month = calendar.get(Calendar.MONTH) + 1; 
		// 0(1월) ~ 11(12월) 이기 때문에 +1 해줘야 함 
		int date = calendar.get(Calendar.DATE);
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		String yyyymmdd = year + "년 " + month + "월 " + date + "일";
		System.out.println("-----------------------------");
		
		
		//방법1 Math.random()
		System.out.println("------ Math.random() ------");
		int random = (int)(Math.random() * 101);
		System.out.println(yyyymmdd + " 행운지수(0~100) : " + random);
		
		//방법2 Random nextInt(숫자)
		System.out.println("----- Random nextInt(숫자) -----");
		Random ran = new Random();
		int happy = ran.nextInt(101); // 0~100
		System.out.println(yyyymmdd + " 행운지수(0~100) : " + happy);

	}

}
