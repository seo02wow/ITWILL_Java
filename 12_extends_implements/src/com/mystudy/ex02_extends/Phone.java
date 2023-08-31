package com.mystudy.ex02_extends;

// public class Phone extends Object { 
class Phone {// extends Object 생략되어 사용
	//필드변수(속성) --------------
	private String type; // 전화타입
	private String phoneNo; // 전화번호

	
	//생성자 --------------------  // 한 번 세팅하고 나면 바꾸지 못하게 설정
	public Phone() {} // 기본생성자 쓰고 setter 안 쓰면 ..
	
	public Phone(String phoneNo) {
		this.type = "Phone 타입,"; // 생성자에서 기본값 설정
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) { 
		this.type = type;
		this.phoneNo = phoneNo;
	}


	//메소드 --------------------
	public String getType() { //조회만 ! 
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//전화걸기 기능
	public void call() {
		System.out.println(">> 전화걸기");
	}
	
	//전화받기 기능
	public void receivecall() {
		System.out.println(">> 전화받기");
	}
	
	//전화정보 확인 기능
	public void view() {
		System.out.println("타입 : " + type + "전화번호 : " + phoneNo);
	}
	
	
	
}
