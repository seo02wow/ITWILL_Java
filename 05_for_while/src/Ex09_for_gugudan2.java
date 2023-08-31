
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단 2~9단 출력
		2*1=2	3*1=3	...	9*1=9
		2*2=4	3*2=6		9*2=19
		2*3=6	3*3=9		9*3=27
		...
		2*9=19	3*9=27	...	9*9=81
		========================== */  // 
		
		System.out.println("\t" + "*"); // \t -> tqp 간격 
		
		System.out.println("------ 구구단 출력 ------");
				
		 for (int gop= 1; gop <= 9; gop++) {   // 외부 변수 i로 많이 함
			for(int dan = 2; dan<= 9; dan++) { // 반복 인자 j로 많이 함
				System.out.print(dan + "*" + gop + "=" + (dan*gop) + "\t");	
			} 
			System.out.println();
		 }
		 
		 
		
		
		
	}

}
