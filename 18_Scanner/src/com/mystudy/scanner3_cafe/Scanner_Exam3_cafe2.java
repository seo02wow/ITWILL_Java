package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class Scanner_Exam3_cafe2 { // 강사님

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		final int AMERICANO = 3000;
		final int CAFE_LATTE = 3500;
		final int CAFO_MOCA = 4000;
		final int JUICE = 5000;
		int income = 0;
		
		while (true) {
			System.out.println("1.아메리카노  2.카페라떼  3.카페모카  4.과일주스   0.종료");
			System.out.print("> 메뉴선택(1~4) : ");
			int select = scan.nextInt();
			if (select == 0) {
				System.out.println(">> 영업을 종료합니다.");
				System.out.println("오늘 매출 총액 : " + income + "원 입니다");
				break;
			}
			
			System.out.print("> 수량입력 : ");
			int count = scan.nextInt();
			
			
			System.out.print("> 입금액 : ");
			int inMoney = scan.nextInt();
			
			
			//계산처리 ===========================
			int totMoney = 0; //판매액 = 메뉴단가 * 수량
			/*
			if (select == 1) {
				totMoney = AMERICANO * count;
			} else if (select == 2) {
				totMoney = CAFE_LATTE * count;
			}
			*/
			switch (select) {
			case 1 : totMoney = AMERICANO * count; break; 
			case 2 : totMoney = CAFE_LATTE * count; break; 
			case 3 : totMoney = CAFO_MOCA * count; break; 
			case 4 : totMoney = JUICE * count; break; 
				
			}
			System.out.println("판매액 : " + totMoney);
			
			// 잔액 계산 
			int change = inMoney - totMoney;
			income += totMoney; // 판매금액 누적해서 총 매출액 구하기
			
			// 계산결과 출력
			System.out.println("====================");
			System.out.println("입금액 : " + inMoney);
			System.out.println("판매액 : " + totMoney);
			System.out.println("잔액(거스름돈) : " + change);
			System.out.println();
		}
	}
}
