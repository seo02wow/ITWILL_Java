
public class Ex03_byte {

	public static void main(String[] args) {
		// 정수형 byte : 정수 숫자 저장 256개(-128 ~ 127)
		byte byte1 = 100;
		byte byte2 = 28;
		
		System.out.println("byte1 : " + byte1);
		System.out.println("byte2 : " + byte2);
		
		// 연산 결과 값이 표현범위를 벗어나면 예상치 못한 결과값이 나옴(잘못된 결과)
		byte byte3 = (byte)(byte1 + byte2); // 바이트끼리 더하면 int로 변환되기 때문에 형변환 필요
		System.out.println("byte1 + byte2 : " + byte3);
		
		//------------------
		System.out.println("----- byte 최소,최대값 -----");
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);

	}

}
