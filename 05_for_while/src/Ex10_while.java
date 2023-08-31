
public class Ex10_while {

	public static void main(String[] args) {
		// 반복문 : while, do ~ while
		/* while 반복문 사용 형태 
		반복인자의 선언 및 초기값 설정;
		while (실행조건식 - 비교/논리 ) {
			반복인자값 증감설정 (선택적); 
			실행문(들);
			반복인자값 증감설정 (선택적); 
		}
		------------------------*/
		//1~10까지 화면 출력 
		System.out.println("-----for문-----");
		for (int i = 1; i <= 10; i++) {   // 반복 횟수 파악 가능 
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("-------while문--------");
		int i = 1;
		while (i <=10) {
			System.out.print(i + " ");
			i++;               // 비교 - 실행 - 1증가 : for문 방식 
		}
		System.out.println();
		System.out.println("---------------------");
		
		i = 0;
		while (i < 10) {
			i++;     // 증감식을 먼저 사용할 수도 있음 
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		System.out.println("=========break, continue==========="); 
		// for문에서는 무한루프 되는 경우 X,while에서는 무한루프 되는 경우 多
		// break : 현재 실행 중인 반복문을 종료하고 빠져나감 
		// while을 통한 무한반복
		int num = 1;
		while (true) {
			System.out.println(num);  // num 무한반복 
			if (num >= 10) break; // 반복중단 
			num++;
		}
		
		System.out.println("-----continue------");
		// continue가 증감식 이전에 작성되면 무한반복 될 수 있음 
		
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; // 증감식이 continue문 앞에 위치하도록 
			System.out.println(num);
		}
		
		System.out.println("-----for continue------");
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue;
			System.out.println(m);	
		}
		
		System.out.println("------do ~ while-----------");
		// 1 ~ 10 까지 출력 
		// 실행문이 먼저 옴 
		/* 
		do {
		반복인자값 증감설정 (선택적); 
			실행문(들);
			반복인자값 증감설정 (선택적);
		}
		
		 */
		num = 1;
		do {
			System.out.println("do ~ while : " + num);
			num++;   // 실행문이 무조건 한 번은 실행됨 , 비교처리가 나중에 되기 때문에 
		} while (num <= 10);
		
		System.out.println("----내부 반복문에서 break 처리시 ---");
		for (int out = 1; out <= 3; out++) { // 3번 반복
			System.out.println(" : : out : " + out);
			
			for (int in = 1; in <= 5; in++) { // 외부 1번 반복 시 내부 5번 반복
				System.out.println("out : " + out + ",in : " + in);
				if (out ==2) break; // 3일 때는 실행 
				// : 현재 처리 중인 반복문 중단하고 빠져나감, 내부 반복문만 종료  
			}
			System.out.println("------------"); // 3번 반복
		}
		
		System.out.println("===== 중첩 반복문 모두 중단하기 =====");
		// 중첩 반복문을 모두 종료해야 하는 경우에는 위치 지정 break문을 사용 
		// 라벨 지정
		outFor : for (int out = 1; out <= 3; out++) {
			System.out.println(" : : out : " + out);
			
			for (int in = 1; in <= 5; in++) { // 외부 1번 반복 시 내부 5번 반복
				System.out.println("out : " + out + ",in : " + in);
				if (out ==2) break outFor; // 외부반복문 중단처리  
			}
			System.out.println("------------"); 
		}
		System.out.println(">>>> 프로그램 끝");
		
		

	}

}
