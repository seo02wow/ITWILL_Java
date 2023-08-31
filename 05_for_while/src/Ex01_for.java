
public class Ex01_for {

	public static void main(String[] args) {
		// 제어문 중 반복문(for,while, do ~ while)
		// for (초기값 설정 ; 실행-조건O/종결-조건X ; 증감설정) {} //비교값에 대한 증감 처리
		// for(;;) {} // 필수가 아님 반복처리 방식에 따라 달라짐, 무한반복->굳이 for문 쓰지 않음
		//-----------------------------------------------------
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("-------------");
		
		// for (초기값 설정 ; 실행-조건O/종결-조건X ; 증감설정) - 암기
		
		for (int i = 1; i <= 3; i++) { // 1 초기값 설정 - 최초 1번만 실행됨 , 2 실행, 3 {}, 4 증감
			System.out.println("*"); // 3번 반복
		}
		System.out.println("------------");
		
		// 별(*) 찍기 10번 반복 
		for (int i = 1; i <= 10; i++) {
			System.out.println("*");
		}
		System.out.println("---------------");
		for (int i = 1; i <= 10; i += 2) { // for문 내 사용된 값은 반복문에서만 사용되고 끝
			System.out.println("*");
		}
		
		//=========================================
		System.out.println("=====1부터 5까지 출력 =====");
		// 문자가 달라서 반복문으로 사용 불가 , 반복문은 똑같은 문장이 와야함. 즉, 달라지는 부분을 변수처리
		System.out.println(1);
		System.out.println(2);		
		System.out.println(3);		
		System.out.println(4);
		System.out.println(5);
		System.out.println("------------------------");
		
		/* 같은 문장이 반복
		int num = 1; 
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		*/
		
		int num = 1;
		for (int i = 1; i<=5; i++) {
			System.out.println(num);
			num++;
		}
		System.out.println("-----------");
		num = 1;
		for (int i = 1; i<=5; i++) {
			System.out.println(num++);
		}
		System.out.println("------------");
		// 반복인자 값을 사용해서 출력
		for (int i = 1; i<=5; i++) { // i가 1씩 5까지 증가,출력하고자 하는 값이 i랑 같아서 가능.꼭 이렇게 해야하는 거 아님
			System.out.println(i);
		}
	
	}

}
