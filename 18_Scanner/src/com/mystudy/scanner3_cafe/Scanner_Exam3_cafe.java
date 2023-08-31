package com.mystudy.scanner3_cafe;

import java.util.Scanner;

public class Scanner_Exam3_cafe {

	public static void main(String[] args) {
		/*(실습) 카페 음료 주문 처리
		음료의 종류 : 
		1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000)
		-------------------------------------
		입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		----------------------------------------		
		while (true) {	
			1.아메리카노  2.카페라떼  3.카페모카  4.과일주스 0.종료
			> 메뉴를 선택하세요(1~4) : 1
			> 주문수량 : 3
			> 입금액 : 10000
			==================
			입금액 : 10000
			판매액 : 9000(단가*수량)
			잔약 : 10000 - 9000 : 1000
			
			1.아메리카노  2.카페라떼  3.카페모카  4.과일주스 0.종료
			> 메뉴를 선택하세요(1~4) : 0 -> 종료 
		}
		====================================================*/
		Scanner scan = new Scanner(System.in);
		// 입력 -------------------------------------------------------
		final int [] arr = new int[] {3000, 3500, 4000, 5000};
		
		for ( ; ; ) {
		System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
		System.out.print("> 메뉴를 선택하세요(1~4) : ");
		int menu = scan.nextInt();
		// 단가 설정 
		int menuNum = arr.length;
		int price = 0;
		for (int i = 0; i < menuNum; i++) {
			if (menu == i+1) {
				price = arr[i];
			}
		}
		System.out.println("단가 : " + price);
		//-----------------------------------------------
		System.out.print("> 주문수량 : ");
		int num = scan.nextInt();
		System.out.print("> 입금액 : ");
		int money = scan.nextInt();
		System.out.println("====================");
		// 처리 ------------------------------------------------
		int tot = (price * num); // 단가*수량
		int coin = money - tot;
		// 결과
		System.out.println("입금액 : " + money + "원");
		System.out.println("판매액 : " + tot + "원");
		System.out.println("잔액 : " + coin + "원");
		System.out.println("1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료");
		System.out.print("> 메뉴를 선택하세요(1~4) : ");
		int answer = scan.nextInt();
		if (answer == 0) {
			System.out.println("::: 주문을 종료합니다");
			break;
		} 
		
		}
	}

}
