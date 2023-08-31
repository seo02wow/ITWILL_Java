package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		/* String 클래스 : 문자열 저장,처리하기 위한 클래스 
		   String 클래스 : 참조형 데이터 타입
		   String 데이터는 한 번 저장되면 불변임(immutable)
		--------------------------------------------
		   사용형식 2가지
		   String str = "홍길동"; -> 기본 데이터 타입처럼 사용 가능,하나의 객체를 공유해서 사용 
		   String str = new String("홍길동"); -> 객체(인스턴스) 생성
		 --------------------------------------------*/
		String str1 = "홍길동"; 
		String str2 = "홍길동"; //str1,str2 같은 주소
		System.out.println("str1 : " + str1); // 주소값 X 
		System.out.println("str2 : " + str2);
		System.out.println("str1 == str2 : " + str1 == str2); // 문자열 붙이기 처리가 되므로 괄호처리↓ 
		// == : 객체(인스턴스,주소값) 배교 (동일 객체 여부 확인)
		System.out.println("str1 == str2 : " + (str1 == str2)); // 동일 객체 
		System.out.println("--------------------------");
		
		String strObj1 = new String("홍길동"); // str1 과 == 는 F(주소값 다름) , equals는 T
		String strObj2 = new String("홍길동");
		System.out.println("strObj1 : " + strObj1);
		System.out.println("strObj2 : " + strObj2);
		// System.out.println("str1 == strObj1 : " + (str1 == strObj1)); // 다른 객체
		System.out.println("strObj1 == strObj2 : " + (strObj1 == strObj2));

		
		System.out.println("--- 문자열 값 비교할 때 equals() 사용 ---");
		// equals() : 문자열 값을 비교할 대는 반드시 equals() 사용할 것 !
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // 데이터(문자열) 동일?
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1)); // 같은 데이터
		System.out.println("strObj1.equals(strObj2) : " + strObj1.equals(strObj2));
		 
	
	
	
	}
}
