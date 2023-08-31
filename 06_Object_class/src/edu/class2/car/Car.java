package edu.class2.car;

/* 자동차 클래스 
	속성 : 차량명, 모델명, 차량색상
	기능 : 가고, 서고, 뒤로 가고, 차량정보 확인
*/
public class Car {
	// 필드변수 (속성) ---------------
	String name = "마이카"; // 차량명 변수 선언, 데이터 저장, 초기값 설정 !
	String model; // 모델명  , 객체 생성하고 초기값 설정하지 않으면 기본적으로 자동 생성함 (스트링 -> null) 
	String color; // 차량색상 , 별도로 데이터 저장 안 하면 null
	
	// final 제한자 : 마지막이라는 의미, 변수에서는 마지막 값(데이터), 값을 변경할 수 없다
	// final 변수 : 상수화된 변수(상수)
	final int CAR_LENGTH = 350; // 차량길이 , 다른 변수와 시각적으로 다른 의미를 주기 위해 언더바
	final int CAR_WIDTH = 200; // 차량폭(너비)
	
	boolean hasAirbag; // 에어백 존재여부 , 디폴트값 false
	
	
	// 생성자 --------------------(클래스 이름 갖다 씀)
	// 기본 생성자형식 : 클래스명 () {}
	// 형식 : (매개변수, ..) {}
	// 주의 : 명시적으로 생성자를 선언했을시 기본생성자를 자동으로 생성 안 함 . 필요하면 직접 작성해야 함
	Car() {
		model = "드림카";  // null -> 드림카
		color = "흰색"; // null -> 흰색 
	} 
	
	Car(String n, String m, String c) { // 이름 모델 색상값들을 필드에 저장하는 역할 ?
		name = n;  
		model = m;
		color = c;
	} 
	
	// 메소드(기능, 동작, 함수) -------------------
	void run() {
		System.out.println(">> 앞으로 이동");
	}
	
	void stop () {
		System.out.println(">> 멈추기");
	}
	
	void back () {
		System.out.println(">> 뒤로가기");
	}
	
	// 클래스 내부에 자동차 속성값 확인
	void dispData () {
		System.out.println("--- 자동차 정보 ---");
		System.out.println("자동차명 : " + name); // 필드변수가 있기 때문에 name 아님 !
		System.out.println("모델명 : " + model);
		System.out.println("색상명 : " + color);
		System.out.println("차량길이 : " + CAR_LENGTH);
		System.out.println("차량폭 : " + CAR_WIDTH);
		System.out.println("에어백유무 : " + hasAirbag);
	}
	
	
}
