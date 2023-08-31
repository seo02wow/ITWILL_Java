package com.mystudy.wrapper;

public class Ex01_wrapper_class {

	public static void main(String[] args) {
		// wrapper class : 기본 데이터 타입의 기능확장한 클래스(들) 총칭
		// 기본 데이터 타입 : 전체 소문자 
		// boolean, char, byte, short, int, long, float, double
		// wrapper class : 기본 데이터 타입의 첫글자를 대문자로 함
		// 에외 : char -> Character, int -> Interger
		// Boolean, Character, Byte, Short, Interger, Long, Float, Double
		//--------------------------
		int num = 100;
		System.out.println("num : " + num);
		
		// Integer intNum = new Integer(100); 
		Integer intNum = new Integer("100");
		System.out.println("Integer intNum : " + intNum);
		
		String strNum = intNum.toString(); // toString : 저장 되어 있는 데이터를 문자열로 형변환
		System.out.println("String strNum : " + strNum);
		
		intNum = 900; // Integer <-- int : 자동형변환
		num = intNum; // int <-- Integer : 자동형번환 
		
		num = Integer.parseInt("999"); // 문자열 데이터 타입이 기본 데이터 타입 int로 변환 (int <-- String 형변환)
		intNum = Integer.valueOf("999"); // Integer <--- String 
		
		String str = String.valueOf(9999); // String <-- int 형변환 , valeOf : 전달 받은 데이터를 해당 데이터로 변환
		
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		
		System.out.println("--- Boolean ---");
		Boolean bool = true;
		bool = new Boolean(true); 		
		bool = new Boolean("true");
		bool = new Boolean("TRUE"); 
		bool = new Boolean("TRue"); // 대소문자 상관 없이 철자만 맞으면 true
		
		System.out.println("Boolean true : " + bool);
		
		bool = new Boolean("false");
		bool = new Boolean("FALSE");
		bool = new Boolean("FALse");		
		bool = new Boolean("true1"); // true가 아닌 문자열은 flase
		bool = new Boolean("hi"); // flase
		System.out.println("Boolean false : " + bool);
		
		System.out.println("--- String -> Boolean 형변환 ---");
		Boolean bool2 = Boolean.valueOf("true"); // 문자열을 Boolean 으로 형변환
		boolean bool3 = Boolean.parseBoolean("true"); 
		
		System.out.println("=== Float,Double ===");
		Float f = 10.5f; // Float <-- float 자동형변환
		f = new Float(12.5f);
		f = new Float("12.5f");
		f = new Float("12.5");
		System.out.println("Floar f : " + f);
		
		//f = "12.5f;" //Type mismatch: cannot convert from String to Float
		String str2 = String.valueOf(f); // Float 을 Strin으로
		System.out.println("String str2 : " + str2);
		
		f = Float.valueOf("12.5f"); // 스트링을 Flaot으로 
		System.out.println("Float f : " + f);
		System.out.println("--------------------");
		
		Double d = 10.5d; // Double <--- double 
		d = new Double(12.5d);
		d = new Double("12.5d");
		System.out.println("Double d : " + d);
		
		d = Double.valueOf("12.5d"); // 문자열 더블타입으로 형변환
		d = Double.valueOf("12.5");
		d = Double.valueOf("10.5f"); //float 가능
		System.out.println("Double d : " + d);
		
		
	}

}
