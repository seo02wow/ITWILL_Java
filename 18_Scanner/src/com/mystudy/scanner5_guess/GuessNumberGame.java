package com.mystudy.scanner5_guess;

import java.util.Scanner;

/* 숫자 추측 게임
컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
선택 기회 5회
---------------------
Math.random() : 0 <= random값 < 1 범위의 실수값 
컴숫자 : 70 인 경우 
  사람이 선택한 숫자(80)가 크면 : 생각한 숫자보다 작다는 메시지 출력
  사람이 선택한 숫자(50)가 작으면 : 생각한 숫자보다 크다는 메시지 출력
5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
-----
다시 도전하시겠습니까?(y,n) 
---------------------------
*/
public class GuessNumberGame {
	Scanner scan = new Scanner(System.in);
	int random = (int)(Math.random() * 100 + 1);
	int gameNum = 5;
	private final String MENU = ":: 컴퓨터가 생각한 숫자 하나를 추측해보세요";
	private final String CHOICE = ">> 숫자 1 ~ 100 중 고르시오 : ";
	private final String HIGH = "컴퓨터가 생각한 숫자는 생각보다 큽니다.";
	private final String LOW = "컴퓨터가 생각한 숫자는 생각보다 작습니다.";
	
	public void gameStart() {
		System.out.println("::: 숫자 추측 게임 시작");
		while (true) {
			boolean isContinue = isContinueGame();
			if (!isContinue) break;
		}
	}
	
	
	private boolean isContinueGame() {
		boolean isContinue = true; 
		System.out.println("random : " + random); // 랜덤 숫자 확인
		System.out.println(MENU);
		System.out.println(":: 남은 기회는 " + gameNum + "번입니다");
		System.out.print(CHOICE);
		int select = scan.nextInt();
		
		winMsg(select);
		continueMsg(select);
		
		if (gameNum == 0) {
			System.out.println("실패 !!! 컴퓨터가 생각한 숫자는 " + random +" 입니다");
			System.out.print("다시 도전하시겠습니까 ? (1/2) : ");
			int retry = scan.nextInt();
			if (retry == 1) {
				gameNum = 5;
			} 
			if (retry == 2) {
				System.out.println(":: 게임을 종료합니다.");
				return false;
			}
		}
		return isContinue; // 맨 아래 고정 
	}
	
	//---------------------------------------------------
	
	private boolean winMsg (int select) {
		boolean isContinue = true;
		if (select == random) {
			System.out.println("성공 !!! " + (gameNum) + "번만에 맞췄습니다.");
			isContinue = false;
		}
		return isContinue;
	}
	
	private boolean continueMsg (int select) {
		boolean isContinue = true;
		if (select < random) {
			System.out.println(HIGH);
			gameNum --;
		}
		if (select > random) {
			System.out.println(LOW);
			gameNum --;
		}
		return isContinue;
	}
}
