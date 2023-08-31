package com.mystudy.ex01_class;

class Mp3Phone { //현재 패키지에서만 사용 가능 
	// 필드변수 ------------------------------
	private String type;
	private String phoneNo;
	
	// 생성자 -------------------------
	
	public Mp3Phone() {}
	public Mp3Phone(String phoneNo) {
		type = "Mp3Phone 타입,";
		this.phoneNo = phoneNo; // 파라미터값인 (여기에 있는) 번호
	}
	public Mp3Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}

	
	
	// 메소드 ---------------------------------
	
	public String getType() {
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

	//음악플레이 기능 
	public void playMusic() {
		System.out.println(">> 음악 플레이");
	}
	
	
	
}
