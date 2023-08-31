package com.mystudy.ex03_singjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		SungjukVO stu = new SungjukVO("홍길동", 100, 90, 80, 0, 0);
		stu.setKor(999);
		
		
		System.out.println("--- setEng() 처리 ---");
		try {
			stu.setEng(958);
		} catch (JumsuOutOfVauleException e) { // 작은 범위 먼저 - 구체적으로 잡을 수 있음 
			System.out.println(e.getMessage()
					+ " : 0 ~ 100 범위의 값으로 다시 입력하세요.");
		} catch (SungjukProcessException e) { // 큰 범위는 나중에 작성 / 큰범위 -> 작은 범위 쓰면 범위가 겹쳐서 오류남
			System.out.println("[예외발생] 성적처리 중 예외발생");
		}
		
		
		
		System.out.println("str : " + stu); // stu.toString  
	
		System.out.println("--- main() 끝 ---");

	}

}
