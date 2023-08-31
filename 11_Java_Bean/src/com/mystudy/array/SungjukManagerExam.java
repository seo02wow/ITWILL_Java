package com.mystudy.array;

public class SungjukManagerExam {

	public static void main(String[] args) {
		// 2차원 배열을 사용한 성적 처리 
		// 국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk)을 만들고
		// 3명의 성적을 입력하고 개인별 총점과 평균을 계산 후 화면 출력
		//---------------------
		/*
		국어\t영어 수학 총점 평균 
		-----------------------
		100  90  80  270  90.0
		100  90  81  271  90.33
		100  90  82  272  90.66		
		-----------------------*/
		// 2차원 배열 생성 
		int[][] sungjuk = {{100,90,80}, {100,90,81}, {100,90,82}};
		
		
		String[] name = {"김서영", "김채영", "김순구"};
		int[] tots = new int[sungjuk.length];
		double[] avgs = new double[sungjuk.length];

		System.out.println("----------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		
		// 1번째 사람 데이터 처리 
		for(int i = 0; i < sungjuk.length; i ++) {
			int kor = sungjuk[i][0];
			int eng = sungjuk[i][1];
			int math = sungjuk[i][2];
			//계산처리
			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100.0;
			
			//출력
			System.out.println(kor + "\t" + eng+ "\t" + math+ "\t" + tot+ "\t" + avg);
		} 
		
		

		
		System.out.println("----------------------------");
		
		
	}

}
