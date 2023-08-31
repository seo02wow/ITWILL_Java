package com.mystudy.array;

public class Ex02_array_exam {

	public static void main(String[] args) {
		/* (실습) 문제 : 배열에 저장된 숫자의 합계 구하기 (변수명 nums)
		저장할 숫자 : 3, 5, 7, 1, 2, 4, 6, 8, 9, 10
		0. 위의 숫자가 저장된 배열을 만드세요.
		1. 배열에 저장된 데이터를 화면 출력(반복문사용)
		2. 배열에 저장된 데이터의 합계 구하기
		3. 합계결과 출력   
		자료형[] 변수명 = new 자료형[] {값1,값2, 값3, ... ,값n};
		-------------------------------------------------*/
		
		System.out.println("----- 1번 -----");
		
		// 1-0.
		int[] nums = new int[] {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
		
		// 1-1.
		for (int i = 0; i < nums.length; i++) { // 데이터 변동 시 수정 용이를 위해 .length사용 !
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		// 1-2.
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		} 
		// 1-3.
		System.out.println("배열 합계 : " + sum);
		
		System.out.println("----- 2번 -----");
		/*(실습) 배열값 중 홀수합, 짝수합 구하기
		배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
		배열에 있는 값 중 홀수는 홀수끼지 합산(oddSum)
		짝수합계, 홀수합계 출력
		-------------------------------------------------*/
		// 짝수 합계 
		int evenSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenSum = evenSum + nums[i];
			}
		}
		System.out.println("짝수 합계 : " + evenSum); 
		
		// 홀수 합계 
		int oddSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				oddSum = oddSum + nums[i];
			}
		}
		
		System.out.println("홀수 합계 : " + oddSum);
		
		// 한 번에 처리
		evenSum = 0;
		oddSum = 0;
		for (int i = 0; i < nums.length; i++) { // 데이터 변동 시 수정 용이를 위해 .length사용 !
			if (nums[i] % 2 == 0) {
				evenSum = evenSum + nums[i];
			} else {
			oddSum = oddSum + nums[i];
			}
		}
		System.out.println("짝수합 : " + evenSum);
		System.out.println("홀수합 : " + oddSum);
		
		
		
		
	}

}
