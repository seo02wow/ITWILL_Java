package edu.class1.basic;

public class Ex03_method {
	
	Ex03_method() {} // 기본 생성자

	public static void main(String[] args) {
		int num1 = 500;  // 지역변수
		int num2 = 200;
		int sum = 0;
		
		sum = add(num1,num2);  // 메소드 실행(호출)
		System.out.println("sum : " + sum);
		
		// static 영역에서 non-static 영역 접근시 객체(인스턴스)를 통해서 사용
		// 인스턴스 (객체)를 사용하면 static,non-static 변수,메소드 모두 사용 가능 
		Ex03_method ex03 = new Ex03_method(); 
		// 해당 데이터 타입의 객체를 만듦 , 생성자 호출
		System.out.println("sub : " + ex03.sub(num1, num2));
		System.out.println("sub : " + ex03.mul(num1, num2));
		System.out.println("sub : " + ex03.div(num1, num2));
	}

	
	
	// 메소드 선언(static)
	static int add(int a, int b) {
		return a + b;
	}
	
	// 메소드 선언(non-static)
	int sub(int a, int b) {
		return a + b;
	}
	
	int mul(int a, int b) {
		return a * b;   // return 값을 되돌림?
	}
	
	int div(int a, int b) {
		return a / b;   
	}
	
	//========================================
	// 메소드 형태 : 파라미터 값 유무,리턴값 유무  
	void method1() { 
		System.out.println("파라미터 값 X,return 값 X");
	}
	
	void method2(String param) { 
		System.out.println("파라미터 값 O,return 값 X");
	} // 입력 받는 값은 있고 출력하는 값은 없음 
	
	String method3() {  // 문자열 리턴 
		System.out.println("파라미터 값 X,return 값 O");
		return "파라미터 값 X,return 값 O";
	} 
	
	String method4(String param) { 
		System.out.println("파라미터 값 O,return 값 O");
		return "파라미터 값 O,return 값 O";
	}
	
}
