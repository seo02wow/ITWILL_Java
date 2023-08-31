package com.mystudy.string;

public class Ex05_String_array_exam {

	public static void main(String[] args) {
		/* String[]과 String 메소드 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕....
		3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		   출력 예) 홍,이,이,을,김,연,T,T...
		4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		   예) 1:이순신=2:이순신
		(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		---------------------------------------------------------------- */
		// 1.
		String[] names =  {"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"};
		
		// 2.
		System.out.println("--- names ---");
		System.out.println("[개선된 for문,boolean활용]");
		boolean isFirst = true;
		for(String name : names) {
			if (isFirst) {
				System.out.print(name);
				isFirst = false;
			} else {
			System.out.print("," + name);
			}
		}
		System.out.println();
		System.out.println("----------------------");
		for (int i = 0; i < names.length; i++) {
			if (i == names.length-1) {  //마지막데이터냐?
				System.out.println(names[i]);
			} else {
				System.out.print(names[i] + ",");
			}
		}
		System.out.println("-------------");
		// 패턴 : 이름, / 이름 (마지막)
		//처음~마지막 이전
		for (int i = 0; i < names.length-1; i++) {
				System.out.print(names[i] + ",");
		}  if (names.length > 0) { // 마지막 데이터 ,데이터가 1개 이상 있냐 
			System.out.println(names[names.length-1]);
		}
		// 패턴 : 이름(첫번째) / ,이름 (나머지)
		
		for (int i = 0; i < names.length; i++) {
			if (i == 0) { //첫번쨰냐
				System.out.print(names[i]);
			} else {
				System.out.print(","+names[i]);
			}
		}
		System.out.println();
		

		
		System.out.println("--- 이름 첫 글자 ---"); 
		
		// 3.배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0) + ",");
		}
		System.out.println();
		
		System.out.println("--- 4글자 이상인 이름 ---"); 
		// 4.이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력,  예) 3:을지문덕
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.println(i + " : " + names[i]);
			}
		}
		
		System.out.println("--- 동명이인 ---");
		// 5.이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		//예) 1:이순신=2:이순신
		//(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		
//		for (int j = 0; j < names.length; j++) {
//			for (int i = j; i < names.length-j; i++) {
//				// names[i] = names[i].toUpperCase();
//				if ((names[j].toUpperCase()).equals((names[j+i]).toUpperCase())) {
//					System.out.println(j + ":"+ names[j] + " = " + (j+i)  + ":" + names[j+i]);
//				}
//			}
//		}
		int lastIndex = names.length-1; 
		for (int baseIdx = 0; baseIdx < lastIndex; baseIdx++) {
			for ( int i = baseIdx + 1; i < names.length; i++) {
				if(names[baseIdx].equalsIgnoreCase(names[i])) {
					System.out.println(baseIdx + ":" + names[baseIdx] 
							+ "=" + i + ":"+names[i]);
				}
			}
		}
	
		
		
		
		
	}

}
