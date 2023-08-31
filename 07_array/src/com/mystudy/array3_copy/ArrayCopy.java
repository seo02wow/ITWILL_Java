package com.mystudy.array3_copy;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 데이터 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// 참조형 데이터 비교 : == (주소값 비교, 동일객체 여부 비교) 
		System.out.println("num1 == num2 : " + (num1 == num2));  // false
		
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		
		printData(num1,"num1"); // 메소드
		printData(num2,"num2");
		
		System.out.println("--- 배열 복사(주소값 복사,얕은 복사) ---");
		num2 = num1; // 주소값 복사(동일한 곳을 참조)
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num1 == num2 : " + (num1 == num2)); // true
		
		
		printData(num1,"num1"); // 메소드
		printData(num2,"num2");
		
		System.out.println("--- 배열값 복사(물리적 복사,깊은복사(deep copy)) ---");
		
		int[] num3 = new int[num1.length]; // num1 배열과 같은 크기로
		printData(num3,"num3");
		
		//num3 <----- num1 배열 값 복사
		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i];
		}
		printData(num1,"num1");
		printData(num3,"num3");
		System.out.println("num1 == num3 : " + (num1 == num3)); // 같은 주소를 가리키는지?
		
		num1[0] = 10;
		System.out.println(">> num1[0] 변경 후");
		printData(num1,"num1");
		printData(num3,"num3"); // 값 다른 거 확인 
		System.out.println("----------------------------");
		
		// 배열 데이터 복사
		System.out.println("-----System.arraycopy() 복사하기-----");
		int[] num4 = new int[num1.length];
		printData(num1,"num1");
		printData(num4,"num4");
		
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		System.arraycopy(num1, 0, num4, 0, num1.length);
		//num1[0]부터 num4[0]에 길이 num1.length만큼 복사\
		System.out.println(">> System.arraycopy() 복사 후");
		printData(num1,"num1");
		printData(num4,"num4");
		System.out.println("num1 == num4 : " + (num1 == num4)); // false
		
		System.out.println("--- 배열객체.clone() 복사(복제) ---");
		int[] num5 = num4.clone();
		printData(num4,"num4");
		printData(num5,"num5");
		System.out.println("num4 == num5 : " + (num4 == num5)); // false
		
		System.out.println("--- Arrays.copyOf() 사용 복사 ---");
		// Arrays.copyOf(원본데이터, 복사할 갯수)
		int[] num6 = Arrays.copyOf(num4, num4.length); // num4의
		printData(num4,"num4");
		printData(num6,"num6");
		System.out.println("num4 == num6 : " + (num4 == num6));
		
		//Arrays.copyOfRange(원본, from, to) : from 부터 to 이전까지 
		num6 = Arrays.copyOfRange(num4, 0, 3);
		printData(num4,"num4");
		printData(num6,"num6");
		System.out.println("num4 == num6 : " + (num4 == num6));
	
		num6 = Arrays.copyOfRange(num4, 1, 4);
		printData(num4,"num4");
		printData(num6,"num6");
		System.out.println("num4 == num6 : " + (num4 == num6));
		
	}
	
	static void printData(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	// 메소드 오버로딩 (methood overloading)
	// 하나의 클래스 내에서 메소드 이름이 같아도 데이터 타입이 다르기 때문에 다르게 동작 (구분 가능)
	static void printData(int[] num,String name) { 
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
