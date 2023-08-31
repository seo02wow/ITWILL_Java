
public class Ex04_break_continue {

	public static void main(String[] args) {
		// 반복 제어문 : break, continue 반복문에서 쓰일 수도 안 쓰일 수도 있음(옵션)
		// break : 중단, 반복을 중단하고 현재 실행 중인 반복문 빠져나감
		// continue : 이어서 다음 반복을 처리
		//----------------------------------------
		
		// 1 부터 10까지 출력하되, 8은 출력하지 말 것
		for (int i = 1; i <= 10; i++ ) {
			if (i != 8) { // if문 긍정문으로 쓰는 게 이해하기 쉬움
				System.out.print(i + " "); //코드를 비워두기보다 부정적인 비교처리하는 게 나음 
			}
		}
		System.out.println(); // 줄바꿈
		System.out.println("----- continue 사용 -----");
		// 1 부터 10까지 출력하되 8은 출력하지 말고 다음 반복 처리
		for (int i = 1; i <= 10; i++) {
			if (i == 8) continue; // continue 만나면 다음 반복 진행함 다음 문장(sop) 건너뜀
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("\n================"); //   \n : 새로 줄바꿈 new line
		// 1 ~ 10 출력 중 8을 만나면 처리 중단
		for (int i = 1; i <= 10; i++) {
			if (i == 8) break;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">> 반복문 종료 후");
		
	}

}
