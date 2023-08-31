
public class Ex02_if_else {

	public static void main(String[] args) {
		// if 문 세 종류
		// if (조건) {}
		// if (조건) {} else {} 
		// if (조건) {} else if () {} else if () {} .... ekse {}
		//------------------------------------------------------
		int num1 = 70;
		int num2 = 50;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		//1. if (조건) {}
		if (num1 > num2) {
			System.out.println("num1 > num2 : " + (num1 > num2));
			System.out.println("num1이 num2보다 크다");
		} // true일 때 실행되는 문장 {실행문}
		if (num1 <= num2) {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		System.out.println(">> if () 끝");
		System.out.println("------------------");
		
		//2.if (조건) {} else {}
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		System.out.println(">> if ~ else 끝");
		System.out.println("------------------");
		
		//3.if (조건) {} else if () {} else if () {} .... ekse {}
		num1 = 10;
		num2 = 50;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else if (num1 == num2) {
			System.out.println("num1은 num2와 같다");
		} else { // 작은 경우 
			System.out.println("num1이 num2보다 작다");
		}

		System.out.println(">> if ~ else if ~ else 끝");
		System.out.println("=========================");
		
		// 점수 평가 결과 출력 : 수, 우, 미, 양, 가
		/*
		90~100 : 수
		80~89 : 우
		70~79 : 미
		60~69 : 양
		0~59 : 가
		-------------------*/
		// if (조건) {} else if () {} else if () {} .... ekse {}
		System.out.println("----- 성적처리 -----");
		// 데이터 입력 
		String name = "홍길동";
		int jumsu = 100;
		String result2 = "평가안됨";
		
		// 데이터 처리 
		if (jumsu < 0 || jumsu > 100 ) {
			result2 = "잘못된 점수";
		} else if (jumsu >= 90) {
			result2 = "수";
		} else if (jumsu >= 80) {
			result2 = "우";
		} else if (jumsu >= 70) {
			result2 = "미";
		} else if (jumsu >= 60) {
			result2 = "양";
		} else {
			result2 = "가";
		} 
		
		// 데이터 출력
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + jumsu); 
		System.out.println(":: 평가결과 : " + result2);
		System.out.println("----- 성적처리 끝 -----");
		
		//=====================
		/*  if문 내에 중첩해서 if문 얼마든지 사용 가능 
		if () {
		    if  () {
		         if () {
		         }  else  {
		         }
		    }
		}
		 */
	}

}
