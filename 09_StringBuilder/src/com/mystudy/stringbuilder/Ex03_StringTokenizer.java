package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String 클래스의 split() vs StringTokenizer 클래스 
		System.out.println("---  String split() ---");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str.toString());
		
		String[] strSplit = str.split(","); // "," 구분자로 잘라라 
		System.out.println("strSplit.length : " + strSplit.length);
		
		System.out.println("--- str.split(\",\") 실행결과 배열 ---");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(i + " : " + strSplit[i]); 
		}
		System.out.println();
		
		System.out.println("--- 개선된 for문으로(또는 forEach) ---");
		for (String str2 : strSplit) {
			System.out.println("-" + str2 + "-");
		}
		
		int idx = 0;
		for (String str2 : strSplit) {
			System.out.println(idx++ + ":" + "-" + str2 + "-");
		}
		
		System.out.println("\n=== StrinfTokenizer ===");
		str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str);
		
		StringTokenizer strToken = new StringTokenizer(str,",");
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		
		while (strToken.hasMoreTokens()) { // 다음에 읽어 들일 token이 있으면 true, 없으면 false를 return
			String token = strToken.nextToken();
			System.out.println(token);
		}
		// 하나씩 꺼내쓴다 -- 위에서 다 써서 없음
		// (주의) 토근이 없을 때 nextToken() 사용하면 
		// NoSuchElementException 예외발생
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
	
		System.out.println("--- (실습) 토근데이터 for문으로 ---");
		str = "사과,배,복숭아,,포도";
		StringTokenizer strToken2 = new StringTokenizer(str,",");
		System.out.println("strToken2.countTokens() : " + strToken2.countTokens());
		
		int count = strToken2.countTokens(); 
		// 토근이 될 때마다 갯수가 변하기(-1씩) 때문에 반복문 내에 있으면 안 되고 별도로 변수 지정해야 함
		for (int i = 0; i < count; i++) {
			String token2 = strToken2.nextToken();
			System.out.println(i + " : " + token2);
		}
		

		
	}

}
