
public class Ex03 {

	public static void main(String[] args) {
		//  십진수, 2진수, 8진수, 16진수
		int decimal = 10; // 십진수값 저장
		int binary = 0b1010; // 0b,0B 접두어 사용 - 자바에서 2진수값 표현
		int octal = 012; // 0 접두어 숫자 0사용(8진수)
		int hexaDecimal = 0Xa; // 0x, 0X 접두어 사용(16진수)
		
		//                            10 11 12 13 14 15  
		//16진수 : 0 1 2 3 4 5 6 7 8 9  a  b  c  d  e  f 
		//16진수 : 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F 
		
		System.out.println("decimal : " + decimal);
		System.out.println("binary : " + binary);
		System.out.println("octal : " + octal);
		System.out.println("hexaDecimal : " + hexaDecimal);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		
		

	}

}
