package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔(화면)에서 데이터 읽어오기
		Scanner scan = new Scanner(System.in); // in: System에 있는 변수 (static)
		
		System.out.print("문자열 입력1 : ");
		String str1 = scan.nextLine(); // 콘솔로부터 한 줄의 문자열을 입력받는 역할
		System.out.println(">>> " + str1); // 받은 문자열을 String에 저장하고 입력 
		System.out.println("----------");
		
		System.out.print("문자열 입력2 : ");
		String str2 = scan.nextLine();
		System.out.println(">>> " + str2);
		
		System.out.println("==========");
		System.out.println("정수값 2개를 입력하면 더한 결과 출력");
		int sum = 0;
		
		// (주의) nextXxx 메소드 사용 후 nextLine() 사용 시 문자발생 
		System.out.print("숫자 입력1 : ");
		int num1 = scan.nextInt();
		scan.nextLine(); // 줄바꿈(엔터) 문자까지의 값을 읽어서 처리 
		
		System.out.print("숫자 입력2 : ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		
		sum = num1 + num2;
		System.out.println("합계 : " + sum);
		
		System.out.print("문자열(nextLine) : " );
		String temp = scan.nextLine(); 
		// nextxxx 와 nextLine이 연달아오게 되면 입력한 데이터 옆의 줄바꿈 문자를 읽음 
		System.out.println("입력문자열 출력 : " + temp);
		
		System.out.println("==========");
		System.out.print("문자열 1개와 정수 숫자 3개 연속 입력 : ");
		String strtemp = scan.next();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		System.out.println("첫번째 문자열 : " + strtemp);
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		
		
	}

}
