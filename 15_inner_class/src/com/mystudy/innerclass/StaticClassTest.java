package com.mystudy.innerclass;

public class StaticClassTest {
	int a = 100;
	private int b = 100;
	static int c = 200;
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 30;
	
	static void sum() {
		// sum = a + b; static 인스턴스만 사용할 수 있음 
		//sum = sNum1 + sNum2;
		sum = Inner.d + sNum2; // static 이기 때문에 가능
	}
	
	
	//스태틱(static) 내부 클래스
	static class Inner { // 이 자체가 static 이기 때문에 static만 접근 가능
		static int d = 1000;
		int e = 2000; // non-static
		
		void printData() { 
			// 메소드 자체는 non-static, 이를 감싸는 내부 클래스는 static 이기 때문에 non static 사용 불가? 
			//System.out.println("외부 int a  : " + a);
			System.out.println("외부 static int c : " + c);
			System.out.println("내부 static int d : " + d);
			System.out.println("내부 static int e : " + e);
			sum(); 
			System.out.println("외부 static int sum : " + sum);
		}
	}
	
	
	public static void main(String[] args) {
		int num = StaticClassTest.c;
		
		//static 내부클래스의 static 필드변수 사용 
		int innerNum = StaticClassTest.Inner.d;
		
		//static 내부클래스의 객체(인스턴스) 생성 후 printData() 호출(실행)
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData();

	}

}
