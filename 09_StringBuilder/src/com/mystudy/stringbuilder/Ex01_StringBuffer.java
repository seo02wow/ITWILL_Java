package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer 클래스
		// StringBuffer sb = "홍길동"; -> 불가 \
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		String str = sb.toString(); // StringBuffer 의 저장 문자열 확인(리턴)
		System.out.println("sb.length() : " + sb.length()); // 저장된 문자열 크기
		System.out.println("sb.capacity() : " + sb.capacity()); // 저장공간 크기
		
		System.out.println("--- String : 데이터불변(immutable) ---");
		String str1 = sb.toString();
		System.out.println("str1 : " + str);
		String str2 = str1.concat("  반갑습니다"); // str1 자체 데이터가 변하는 것이 아님,변수에 지정된 주소값이 바뀌는 것
		System.out.println("str2 : " + str2);
		System.out.println("str1 == str2 : " + (str1 == str2)); // false -> 다른 객체
		
		System.out.println("--- StringBuffer : 데이터 변경 가능 ---");
		System.out.println("sb : " + sb.toString());
		
		sb.append(" 반갑습니다").append("~~~"); // 리턴 스트링버퍼타입 , 뒤에 문자열 붙이기
		System.out.println("append 후 sb : " + sb.toString());
		System.out.println("sb.length() : " + sb.length()); 
		System.out.println("sb.capacity() : " + sb.capacity());
		
		sb.reverse(); // 문자열 뒤집기
		System.out.println("reverse 후 sb : " + sb.toString());
		sb.reverse(); // 문자열 뒤집기
		System.out.println("reverse 후 sb : " + sb.toString());
		
		System.out.println("--- delete(), insert(), replace() --- ");
		//Hello Java!!! 반갑습니다~~~
		StringBuffer sb2 = sb.delete(0, 6); // 특정 위치 삭제 인덱스 0부터 6전까지
		System.out.println("sb.delete(0, 6) : " + sb2.toString()); // Hello 없애기
		System.out.println("sb : " + sb.toString());
		System.out.println("sb == sb2 : " + (sb == sb2)); // 동일 객체
		
		sb.insert(0, "Hello "); // (시작위치, "넣을 문자열")
		System.out.println("sb.insert(0, \"Hello \") : " + sb.toString());
		
		sb.replace(0, 5, "Hi,"); 
		// 삭제하고 끼워넣기    인덱스 0부터 5전까지 "문자열"로 바꾸기
		System.out.println("sb.replace(0, 5, \"Hi,\") : " + sb.toString());
		System.out.println("sb.length() : " + sb.length()); 
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("----------------------");
		
		sb2 = new StringBuffer(100); // 저장공간
		System.out.println("sb.length() : " + sb2.length()); 
		System.out.println("sb.capacity() : " + sb2.capacity());		
		
		sb2.append("안녕하세요").append(" 반갑습니다!!!");
		System.out.println("sb2 : " + sb2.toString());
		
		System.out.println("sb.length() : " + sb2.length()); 
		System.out.println("sb.capacity() : " + sb2.capacity());	
		
		System.out.println("--- trimToSize() 실행하면 ---");
		sb2.trimToSize();  // 저장공간 줄임(여유공간 삭제)  리턴값 X
		System.out.println("sb.length() : " + sb2.length()); 
		System.out.println("sb.capacity() : " + sb2.capacity());	
		
		System.out.println("--- sb2.setLength(5) 실행하면 ---");
		sb2.setLength(5);  
		// 데이터 크기 설정(길이 5로 바꿈),작게 설정하면 delete 효과   리턴값X\
		// =  sb2.delete(5, sb2.length()); 앞에 5개 남기고 모두 삭제 (5번인덱스부터 마지막까지 삭제)
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb.length() : " + sb2.length()); 
		System.out.println("sb.capacity() : " + sb2.capacity()); // 용량은 그대로
		
		System.out.println("--- sb2.setLength(0) 실행하면 ---");
		sb2.setLength(0); // 길이0 = 전체 데이터 삭제
		// = sb2.delete(0, sb2.length());
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb.length() : " + sb2.length()); 
		System.out.println("sb.capacity() : " + sb2.capacity());
		
		
	}

}
