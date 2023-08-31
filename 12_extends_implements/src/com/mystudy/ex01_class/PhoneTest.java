package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트 
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111"); 
		ph1.view();
		ph1.call();
		ph1.receivecall();
		
		System.out.println("------------------");
		Phone ph2 = new Phone("아이폰,","010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receivecall();
		
		System.out.println("=== Mp3Phone ===");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receivecall();
		mp3ph.playMusic();

	}
	
	
	
	

}
