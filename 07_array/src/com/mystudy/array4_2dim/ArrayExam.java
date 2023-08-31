package com.mystudy.array4_2dim;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
		/* 문제 : 2차원 배열을 사용하여 
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		1. 2차원 배열 num2dim 값을 화면 출력 : 10 20 ~ 60 
		2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력 
		3. num2dim의 크기만큼 num2Copy 배열을 선언하고 
		   num2dim -> num2Copy 데이터 복사 후 
		   num2Copy 데이터 화면 출력 
		*데이터 복사 형태 확인 : 얕은복사(주소값 복사), 깊은복사(물리적복사)
		----------------------------------*/
		// 배열 선언
		int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		
		// 1.배열 출력 - 메소드
		System.out.println("--- 2차원 배열 출력 ---");
		for (int i = 0; i < num2dim.length; i++) {
			System.out.println(Arrays.toString(num2dim[i]));
		}
		System.out.println("----------------");
		
		printData(num2dim,"num2dim");
//		System.out.println("----------------");
//		// 강사님 
//		for (int d2= 0; d2 < num2dim.length; d2++) {
//			System.out.println(d2 + " : " + num2dim[d2]);
//			for(int i = 0; i < num2dim[d2].length; i++) {
//				System.out.println(num2dim[d2][i] + " ");
//			}
//		}
//		System.out.println("----------------");
		
		// 2. num2dim의 세번째 값인 30을 100으로 변경하고 화면 출력
		System.out.println("--- 2 ---");
		num2dim[1][0] = 100;
		System.out.println("num2dim[1][0] : " + num2dim[1][0]);
		printData(num2dim,"num2dim");

		System.out.println("--- 3 ---");
//		3. num2dim의 크기만큼 num2Copy 배열을 선언하고 
//		   num2dim -> num2Copy 데이터 복사 후 
//		   num2Copy 데이터 화면 출력 
		int [][] num2Copy = new int [num2dim.length][];
		
		for (int i = 0; i < num2dim.length; i ++) {
			num2Copy[i] = new int[num2dim[i].length];
		}
		System.out.println("num2Copy : " + Arrays.toString(num2Copy));
		
		// 데이터 복사 
		System.out.println("---- 데이터 직접 복사 ----");
		for(int d2 = 0; d2 < num2dim.length; d2++) {
			for(int i = 0; i < num2dim[d2].length; i++) {
				num2Copy[d2][i] = num2dim[d2][i]; 
			}
		}
		
		
		
//		num2Copy = Arrays.copyOf(num2dim, num2dim.length);
//		num2Copy = num2dim.clone();
		
		// 데이터 화면 출력 - 메소드 이용
		printData(num2Copy,"num2Copy");
		printData(num2dim,"num2dim");
		num2Copy[0][0] = 999;
		System.out.println("---- 변경 후 ---");
		printData(num2Copy,"num2Copy");
		printData(num2dim,"num2dim");
	
		// 형태 확인
		System.out.println("----- 형태 확인 ------");
		System.out.println("num2Copy == num2dim : " + (num2Copy == num2dim));
		System.out.println("num2Copy[0] == num2dim[0] : " + (num2Copy[0] == num2dim[0]));
		
		
		
		/* clone(),copy() 등등 복사기능 -> 
		 참조형 데이터를 복사하면 주소값을 복사하는 것 */
		
	}
	
	//  메소드 생성 (배열 데이터 출력)
	static void printData (int[][] num, String name) {
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[j].length; j++) { // 1차원 배열의 길이 
				System.out.print(num[i][j] + " ");
			} 
		}
		System.out.println();
	}
	
	
}
