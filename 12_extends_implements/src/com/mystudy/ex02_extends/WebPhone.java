package com.mystudy.ex02_extends;

// 클래스 상속(extends:확장) 실습 
/* Phone 클래스 상속 확장(extends)
WebPhone 클래스 작성 - Phone 클래스 상속 확장해서 작성 
생성자 정의
	- PhoneNo 전달받은 생성자 
	- type,phoneNO 전달받는 생성자
기능 : 전화걸고, 받고, 전화정보보기, 웹검색 기능이 있는 전화기
	웹검색기능 
	webSearch() : ">> WebPhone - 웹검색" 문구 화면 출력 
*/
class WebPhone extends Phone {

	public WebPhone(String phoneNo) { // phoneNo 폰 번호를 받으면
		super("WebPhone 타입,", phoneNo); // 보냄
	}
	
	public WebPhone(String type,String phoneNo) { // 타입과 전화번호 받으면
		super(type,phoneNo);
	}
	
	// 웹검색 기능 
	public void webSearch() {
		System.out.println(">> WebPhone - 웹검색");
	}
	
	
}
