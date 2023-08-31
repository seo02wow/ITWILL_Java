package com.mystudy.scanner5_guess;

import java.util.Scanner;

public class GuessNumberGameTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 컴퓨터 랜덤 숫자 설정 
		int random = (int)(Math.random() * 100 + 1);
		// 남은 게임 횟수
		int gameNum = 5;
		// 게임 시작 
		System.out.println("::: 숫자 추측 게임 시작");
		while (true) {
			System.out.println("random : " + random); // 랜덤 숫자 확인
			System.out.println(":: 컴퓨터가 생각한 숫자 하나를 추측해보세요");
			System.out.println(":: 남은 기회는 " + gameNum + "번입니다");
			System.out.print(">> 숫자 1 ~ 100 중 고르시오 : ");
			int select = scan.nextInt();
			
			if (select == random) {
				System.out.println("성공 !!! " + (gameNum) + "번만에 맞췄습니다.");
				break;
			}
			if (select < random) {
				System.out.println("컴퓨터가 생각한 숫자는 생각보다 큽니다.");
				gameNum --;
			}
			if (select > random) {
				System.out.println("컴퓨터가 생각한 숫자는 생각보다 작습니다.");
				gameNum --;
			}
			if (gameNum == 0) {
				System.out.println("실패 !!! 컴퓨터가 생각한 숫자는 " + random +" 입니다");
				System.out.print("다시 도전하시겠습니까 ? (1/2) : ");
				int retry = scan.nextInt();
				if (retry == 1) {
					gameNum = 5;
				} 
				if (retry == 2) {
					System.out.println(":: 게임을 종료합니다.");
					break;
				}
			}
		}
	}

}
