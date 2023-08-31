package com.mystudy.array;

import java.util.Arrays;

public class Ex05_array_lotto {

	public static void main(String[] args) {
		/* 로또 번호 생성기
		  1. int 타입의 숫자 45개를 저장할 수 있는 배열 선언(balls)
		  2. 초기화 : 1 ~ 45까지의 숫자(번호) 입력
		  3. 충분히 많이 섞고 - Math.random() 사용
		  	3-1. 0~44 랜덤한 숫자를 만든다(Math.random() 사용)
		  	3-2. 첫번째 데이터와 랜덤숫자 인덱스 번호와 교환
		  	3-3. 위의 3-1, 3-2 작업을 계속 반복(충분히 많이)
		  4. 6개 번호를 추출(앞에서부터 6개 사용)
		-----------------------------------*/
		
		// 랜덤한 값(숫자) 만들기 - Math.random() : 0 <= double(실수) < 1
		// (int)(Math.random() * 45) : 0~44까지의 랜덤한 값 생성
		// 1.
		int [] balls = new int [45];
		System.out.println("----- 1~45 입력 -----");
		
		// 2. 설정된 초기값 확인 
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i+1;
			System.out.print(balls [i] + " ");
		}
		System.out.println();
		
		// 3.
		
		// 3-1.
		int ran = (int)(Math.random() * 45);
		System.out.println("랜덤값(0~44) :" +ran);
		System.out.println();
		
		// 3-2. balls[0] <-> balls[ran]
		int temp;
		/*
		// 1번 교환
		ran = (int)(Math.random() * 45);
		System.out.println("랜덤값(0~44) :" +ran);
		temp = balls[0];
		balls[0] = balls[ran];
		balls[ran] = temp;
		
		// 2번 교환
		ran = (int)(Math.random() * 45);
		System.out.println("랜덤값(0~44) :" +ran);
		temp = balls[0];
		balls[0] = balls[ran];
		balls[ran] = temp;
		
		System.out.println(">> 변경 후");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls [i] + " ");
		}
		System.out.println();
		*/
		System.out.println("--- 반복문으로 교환처리 ---");
		for(int i = 1; i <= 10_000; i++) { // 천단위 언더바 사용 가능
			ran = (int)(Math.random() * 45);
			// System.out.println("랜덤값(0~44) :" +ran);
			temp = balls[0];
			balls[0] = balls[ran];
			balls[ran] = temp;
			// System.out.println(Arrays.toString(balls));
		}
		
		System.out.println(">> 변경 후");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls [i] + " ");
		}
		System.out.println();
	
		// 4.
		System.out.println("---- 6개 추출 ----");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls [i] + " ");
		}
		System.out.println();
		
		// 정렬 
		System.out.println("--- 당첨번호 별도 저장하기 ---");
		int[] lottoNums = new int[6];
		for (int i = 0; i < 6; i++) {
			lottoNums [i] = balls[i];
		}
		System.out.println("balls : " + Arrays.toString(balls));
		System.out.println("lottonums : " + Arrays.toString(lottoNums));
		

		System.out.println("======Arrays.sort() 정렬처리=====");
		// 로또번호 오름차순 정렬 
		Arrays.sort(lottoNums);
		System.out.println("lottonums : " + Arrays.toString(lottoNums));
		
		
		
	
		
		
		

		

		
		
		

	}

}
