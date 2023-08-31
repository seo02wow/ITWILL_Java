
public class Ex06_for_star {

	public static void main(String[] args) {
		// ***** 화면출력 
		
		System.out.println("*****"); // 줄바꿈 처리 o
		System.out.println("-------------");
		
		System.out.print("*****"); // 줄바꿈 x
		System.out.println(); // 줄바꿈 역할
		System.out.println("-------------");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("----- 반복문 사용하여 ptint * 찍기 반복 -----");
		for (int i =1; i <= 5; i++) {
			System.out.print("*");
		} // for문
		System.out.println(); // 반복 x
		System.out.println("====================");
		/* 문제 : 3개 행 출력처리(각 행별로 * 5개 출력)
		 *****
		 *****
		 *****
		 *****
		--------------------- */
		System.out.println("---for문 1번 적용---");
		// 1번째 줄
		for (int i=1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(); 
		
		// 2번째 줄
		for (int i=1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(); 
		
		// 3번째 줄
		for (int i=1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(); 
	
		System.out.println("===== 반복 처리 =====");
		
		for (int line =1; line <= 3; line++) {
			for (int i=1; i <=5; i++) {  // 상위 for문 1번 실행될 때 5번 실행
			System.out.print("*");
		}
		System.out.println();
	}
	
		System.out.println("====================");
		
		for (int i = 1; i <= 3; i++) {
			for(int star = 1; star <= 5; star++) {
				System.out.print("*"); 
			}
			
			System.out.println();
		}
		System.out.println("===============");
		
		System.out.println("===== 삼각형 * 찍기 =====");
		/*    화면에 삼각형 모양 출력 , 별 하나씩 찍기 
		*
		**
		*** 
		***** 
		****** 
		-------------------- */
		for (int i = 1; i <= 5; i++) { // 5번 반복 
			for (int j = 1; j <= i; j++) { // i수 만큼 * 반복
				System.out.print("*");
			}	System.out.println();
		} 		
		
		System.out.println("----- 세분화 ------");
		System.out.print("*");
		System.out.println(); // == System.out.println("*");
		
		/*for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		} */
			
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		/*for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		} */
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		/*for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}*/
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		/*for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		} */
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		/*for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}*/
		
		System.out.println("----------");
		int cnt = 1;
		for (int line = 1; line <=5; line++) {  // 5번반복 
			for (int i = 1; i <= cnt; i++ ) { 
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}	

		/*    화면에 삼각형 모양 출력 , 별 하나씩 찍기 
		*		1라인 : * 1개 + 줄바꿈
		**		2라인 : * 2개 + 줄바꿈  
		***		3라인 : * 3개 + 줄바꿈
		*****	4라인 : * 4개 + 줄바꿈
		******  5라인 : * 5개 + 줄바꿈
		-------------------- */
		System.out.println("---------------");  
		//외부 반복문 반복인자 값을 내부 반복문에 연동 사용하는 경우 
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {  // line 반복 인자와 내부 반복 인자의 수가 같아서 별도의 변수 선언 없이 가능 but,종속적
				System.out.print("*");
			}
			System.out.println();
			}
		
		System.out.println("--------복습하기---------");
		/*    화면에 삼각형 모양 출력 , 별 하나씩 찍기 
		*		1라인 : * 1개 + 줄바꿈
		**		2라인 : * 2개 + 줄바꿈  
		***		3라인 : * 3개 + 줄바꿈
		*****	4라인 : * 4개 + 줄바꿈
		******  5라인 : * 5개 + 줄바꿈
		-------------------- */
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i <= line; i++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		
		}

}
