package com.mystudy.scanner4_scissors;

import java.util.Scanner;
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
public class ScannerGame {
	private Scanner scan = new Scanner(System.in);
	private final String PAPER ="보";
	private final String SCISSORS ="가위";
	private final String ROCK ="바위";
	private final String MENU = "1.가위   2.바위   3.보   0.종료";

	public void gameStart() {
		System.out.println("::: 가위,바위,보 게임 시작~~~");
		while (true) {
			boolean isContinue = isContinueGame();
			if (!isContinue) break;
		}
		System.out.println("::: 가위,바위,보 게임 끝");
	}	
	
	private boolean isContinueGame() {
		boolean isContinue = true;
		//0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		int comSelect = (int)(Math.random() * 3 + 1);
		
		System.out.println("컴퓨터는 가위,바위,보 중에 하나를 선택했습니다");
		
		//1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력
		System.out.println(MENU);
		int select = selectPerson();
		
		if (select == 0) {
			System.out.println("::: 게임중단");
			return false;
		}
		
		String strComputer = changeNumberToString(comSelect);
		String strPerson = changeNumberToString(select);
		
		System.out.println("사람 선택값 : " + select);
		System.out.println("strPerson : " + strPerson);
		
		//3. 결과 비교 후 승자, 패자 결정
		String result = winnerMsg(strComputer, strPerson);
		
		
		//승패 결과 출력
		System.out.println(">>> 결과 : " + result + " - 컴퓨터: " + strComputer);
		System.out.println();
		return isContinue;
	}

	private String winnerMsg(String strComputer, String strPerson) {
		String result = "판정안됨";
		final String COMPUTER_WIN = "컴퓨터 승";
		final String PEOPLE_WIN = "사람 승";
		if (strComputer.equals(strPerson)) {
			result = "무승부";
		}
		
		if (strComputer.equals(SCISSORS)) {
			if (strPerson.equals(ROCK)) {
				result = PEOPLE_WIN;
			}
			if (strPerson.equals(PAPER)) {
				result = COMPUTER_WIN;
			}
		}
		
		if (strComputer.equals(ROCK)) {
			if (strPerson.equals(SCISSORS)) {
				result = COMPUTER_WIN;
			}
			if (strPerson.equals(PAPER)) {
				result = PEOPLE_WIN;
			}
		}
		
		if (strComputer.equals(PAPER)) {
			if (strPerson.equals(SCISSORS)) {
				result = PEOPLE_WIN;
			}
			if (strPerson.equals(ROCK)) {
				result = COMPUTER_WIN;
			}
		}
		return result;
	}

	private int selectPerson() {
		int select = -1;
		while (true) {
			try {
			System.out.print("선택(1~3)> ");
			select = Integer.parseInt(scan.nextLine());
			if (select >= 0 && select <= 3) {
				break;
			}else { 
				System.out.println("::: 잘못된 선택 0~3 중에 선택하세요 !");
			}
			} catch (Exception e) {
				System.out.println("::: 잘못된 값 입력, 숫자 0~3 중에 선택하세요 !");
			}
		}
		return select;
	}
	
	private String changeNumberToString(int select) {
		String str = "변환안됨";
		switch (select) {
			case 1 : str = SCISSORS; break;
			case 2 : str = ROCK; break;
			case 3 : str = PAPER; break;
		}
		return str;
	}
	


}