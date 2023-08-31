package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("stu : " + stu.toString());  // object 클래스에 있는 메소드

		// System.out.println("stu.name : " + stu.name); // not visible
		stu.setName("홍길동");
		String name = stu.getName();
		System.out.println("name : " + name);
		System.out.println("name : " + stu.getName());
		
		System.out.println("입력 전 kor : " + stu.getKor());
		stu.setKor(99); // kor 점수 설정
		System.out.println("입력 후 kor : " + stu.getKor());
		
		
		
		System.out.println("입력 전 eng : " + stu.getEng());
		stu.setEng(100);
		System.out.println("입력 후 eng : " + stu.getEng());
		
		System.out.println("입력 전 math : " + stu.getMath());
		stu.setMath(99);
		System.out.println("입력 후 math : " + stu.getMath());
		
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println("tot : " + tot);
		
		stu.setTot(tot); // 계산된 tot 데이터를 Student 타입의 객체의 필드에 저장
		
		double avg = tot* 100 / 3 / 100.0;
		stu.setAvg(avg);
		
		stu.printData(); // stu에 있는 메소드\
		
		System.out.println("=== 생성자를 사용하여 데이터 입력 ===");
		Student stu2 = new Student ("김유신",100,90,82);
		
		stu2.printData();
		
		
		} 


}
