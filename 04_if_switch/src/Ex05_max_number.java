
public class Ex05_max_number {

	public static void main(String[] args) {
		/* (실습) 숫자 3개 중 가장 큰 수를 구하시오
		 a: 30, b: 60, c: 20
		 <결과>
		 가장 큰 수 : 60
		 ----------------*/
		
		int a = 30;
		int b = 60;
		int c = 20;
	
		
		if (a > b) { // a가 큰 경우 
			if (a > c) { //if문 내 중첩 가능
				System.out.println("가장큰수 :" + a);
			} else {
				System.out.println("가장큰수 : " + c);
			} 
			} else { // b가 큰 경우
			if (b > c) {
				System.out.println("가장큰수 : " + b);
			} else {
				System.out.println("가장큰수 : " + c);
			}
		}
		
		
		// -------------------------------
		/* (실습) 숫자 5개 중 가장 큰 수를 구하시오
		 a : 30, b : 60, c : 20, d : 15, e : 70
		 <결과>
		 가장큰 수 : 70 
		 ---------------------*/
	
		// int max = 0; // 가장 큰 값
		int max = Integer.MIN_VALUE;  // 실 데이터 중 첫번째 값이나 최소값을 변수로 설정 

		if (a > max) {
			max = a;
		}
		if (c > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("가장큰수(max) :" + max);

	}

}