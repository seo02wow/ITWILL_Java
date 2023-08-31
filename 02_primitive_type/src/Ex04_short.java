
public class Ex04_short {

	public static void main(String[] args) {
		// 정수형 short : 2byte(데이터 갯수 : 65536,범위 : -32768 ~ 32767)
		short short1 = 20000;
		short short2 = 30000;
		
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		// 표현범위 벗어나면 원치 않는 결과값 가짐 -15536
		short sum = (short)(short1 + short2); // 결과값 int로 되기 때문에 형변환 필요
		System.out.println("short sum : " + sum);
		
		int sumInt = short1 + short2; // 범위 벗어나기 때문에 int 값으로 표현 
		System.out.println("int sumInt : " + sumInt);

	}

}
