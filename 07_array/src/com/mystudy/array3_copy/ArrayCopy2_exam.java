package com.mystudy.array3_copy;

import java.util.Arrays;

public class ArrayCopy2_exam {

	public static void main(String[] args) {
		/* 문제1 : int 타입의 데이터 4개를 저장할 수 있는 배열(num1)
		1. 10, 20, 30, 40 숫자를 입력하고 화면 출력 (출력 - 반복문 사용)
		2. 세번째 데이터를 100으로 변경하고 화면 출력 
		3. 20 숫자를 찾아서 99로 변경(위치 모름)
		-------------------------------------------*/
		//1.
		int[] num1 = new int[] {10, 20, 30, 40};
		System.out.println("--- 1-1. ---");
		
//		for (int i = 0; i < num1.length; i++) {
//			System.out.print(num1[i] + " ");
//		}
//		System.out.println();
		printData("num1",num1);
		
		//2.
		System.out.println("--- 1-2. ---");
		num1[2] = 100;
//		for (int i = 0; i < num1.length; i++) {
//			System.out.print(num1[i] + " ");
//		}
//		System.out.println();
		printData("num1",num1);
		
		//3.
		System.out.println("--- 1-3. ---");
		for (int i = 0; i < num1.length; i++) {
			if(num1[i] == 20) {
				num1[i] = 99;
			}
		} 
		printData("num1",num1);
		
		/* 문제2 : num1과 크기가 같은 배열 num1Copy 를 만들고
		num1copy에 num1 데이터를 복사하고 화면 출력
		주소값 복사인지 깊은복사(물리적 복사) 여부 확인 
		-------------------------------------------*/
		System.out.println("--- 문제2 ---");
		// 크기가 같은 배열 
		int[] num1Copy = new int[num1.length];
		printData("num1Copy",num1Copy);
		
		// 데이터 복사 및 출력 
		for (int i = 0; i < num1Copy.length; i++) {
			num1Copy[i] = num1[i];
		}
		printData("num1Copy",num1Copy);
		
		// 주소값이 동일하냐 ? 동일객체냐?
		if (num1 == num1Copy) {
			System.out.println("num1Copy, num1 : 동일주소,동일객체"); 
		}
		
		if (num1 != num1Copy) {
			System.out.println("num1Copy, num1 : 서로 다른 주소,별개의 다른객체"); 
		}
		
		System.out.println("--- 1차원 배열 clone() 처리 ---");
		num1Copy = num1.clone();
		printData("num1Copy",num1Copy);
		System.out.println("num1 == num1Copy : " + (num1Copy == num1));
		
		System.out.println("--- 1차원 배열 Arrays.copyOf() 처리 ---");
		num1Copy = Arrays.copyOf(num1, num1.length); // num1을 복사 
		printData("num1Copy",num1Copy);
		System.out.println("num1 == num1Copy : " + (num1Copy == num1));
		

	}

	// 메소드 생성
	static void printData(String name,int[] num1) { 
		System.out.print(name + " : ");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
	}
	
}
