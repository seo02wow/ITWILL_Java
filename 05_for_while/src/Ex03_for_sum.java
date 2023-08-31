
public class Ex03_for_sum {

	public static void main(String[] args) {
		// 문제 : 1 ~ 10까지의 합계를 구하시오(for, 화면 출력)
		// 1~10 까지의 합계 : 55
		//int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		//System.out.println("1~10 까지의 합계 : " + sum);
		
		System.out.println("----------------------");
		int sum = 0; // 합계 저장할 변수 
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // sum += i;
		} 
		System.out.println("1~10 까지의 합계 : " + sum); // for문에는 중괄호 뒤에 x
		System.out.println("-----------------");
		
		//(실습) 1 ~ 10까지의 숫자 중에 짝수를 찾아서 출력(짝수면 출력해라) 
		System.out.println("<짝수>");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {  // i가 짝수 ? , for문 내 if문 가능
				System.out.println(i);
			}
		}
		
		System.out.println("<홀수>");
		//(실습) 1 ~ 10까지의 숫자 중에 홀수를 찾아서 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0 ) {  // i가 홀수 ?  1 % 2 > 0 ->보다 != 사용이 음수까지 고려한다면 더욱 범용적
				System.out.println(i); 
			}
		}
		
	}

}
