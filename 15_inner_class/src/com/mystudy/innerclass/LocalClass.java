package com.mystudy.innerclass;

public class LocalClass {
	int a = 100;
	
	void print() {
		System.out.println("a : " + a);
	}
	
	void innerTest(int k) { // 외부에서 사용 불가 , 
		int b = 200; // 지역변수(Local variable)
		int c = k;
		
		// 로컬 클래스(지역클래스) - 메소드 내 선언된 클래스 
		// 선언된 메소드 내부에서만 사용 가능
		class Inner { 
			void printData() { 
				System.out.println("외부클래스 int a : " + a);
				System.out.println("메소드 int b : " + b);
				System.out.println("메소드 int c : " + c);
				System.out.println("파라미터 int k : " + k);
			}
		}
		Inner in = new Inner(); // 클래스 사용되려면 메소드에서 객체 생성되어야 함 
		in.printData();
		
	}
	
	

}
