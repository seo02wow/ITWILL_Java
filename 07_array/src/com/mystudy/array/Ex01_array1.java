package com.mystudy.array;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {
		// 배열(array) : 동일한 데이터 타입들의 연속된 저장 공간 
		// 배열의 선언 : 자료형(데이터 타입명)[  ] 변수명 
		// 변수에 값을 저장할 때 형식 : 배열변수명 [인덱스(0부터 시작)번호] = 값;
		/* 배열의 선언 및 생성
		1. 자료형[] 변수명 = new 자료형[갯수]; // 주로 사용
		   자료형 변수명[] = new 자료형[갯수];
		2. 자료형[] 변수명 = new 자료형[] {값1,값2, 값3, ... ,값n};
		3. 자료형[] 변수명 = {값1,값2, 값3, ... ,값n}; 선언과 동시에 쓸 수 있음
		-----------------*/

		int[] arr = new int[5]; // 인트값 5개를 저장할 수 있는 연속된 저장공간 생성 ,초기값 0 
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("------");
		
		for (int i = 0; i < 5; i++) { // 갯수는 -1,0부터 !! 
			System.out.println(i + ":" + arr[1]); 
		}
		
		arr[0] = 10; // 배열의 첫번째 위치 (인덴스 번호 0번)에 10 설정(저장)
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 11;
		System.out.println("arr[1] : " + arr[1]);
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14; // 마지막 데이터 ( 크기 -1 )
		// arr[5] = 15; -> 오류 : 범위 벗어남\
		
		System.out.println("-----------");
		for (int i = 0; i < 5; i++) { 
			System.out.println(i + ":" + arr[1]); 
		}
		
		System.out.println("-----배열 length의 속성-----");
		for (int i = 0; i < arr.length; i++) { 
			System.out.println(i + ":" + arr[1]); 
		}
		System.out.println("arr.length : " + arr.length);
		
		
		System.out.println("=========배열선언 형태 2번==========");
		// 2. 자료형[] 변수명 = new 자료형[] {값1,값2, 값3, ... ,값n};
		//             인덱스 번호   0    1    2    3    4          
		int [] arr2 = new int[] {100, 101, 102, 103, 104};
		for ( int i =0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=========배열선언 형태 3번==========");
		// 3. 자료형[] 변수명 = {값1,값2, 값3, ... ,값n};
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		for (int i =0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("================================");
		int[] nums = new int[10];
		// 초기값 설정 : 1~10 숫자를 저장 (규칙성이 있어야 함)
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// 배열값 확인 
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		} 
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
		System.out.println("=====================");
		System.out.println("==== 영어 알파벳 문자 저장/출력(A~Z) ====");
		char [] ch = new char[26];
		System.out.println(Arrays.toString(ch));
		System.out.println("-" + ch[0] + "-");
		System.out.println("-" + '\u0000' + "-");
		ch[0] = 'A'; // 위치값 65임
		ch[1] = 'B'; // 66 <--- 65(A) + 1 
		ch[2] = 'C'; // 67 <--- 65(A) + 2 
		System.out.println("--------------------");
		
		ch[0] = 'A' + 0; // A
		ch[1] = 'A' + 1; // B
		ch[2] = 'A' + 2; // C
		ch[3] = 'A' + 3; // D
		System.out.println(Arrays.toString(ch));
		System.out.println("--------------------");

		// 데이터 A~Z 일괄입력 (반복문 사용)
		// 1. 자료형[] 변수명 = new 자료형[갯수]; 
		System.out.println("----- 데이터 A~Z 일괄입력 -----");
		char [] ch1 = new char[26];
		for (int i = 0; i < ch1.length; i++) {
			ch1[i]= (char)('A' + i);  //  
		}
		
		// 배열 데이터 화면 출력 (반복문 사용)
		for (int i = 0; i < ch1.length; i++) {
			ch1[i]= (char)('A' + i); 
			// i 타입이 int 이기 때문에 char 으로 형변환 필요 , 연산의 결과값을 통째로 해야함
			System.out.print(ch1[i] + "  ");
		}
		
	}
}