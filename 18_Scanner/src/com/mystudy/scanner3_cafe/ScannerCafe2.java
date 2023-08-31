package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class ScannerCafe2 {
	Scanner scan = new Scanner(System.in);
	public static final int AMERICANO = 3000;  
	public static final int CAFE_LATTE = 3500;
	public static final int CAFO_MOCA = 4000;
	public static final int JUICE = 5000;
	int income = 0;
	// 다른 클래스에서도 스캐너 객체 사용 가능함
	
	public void openCafe() {
		while (true) {
			showMenu ();
			
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
			int totMoney = computeMoney(select, count); //판매액 = 메뉴단가 * 수량
			
			
			
			System.out.println("판매액 : " + totMoney);
			
			// 잔액 계산 
			int change = inMoney - totMoney;
			income += totMoney; // 판매금액 누적해서 총 매출액 구하기
			
			// 계산결과 출력
			displayResult(inMoney,totMoney,totMoney); // 전달
		}
	}
	// 메소드 ----------------------------------------------
	private void showMenu () {
		System.out.println("1.아메리카노  2.카페라떼  3.카페모카  4.과일주스   0.종료");
		System.out.print("> 메뉴선택(1~4) : ");
	}
	
	private int computeMoney (int select,int count) {
		int result = 0;
		switch (select) {
		case 1 : result = AMERICANO * count; break; 
		case 2 : result = CAFE_LATTE * count; break; 
		case 3 : result = CAFO_MOCA * count; break; 
		case 4 : result = JUICE * count; break; 
		}
		return result;
	}
	
	private void displayResult(int inMoney,int totMoney, int change) { // 전달받음
		System.out.println("====================");
		System.out.println("입금액 : " + inMoney);
		System.out.println("판매액 : " + totMoney);
		System.out.println("잔액(거스름돈) : " + change);
		System.out.println();
	}
	
	
}
