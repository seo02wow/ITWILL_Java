
public class Ex01_plusplus {

	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// 사용형태 : ++변수명, 변수명++, --변수명, 변수명--
		// ++ : 값을 1 증가 시킴
		// -- : 값을 1 감소 시킴
		// ++num; -> num = num +1;
		int num = 100;
		System.out.println("num : " + num);
		num = num + 1;
		System.out.println("num = num + 1 : " + num);
		System.out.println("----------");
		
		//++,-- 연산자 단독사용 시 항상 1증가 또는 감소
		num = 100;
		System.out.println("num : " + num);
		++num; // num = num + 1;
		System.out.println("++num : " + num);
		System.out.println("-----");
		
		num = 100;
		System.out.println("num : " + num);
		num++; // num = num + 1;
		System.out.println("num++ : " + num);
		System.out.println("-----");
		
		System.out.println("==========");
		// ++, -- 연산자가 연산식에 사용되는 경우
		// ++변수명 : 변수값이 1 증가된 상태에서 연산에 사용됨
		// 변수명++ : 변수값이 연산에 사용되고 그 후에 변수값이 1증가됨
		int sum = 0;
		num = 100;
		System.out.println("num : " + num);
		//sum = num + 5;
		//num = num + 1;
		sum = num++ + 5; // 선 num값이 sum에 저장 후 ++ 증가처리됨 즉 sum 값에 영향 무
		System.out.println("sum = num++ : " + sum);
		System.out.println("num : " + num);
		System.out.println("----");
		
		num = 100;
		System.out.println("num : " + num);
		//num = num + 1; // num++; 또는 ++num (단독으로 쓰일 때는 동일한 값)
		//sum = num + 5;
		sum = ++num + 5; // sum의 값이 101임. 선 num 1증가 후 sum 저장
		
		System.out.println("sum = ++num : " + sum);
		System.out.println("num : " + num);
		System.out.println("----");
		
		
		
		

	}

}
