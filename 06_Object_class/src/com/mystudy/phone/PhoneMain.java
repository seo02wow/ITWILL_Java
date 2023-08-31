package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		System.out.println("=====phone1======");
		Phone phone1 = new Phone();
		System.out.println("Phone1 : " + phone1);
		// phone1 -> 참조형 데이터 : 해당 변수는 주소값 가짐 
		phone1.call(); // 단순 call();은 오류 -> 내가 가지고 있는 메소드 라는 것을 의미함.
		phone1.receiveCall(); // 파라미터값이 없으므로 () 빈칸
		phone1.sendSms("안녕"); // 문자
		// 열 입력 -> msg로 연결 
		String receivemsg =phone1.receiveSms("오랜만이다");
		System.out.println("받은 메세지 : " + receivemsg);
		phone1.view();
		
		System.out.println("=====phone2======");
		Phone phone2 = new Phone("마이폰","아이폰13미니");
		System.out.println("Phone2 : " + phone2);



		
		System.out.println("--- 기능 ---");
		phone1.call();
		phone1.receiveCall();
	}

}
