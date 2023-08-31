package com.mystudy.scanner2_sungjuk;

import java.util.Scanner;

//(개인별 실습) : StudentVO, List에 처리된 데이터 모아서 사용
public class ScannerSungjuk {
	private String name; // 외부에서 데이터 사용할 일 X -> private
	private int kor;
	private int eng;
	private int math; 
	private int tot;
	private double avg;
	
	public ScannerSungjuk() {}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
	
		for( ; ; ) {
			input(scan); //입력
			
			process(); //처리
			
			output();// 결과 출력
			
			System.out.println(">> 계속할거냐 ? (중단 : 0 입력)");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("0")) {
				System.out.println(":: 작업을 중단합니다 ");
				break;
			}
			System.out.println("========");
	
		}
		
		
	}
	
	private void input(Scanner scan) {
		//입력-----------------------------------
		System.out.print("성명 입력 : ");
		name = scan.nextLine(); // 문자열(String) 값 읽기 

		System.out.print("국어 입력 : ");
		kor = scan.nextInt(); // 필드에 값 저장
		
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		scan.nextLine(); // nextInt() 뒤에 nectLine() 오류 발생 막음.
	}
	
	private void process() {
		// 처리
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
		avg = Math.round(tot * 100 / 3.0 ) /100.0;
	}
	
	private void output() {
		//결과 출력 ----------------------
		System.out.println("\n=== 성적처리 결과 ===");
		System.out.println("성명 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("--------------");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println();

	}
}
