
public class Ex06_long {

	public static void main(String[] args) {
		// 정수형 long : 8byte 
		// 범위 : 충분히 큰 수
		// long 타임값 명시적 표현 : 숫자 + L 또는 l (영문 대소문자)
		long num1 = 2000000000L; // long을 의미하는 접미어 L 사용
		long num2 = 3000000000L;
		long sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + "=" + sum);
		System.out.println("==============");
		
		byte numByte = 10;
		short numShort = 3000;
		int numInt = 3000000;
		long numLong = 5000000000L;
		
		numByte = (byte)numShort; // 손실방생 가능성 있음 - 잘못된 값 발생 가능성
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; // 자동형변환 long타입에 int 타입 넣음 , 손실 발생X
		System.out.println("numLong : " + numLong);
		
		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최소값 : " + Long.MAX_VALUE);
	}

}
