package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class ScannerCafe {
	int [] arr = new int[] {3000, 3500, 4000, 5000};
	private int menu;
	private int menuNum;
	private int price;
	private int num;
	private int money;
	private int tot;
	private int coin;
	
	public ScannerCafe() {}
	
	public void start () {
		Scanner scan = new Scanner(System.in);
		
		for ( ; ; ) {
			input(scan);
			
			process();
			
			output();
			
			System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
			System.out.print("> 메뉴를 선택하세요(1~4) : ");
			int answer = scan.nextInt();
			if (answer == 0) {
				System.out.println("::: 주문을 종료합니다");
				break;
			} 
			
		}
		
	}
	
	// 메소드 -----------------------------
	private void input(Scanner scan) {
		//입력
		System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
		System.out.print("> 메뉴를 선택하세요(1~4) : ");
		menu = scan.nextInt();
		// 단가 설정 
		menuNum = arr.length;
		price = 0;
		for (int i = 0; i < menuNum; i++) {
			if (menu == i+1) {
				price = arr[i];
			}
		}
		System.out.println("단가 : " + price);
		//-----------------------------------------------
		System.out.print("> 주문수량 : ");
		num = scan.nextInt();
		System.out.print("> 입금액 : ");
		money = scan.nextInt();
		System.out.println("====================");
	}
	private void process() {
		//처리
		tot = (price * num); // 단가*수량
		coin = money - tot;
	}
	
	private void output() {
		//결과
		System.out.println("입금액 : " + money + "원");
		System.out.println("판매액 : " + tot + "원");
		System.out.println("잔액 : " + coin + "원");
	}
	
}
