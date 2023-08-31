package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String 클래스 메소드 사용 문자열 처리 (단,원본문자열 불변)
		//             0123456789
		String str = "Java World";
		System.out.println("str : " + str);
		
		System.out.println("---- charAt(인덱스번호) ----");
		char ch = str.charAt(0); // 첫글자가 뭐냐 ?  , 여러번 사용하기 위해 변수 지정 
		System.out.println("str.charAt(0) : " + ch); // 변수 사용
		System.out.println("str.charAt(1) : " + str.charAt(1)); // 바로 사용

		// ch2 = {str.charAt(0), str.charAt(1) ~ ,str.charAt(3)}
		char[] ch2 = new char[4]; // 문자 4개 저장
		
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch2));
		
		System.out.println("---- compareTo() : 문자열비교(결과 : 음수, 0,양수 ");
		System.out.println("\"java\".compareTo(\"java\") " + "java".compareTo("java")); // 같은 문자열 : 0
		System.out.println("aaa vs aaa : " + "aaa".compareTo("aaa")); 
		System.out.println("bbb vs aaa : " + "bbb".compareTo("aaa")); // 맨 앞 문자열 위치값 비교 a와 b의 위치값
		System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa")); 

		System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb")); // b보다 a가 -1만큼 앞에 있음
		
		System.out.println("----------------------------");
		//      0123456789
		str  = "Java World";
		System.out.println("str : " + str);
		
		System.out.println("str.contains(\"Java\") : " + str.contains("Java"));
		
		System.out.println("--- indexOf() : 문자(문자열) 위치값 확인 ---");
		System.out.println("str.indexOf('x') : " + str.indexOf('x')); // 해당 문자가 없으면 음수
		System.out.println("str.indexOf('J') : " + str.indexOf('J')); // 문자의 인덱스 번호 
		System.out.println("str.indexOf(\"Java\") : " + str.indexOf("Java"));
		System.out.println("str.indexOf('a') : " + str.indexOf('a')); // 1 : 두번째 위치
		System.out.println("str.indexOf('a',2) : " + str.indexOf('a',2)); // 2번 인덱스부터 찾아라 
		
		System.out.println("--- lastIndexOf() : 문자(문자열) 찾기(뒤에서부터) ---");
		System.out.println("str.lastIndexOf('a') : " + str.lastIndexOf('a'));
		
		System.out.println("--------startsWith(),endWith()--------"); // 시작/끝 값이 " "로 시작하는가 리턴값 true,false 
		System.out.println("str.startsWith(\"Java\") : " + str.startsWith("Java"));
		System.out.println("str.startsWith(\"Wolrd\") : " + str.startsWith("Wolrd"));
		
		System.out.println("str.endsWith(\"Java\") : " + str.endsWith("Java"));
		System.out.println("str.endsWith(\"Wolrd\") : " + str.endsWith("World"));
		
		System.out.println("--- isEmpty() ---");
		System.out.println("str : " + str);
		System.out.println("str.isEmpty() : " + str.isEmpty());
		System.out.println("str.length() : " + str.length());
		
		str = ""; //빈문자열 
		System.out.println("str : -" + str + "-");
		System.out.println("str.isEmpty() : " + str.isEmpty());
		System.out.println("str.length() : " + str.length()); // 길이

		
		System.out.println(); 
		
		System.out.println("--- replace() : 문자,문자열 변경된 문자열 받기");
		//             0123456789
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		System.out.println("str.replace(\"a\", \"m\") : " + str.replace("a", "m")); // 찾을 문자열 , 바꿀 문자열
		System.out.println("str : " + str); // 원본데이터는 유지 (원본데이터 불변)
	
		System.out.println("--------------------");
		str = "Java Java";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Ja\", \"JA\") : " + str.replace("Ja", "JA"));
		System.out.println("str.replaceAll(\"Java\", \"Hello\") : " + str.replaceAll("Java", "Hello"));
		
		System.out.println("--- substring() : 부분 문자열 추출 ---");
		//   0123456789
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.substring(5) : " + str.substring(5)); // 시작위치 지정, 5번부터 끝까지
		System.out.println("str.length() : " + str.length());
		
		//String.substring(int beginIndex, int endIndex)
		// beginIndex : 부터 (포함)
		// endIndex : end 전까지 (불포함)
		System.out.println("str.substring(0, str.length()) : " + str.substring(0, str.length()));
		System.out.println("str.substring(5, str.length()) : " + str.substring(5, str.length()));
		
		// 뒤에서 5개 문자만 사용
		System.out.println("str.substring(str.length()-5) : " 
					+ str.substring(str.length()-5));
		System.out.println("----------------------------");
		
		str = "   Java World   ";
		System.out.println("str : -" + str + "-");
		System.out.println("str.trim() : -" + str.trim() + "-"); // 앞뒤 공백 자르기,유의미한 공백 제외
		System.out.println("str.toUpperCase() : " + str.toUpperCase()); // 대문자 변경
		System.out.println("str.toLowerCase() : " + str.toLowerCase()); // 소문자 변경
		System.out.println("----------------------------");
		
		System.out.println("--- String.valueOf() : 문자열로 변환 ---");
		int num = 100; 
		str = num + ""; // String을 int로 전환 필요 -> 문자열 붙이기
		str = String.valueOf(100); // "100" 문자열로 형변환
		str = String.valueOf(num);
		
		System.out.println("--- toCharArray() : 문자열을 char[]로 변환 ---");
		str = "Java World";
		System.out.println("str : " + str);
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println("charArray[0] : " + charArray[0]);
		
		
		
		
		
		
	}

}
