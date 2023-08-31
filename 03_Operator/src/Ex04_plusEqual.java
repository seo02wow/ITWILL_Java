
public class Ex04_plusEqual {

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 예) num =+ 2; -> num = num +2; 
		int result = 0; 
		System.out.println("result : " + result);
		
		System.out.println("------  += 연산 ------");
		result += 15; // result = result + 15; 와 같은 문장 (=은 같다가 아닌 저장)
		System.out.println("result += 15 : " + result);
		
		result += 15; // result = result + 15; 
		System.out.println("result += 15 : " + result);
		System.out.println(); // 줄바꿈 처리
		
		System.out.println("------  -= 연산 ------");
		System.out.println("result : " + result);
		result -= 10; // result = result - 10;
		System.out.println("result -= 10 : " + result);
		System.out.println(); // 줄바꿈 
		
		System.out.println("------  *= 연산 ------");
		result *= 10; // result = result * 10;
		System.out.println("result *= 10 : " + result);
		System.out.println(); // 줄바꿈 
		
		System.out.println("------  /= 연산 ------");
		result /= 10; // result = result / 10;
		System.out.println("result /= 10 : " + result);
		System.out.println(); // 줄바꿈 
		
		System.out.println("------  %= 연산 ------");
		result %= 3; // result = result % 3;  나머지 값을 구하는 것
		System.out.println("result %= 3 : " + result);
		
		
		
	}

}
