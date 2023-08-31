package com.mystudy.array;

public class Ex03_array_star {

	public static void main(String[] args) {
		/* 별찍기
		*
		**
		***
		****
		*****
		----------------------------------*/
		// char 타입의 데이터를 5개 저장할 수 있는 배열을 만들고 별(*) 입력
		char [] ch = new char[] {'*', '*', '*', '*', '*'};
		
		int cnt = 0;
		for (int line =0; line <= 5; line++) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(ch[i]);
			} 
			System.out.println();
			cnt++;
		}
		System.out.println("--------------------------");
		//
		for (int line = 1; line <= 5; line++) {
			for (int i = 0; i < line; i++) {
				System.out.print(ch[i]);
			} 
			System.out.println();
		}


	}

}
