package com.mystudy.phone;

public class Phone {
	// 필드변수 (속성) // 데이터 저장 공간 만듦,변수 선언
	String name; // 모델명
	String type; // 타입
	int hsize; // 가로크기
	int vsize; // 세로크기
	boolean hasLCD; // LCD 유무 
	
	
	// 생성자 선언 ---------------------------
	Phone () { } // 기본생성자 
	
	// 모델명, 타입 - 선언부 = (  ) 가 달라야 호출할 때 중복이 안 됨 
	Phone (String name, String type) {   // 필드변수랑 파라미터를 같은 이름으로 오면 저장이 안 됨 -> 그래서 this 를 붙임 
		this.name = name;  // this는 현재객체(인스턴스)
		this.type = type; 
	}
	
	Phone(String name, String type, boolean hasLCD){
		this.name = name; // this는 현재객체(인스턴스)
		this.type = type;
		this.hasLCD = hasLCD;
	}

	// 기능(메소드) ---------------------------------
	
	void view () {  // retrun 값이 없을 떄 void , 단순 실행
		System.out.println("--- 전화기 정보 ---");
		System.out.println("모델명 : " + name); 
		System.out.println("타입 : " + type);
		System.out.println("가로크기 : " + hsize);
		System.out.println("세로크기 : " + vsize);
		System.out.println("LCD유무 " + hasLCD);
	}
	
	void call () {
		System.out.println(">> 전화걸기");
	}
	
	void receiveCall () {
		System.out.println(">> 전화받기");
	}
	
	void sendSms(String msg) { // (String msg) -> 문자열 받는다 
		System.out.println("[메시지전송] " + msg); // 전달받은 문자열
	}
	
	String receiveSms(String msg) {  // 문자를 받고 다시 문자열 되돌림 (리턴타입-String)
		System.out.println("[메시지수신] " + msg);
		return msg; // 호출만하고 끝
	}
	
	
	

	
	
	

}
