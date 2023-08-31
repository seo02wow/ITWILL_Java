package com.mystudy.scanner6_bank;

import java.util.Scanner;

public class BankATM1 {
	private int money;
	private Scanner scan = new Scanner(System.in);
	
	public void startBank () {
		System.out.println(">>> 어서오세요 (ATM 사용)");
		while (true) {
			int select = runningATM();
			if(select == 0) {
				break;
			}
		}
		System.out.println(">>> ATM 사용을 종료했습니다");
	}
	
	private int runningATM() {
		// 1. 메뉴표시
		showMenu();
		
		// 2. 메뉴선택
		// 예외처리 (메뉴,입/출금액-->NumberFormatException)
		int select = -1; 
		// try문 밖에서도 사용하기 위해 임의의 값 넣어줌 
		// 예외발생할 때 값이 없음 , 로컬 변수는 초기값이 반드시 있어야 함
		try {
			select = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("[예외 발생] 잘못된 값이 입력되었습니다."
					+ "메뉴(0~3) 숫자만 입력하세요.");
		}
		
		if (select == 0) {
			System.out.println(":: ATM 종료");
			return select;
		}
		// 3. 선택작업 처리
		if (select == 1) {
			inPutMoney();
		}
		if (select == 2) {
			outPutMoney();
		}
		if (select == 3) {
			showMoney();
		}
		
		
		return select;
	}
	
	private void outPutMoney() {
		System.out.print("> 출금액 : ");
		money -= Integer.parseInt(scan.nextLine());
		
	}

	private void showMoney() {
		System.out.println(":: 통잔 잔액 : " + money);
		
	}

	private void inPutMoney() {
		while (true) { // 정상값이 들어올 때까지 반복
			try {
				System.out.print("> 입금액 : ");
				money += Integer.parseInt(scan.nextLine()); 
				break; // 빠져나감 
			} catch(Exception e) {
				System.out.print("[예외 발생] 잘못된 값이 입력되었습니다."
						+ " 숫자(0~9)만 입력하세요.");
			}
		}
	}

	// ATM 메뉴 
		private void showMenu () {
			System.out.println("-------------------------------------");
			System.out.println("1.입금	2.출금	3.통장확인	0.종료");
			System.out.println("-------------------------------------");
			System.out.print("> 작업선택 : ");
		}
	
}
