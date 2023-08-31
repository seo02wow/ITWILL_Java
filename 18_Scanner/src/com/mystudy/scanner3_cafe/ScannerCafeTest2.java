package com.mystudy.scanner3_cafe;

public class ScannerCafeTest2 {

	public static void main(String[] args) {
		
		System.out.println("== main() 시작 ===");
		System.out.println("AMERICANO : " + ScannerCafe2.AMERICANO); // 어디서든 사용 가능 
		ScannerCafe2 cafe = new ScannerCafe2();
		
		cafe.openCafe();
		
		System.out.println("== main() 끝 ===");
		
		
	}
}
