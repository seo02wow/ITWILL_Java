package com.mystudy.innerclass;

public class InstanceClassTest {
	//변수
	int a = 100; 
	private int b = 10;
	static int c = 200;
	int sum = 0;
	//메소드
	void sum() {
		sum = a + b;
	}
	// 내부 클래스 : 인스턴스 클래스 
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("외부 int a : " + a);
			System.out.println("외부 private int b : " + b);
			System.out.println("외부 static int b : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("내부클래스 필드 in : " + in);
		}
	}

	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest(); // 외부 
		System.out.println("필드변수 a : " + out.a);
		
		System.out.println("--- 내부 인스턴스 클래스 사용 ---");
		// 내부클래스 타입 : 외부클래스명.내부클래스명
		// 인스턴스 클래스의 객체생성하기 위해서는 외부클래스 객체를 통해서 생성할 수 있다. 
		InstanceClassTest.Inner inner = new InstanceClassTest().new Inner();
		//InstanceClassTest.Inner inner = out.new Inner(); // 외부 객체 있으면 외부.new 내부클래스명
		inner.printData();
		
		String str = new String("홍길동");
		

	}

}
