
public class Ex11_while_exam {

	public static void main(String[] args) {
		// While 문 사용해서 처리 
		// (실습) 문제1 : 1부터 10까지의 합을 구하고 화면에 출력 
		
		System.out.println("---문제1---");
		int sum1 = 0;
		int num1 =1;
		while (num1 <= 10) {
			sum1 = sum1 + num1; // sum += num1;
			System.out.println("num1 :" + num1 + " sum1 : " + sum1);
			num1++;
		}
		System.out.println(" 1 ~ 10의 합 : "+ sum1);
		//
		System.out.println("---문제1 for---");
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1~10 합계 : " + sum);		
		
		/* (실습) 문제2 -----
		*****
		*****
		***** 
		--------------*/
		System.out.println("---문제2---");
		int num2 = 1;
		int num3 = 1;
		while (num3 <=3 ) {
			num2 = 1;  
			// 값을 바꿔주지 않으면 num3이 2일 때 num2이 6이므로 아래 문장 실행 안 함
			while (num2 <= 5) {
				System.out.print("*");
				num2++;
			} 
			System.out.println();
			num3++;
		} 
		
		/* (실습) 문제3 -----
		*
		**
		***
		**** 
		***** 
		--------------*/
		System.out.println("---문제3---");
		

	}

}
