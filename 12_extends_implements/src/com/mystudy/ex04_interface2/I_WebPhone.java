package com.mystudy.ex04_interface2;

// Phone 기능(정보보기, 전화걸고, 받고, 메시지송신, 수신)
// Mp3Phone 기능(음악플레이)
// 웹검색 기능 
interface I_WebPhone extends I_Phone, I_Mp3Phone {

	// 인터페이스에 정의되어 있는 메소드 사용 + 메소드 별도 추가 
	// 메소드 추가 ↓
	// WebPhone 고유기능 -----------------------
	void searchWeb();
}
