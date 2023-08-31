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
public class GuessNumberGame1 {
	private Scanner scan = new Scanner(System.in);
	private int min = 1; 
	private int max = 100; // 필드변수 -> 클래스 전체 영역에서 사용
	
	public void startGame() { // 여기 안에 메소드 다 들어가야 함
		System.out.println(":: 게임 시작");
		while (true) {
			playGame();
			//게임 재도전
			System.out.print("게임을 재도전 하시겠습니까? (Y/N)");
			if ("N".equalsIgnoreCase(scan.nextLine())) { // 대소문자 상관 X
				break;
			}
 		}
		
		System.out.println(":: 게임 종료");
	}
	
	//---------------------------------------------------
	
	
	private void playGame() {
		System.out.println("----------->> 게임 플레이 시작 <<-----------");
		//1. 컴퓨터 1~100 중 숫자 택1 -> 다섯 번 반복 포함 X 
		int comNo = (int)(Math.random() * 100 + 1); 
		System.out.println("컴퓨터가 1 ~ 100 숫지 중 하나를 생각했습니다 "
				+ " 5번 이내에 맞춰보세요 ~");
		System.out.println("> 컴퓨터가 생각한 숫자 : " + comNo);
		
		
		min = 1;
		max = 100; 
		//2. 사람이 숫자 선택
		int tryCnt = 1;
		while (tryCnt < 5) {
			int selectNo = selectNumber(tryCnt); // ()-> 전달
			
			if(selectNo < min || selectNo > max) {
				System.out.println(":: 범위를 확인하고 다시 입력하세요");
				continue; 
			}
			
			//3. 사람 숫자와 컴퓨터 숫자 비교 판정
			if (comNo == selectNo) {
				System.out.println(":: 성공 !!! 제가 생각한 숫자는 "
						+ selectNo + " 입니다.");
				break; // 맞추면 빠져나가기 
			}
			if (comNo > selectNo) {
				System.out.println(selectNo + "보다 큽니다.");
				min = selectNo + 1;
				
			}
			if (comNo < selectNo) {
				System.out.println(selectNo + "보다 작습니다.");
				max = selectNo - 1;
			}
			
			//5번에서도 실패했을 때
			if(tryCnt == 5) {
				System.out.println(":: 실패 ! 제가 생각한 숫자는 "
						 + selectNo + " 입니다.");
			}
			
			tryCnt++;
		}
		System.out.println("----------->> 게임 플레이 종료 <<-----------");
		System.out.println();
	}	
		
		
		
	//숫자 선택 / 예외 처리 : 1~100 숫자가 아닌 값일 때
	private int selectNumber (int tryCnt) { 
		// i-> tryCnt, 필드변수는 별도로 받지 않아도 됨 ?
		int number = -1;
		while (true) { // 정상 데이터가 들어올 때까지 반복
			try {
				//게임 횟수
				System.out.print(tryCnt + "번째 숫자 선택 (" + min + " ~ " + max + ") > ");
				number = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("[주의] 숫자를 입력하세요");
			}
		}
		return number;
	}

	
}
