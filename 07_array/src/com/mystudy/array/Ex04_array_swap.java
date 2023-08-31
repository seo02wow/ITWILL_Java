package com.mystudy.array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex04_array_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기 
		int a = 100;
		int b = 200;
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		// 새로운 저장소 생성
		int temp;
		temp = a;
		a = b;
		b = temp; 
				
		System.out.println("------- 바꾼 후 결과 ------");
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("========================");
		
		//             0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500,600};
		System.out.println("배열의 크기 : " + nums.length);		
		
		// 배열 전체 데이터 화면출력 
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		} 
		System.out.println();
		
		// 배열 데이터 뒤집기 {500, 400, 300, 200, 100}
		// (실습)
		System.out.println("========뒤집기========");
		int cnt = 0;
		for(int i = nums.length; i > cnt; i--) {
			System.out.print(nums[i-1] + " ");
		} 
		System.out.println();
	
		//(강사님)
		System.out.println();
		System.out.println();
		System.out.println("====================");
		printArray(nums);
		
	
		System.out.println("========뒤집기========");
		/*
		// 첫번째 0 <---> 마지막 5
		temp = nums[0];
		nums[0] = nums[5];
		nums[5] = temp;
		
		// 두번째 <---> 마지막 이전
		temp = nums[1];
		nums[1] = nums[4];
		nums[4] = temp;
		
		// 세번째 <---> 마지막 전전
		temp = nums[2];
		nums[2] = nums[3];
		nums[3] = temp;
		*/
			
		}


		// 메소드 생성 
		static void printArray(int[] nums) {
			for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			} 
			System.out.println();
		}
		
		static void reverse(int[]nums) {
			int lastIdx = nums.length - 1;
			for(int i = 0; i < nums.length / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[lastIdx];
				nums[lastIdx] = temp;
				
				lastIdx--;
			}
		}
		

}