package com.mystudy.bean_vo;

import java.util.Arrays;

public class StudentManager {

	public static void main(String[] args) {
		/* 3명의 성적 처리 StudentVO 사용 
		"김유신", 100, 90, 81
		"이순신", 95, 88, 92
		"홍길동", 90, 87, 77
		======================
		김유신	100	90	81	271	90.33
		이순신	95	88	92	??? 
		홍길동	90	87	77	???
		 */
		
		// 데이터 생성 
		StudentVO stuvo1 = new StudentVO("김유신", 100, 90, 81);
		StudentVO stuvo2 = new StudentVO("이순신", 95, 88, 92); 
		StudentVO stuvo3 = new StudentVO("홍길동", 90, 87, 77); 
		
		// 화면 출력 
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		printData(stuvo1);
		printData(stuvo2);
		printData(stuvo3);
		System.out.println("----------------------------");

		
		//------------------------------
		StudentVO[] students = new StudentVO[3];
		students[0] = stuvo1;
		students[1] = stuvo2;
		students[2] = stuvo3;
		printData(students);
		
		System.out.println("------------------------");
		students = new StudentVO[] {stuvo1,stuvo2,stuvo3};
		System.out.println(Arrays.toString(students));
		printData(students);
		

		
		
		
		
		
		

	}

	static void printData (StudentVO stuvo) {
		System.out.println(stuvo.getName() + "\t" + stuvo.getKor() + "\t"
	+ stuvo.getEng()+ "\t" + stuvo.getMath() + "\t"+ 
				stuvo.getTot() + "\t"+ stuvo.getAvg());
	}
	
	static void printData(StudentVO[] students) {
		for (int i = 0; i < students.length; i++) {
			printData(students[i]);
		}
	}
	
	
	
	
}
