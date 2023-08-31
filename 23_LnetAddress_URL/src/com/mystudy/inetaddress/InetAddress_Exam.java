package com.mystudy.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {

	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP주소 관련 클래스 
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.println("iaddr : " + iaddr);  // 내부 IP 주소
		System.out.println("호스트명 : " + iaddr.getHostName()); // 서버명
		System.out.println("호스트 IP 주소 : " + iaddr.getHostAddress());
		
		System.out.println("--- 네이버 주소 검색 ---");
		InetAddress naver = InetAddress.getByName("www.naver.com"); 
		System.out.println("naver : " + naver); // 호스트명 / 네이버 IP 주소 
		System.out.println("호스트명 : " + naver.getHostName());
		System.out.println("호스트 IP 주소 : " + naver.getHostAddress());
		
		System.out.println("--- 네이버 IP 주소들 검색 ---");
		InetAddress[] iaArray = InetAddress.getAllByName("www.naver.com"); // 배열 타입 리턴
		
		for(InetAddress ia : iaArray ) {
			System.out.println("호스트명 : " + ia.getHostName());
			System.out.println("호스트 IP 주소 : " + ia.getHostAddress());
		}
	}

}
