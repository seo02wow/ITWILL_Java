package com.mystudy.scanner6_bank;

import java.util.Scanner;

/* 은행의 ATM
	1.입금	2.출금	3.통장확인	0.종료
*/
public class BankATM {
	Scanner scan = new Scanner(System.in);
	private int money; // 통장계좌 금액
	
	public void startAtm () {
		System.out.println(":: ATM 시작 ");
		
		playtAtm();
		
		System.out.println(":: ATM 종료 ");
	}
	
	private void playtAtm () {
		money = 0;
		while (true) {
			atm();
			System.out.print("> 작업선택 : ");
			int selectMenu = Integer.parseInt(scan.nextLine());
			
			
			// 1~3이 아닌 값
			if (selectMenu > 3 || selectMenu < 0) {
				System.out.println("[주의] 1 ~ 3 중 선택하세요");
				continue;
			}
			
			// 예외 처리 NumberFormatException
			number(selectMenu);
			
			if (selectMenu == 1) {
				System.out.print("> 입금액 : ");
				int inMoney = Integer.parseInt(scan.nextLine());
				money += inMoney;
			}
			if (selectMenu == 2) {
				System.out.print("> 출금액 : ");
				int outMoney = Integer.parseInt(scan.nextLine());
				// 출금액이 입금액보다 크면 출금 불가
				if (outMoney > money ) {
					System.out.println("[잔액 부족] 계좌에 돈이 부족합니다");
					continue;
				}
				money -= outMoney; 
			}
			if (selectMenu == 3) {
				System.out.print("통장금액 : " + money);
			}
			if (selectMenu == 0) {
				System.out.println(">> ATM을 종료합니다");
				break;
			}
			
			
			System.out.println();
			//System.out.println("통장 잔고 확인 : " + money); //확인용
		}
	}
	//-------------------------------
	
	// ATM 메뉴 
	private void atm () {
		System.out.println("-------------------------------------");
		System.out.println("1.입금	2.출금	3.통장확인	0.종료");
		System.out.println("-------------------------------------");
	}
	
	// 예외 처리 -> 1~3이 아닌 값 
	private int number (int selectMenu) {
		while (true) { // 정상 값일 때까지 반복
			try {
				System.out.println("선택 작업 확인 : " + selectMenu);
				return selectMenu;
			} catch (NumberFormatException e) {
				System.out.println("[주의] 숫자 1 ~ 3 중 고르세요.");
			}
		}
	}
}

