
public class Ex07_float {

	public static void main(String[] args) {
		// 실수형 float : 4byte (1.4ㄸ-45 ~ 3.4028235E38) 
		// 소수점 이하 데이터 저장 가능
		// 표시형식 : 숫자.숫자 + F/f
		// 단, 소수점 이하 5~6자리까지만 정확도 보장 
		float f1 = 3.4F;
		float f2 = 3.2f;
		System.out.println("float 3.4f : " + f1);
		System.out.println("float 3.2f : " + f2);
		System.out.println("3.4f + 3.2f : " + (3.4f + 3.2f)); 
		
		System.out.println("---- float 최소값/최대값 ---");
		System.out.println("float 최소값 : " + Float.MIN_VALUE);
		System.out.println("float 최대값 : " + Float.MAX_VALUE);

	}

}
