package com.mystudy.scanner4_scissors;

import java.util.List;
import java.util.Scanner;

public class Scanner_Exam4_Scissors {

	public static void main(String[] args) {
		/* Scanner를 이용한 가위, 바위 , 보 게임 *******
		// scissors, rock, paper
		// draw : 무승부, person_win, computer_win
		컴퓨터와 함께하는 가위,바위,보 게임
		0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
		2. 선택값 입력
		3. 결과 비교 후 승자, 패자 결정
		(반복) 게임 반복 진행 - 0 선택시 종료 처리
		=============================== */
		Scanner scis = new Scanner(System.in);
		
		int computer = (int)(Math.random()*3+1); //1,2,3
		
		for( ; ; ) {
			System.out.print("1.가위   2.바위   3.보   0.종료 : ");
			int select = scis.nextInt();
			if (select == 0) {
				System.out.println(":: 가위바위보를 종료합니다");
				break;
			}
			System.out.print("가위바위보 결과 : ");
			if (computer == 1) {
				switch (select) {
				case 1 : System.out.println("무승부"); break;
				case 2 : System.out.println("패"); break;
				case 3 : System.out.println("승"); break;
				}
			}

			if (computer == 2) {
				switch (select) {
				case 1 : System.out.println("승"); break;
				case 2 : System.out.println("무승부"); break;
				case 3 : System.out.println("패"); break;
				}
			}

			if (computer == 3) {
				switch (select) {
				case 1 : System.out.println("패"); break;
				case 2 : System.out.println("승"); break;
				case 3 : System.out.println("무승부"); break;
				}
			}
			System.out.println("==============================");
		}
		
	}

}
