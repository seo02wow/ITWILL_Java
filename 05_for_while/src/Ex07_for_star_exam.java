
public class Ex07_for_star_exam {

	public static void main(String[] args) {
		/* 문제1----------------
		***** : * 5번 + 줄바꿈 
		****  : * 4번
		***   : * 3번
		**    : * 2번
		* 	  : * 1번
		-----------------------*/
		System.out.println("---문제1---");
		int cnt1 = 5;
		for (int line = 1; line <= 5;  line++) {
			for (int i = 1; i <= cnt1;  i++) {
				System.out.print("*");
			} 
			System.out.println();
			cnt1--;
		}
		
		System.out.println("-----------------------");
		int starCnt = 5;
		for (int line = 1; line<= 5; line++) {
			for (int i = 1; i <= starCnt; i++) {
				System.out.print("*");
			} 
			System.out.println();
			starCnt--;
		}
		
		
		System.out.println("---문제2---");
		/* 문제2----------------
		    * : 빈칸 4 + * 1개 + 줄바꿈
		   ** : 빈칸 3 + * 2개 + 줄바꿈 
		  *** : 빈칸 2 + * 3개 + 줄바꿈
		 **** : 빈칸 1 + * 4개 + 줄바꿈
		***** : 빈칸 0 + * 5개 + 줄바꿈
		-----------------------*/
		System.out.println("------세분화--------");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.println();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("**");
		System.out.println();
		
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("***");
		System.out.println();
		
		System.out.print(" ");
		System.out.print("****");
		System.out.println();
		
		System.out.print("");
		System.out.print("*****");
		
		System.out.println();
		System.out.println("----------------");
		
		// 첫번째 줄
		for (int space =1; space <= 4; space++) {
			System.out.print(" ");
		}
		for ( int star = 1; star <= 1; star++) {
			System.out.print("*");
		}	
		System.out.println();
		
		// 두번째 줄 
		for (int space =1; space <= 3; space++) {
			System.out.print(" ");
		}
		for ( int star = 1; star <= 2; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		// 세번째 줄 
		for (int space =1; space <= 2; space++) {
			System.out.print(" ");
		}
		for ( int star = 1; star <= 3; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("----------------");
		int spaceCnt = 4;
		int starCnt2 = 1;
		for ( int line = 1; line <= 5; line++) {
			for (int space =1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			for ( int star = 1; star <= starCnt2; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt--;
			starCnt2++;
		}	
		
		System.out.println("---문제3---");
		/* 문제3----------------
		 ***** : 빈칸 0 + * 5개 + 줄바꿈
		  **** : 빈칸 1 + * 4개 + 줄바꿈
		   *** : 빈칸 2 + * 3개 + 줄바꿈
		    ** : 빈칸 3 + * 2개 + 줄바꿈
		     * : 빈칸 4 + * 1개 + 줄바꿈
		 ---------------------*/
		
		System.out.println("--------세분화----------");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.println();
		
		// 1
		for(int space = 1; space <= 0; space++) {
			System.out.print(" ");  // 실행 x
		}	
		for(int star = 1; star <= 5; star++) {
			System.out.print("*");
		} 
		System.out.println();
		// 2
		for(int space = 1; space <= 1; space++) {
			System.out.print(" ");
		}	
		for(int star = 1; star <= 4; star++) {
			System.out.print("*");
		} 
		System.out.println();
		// 3
		for(int space = 1; space <= 2; space++) {
			System.out.print(" ");
		}
		for(int star = 1; star <= 3; star++) {
			System.out.print("*");
		} 
		
		System.out.println();	
		// 4
		for(int space = 1; space <= 3; space++) {
			System.out.print(" ");
		}
		for(int star = 1; star <= 2; star++) {
			System.out.print("*");
		} 
		
		System.out.println();		
		// 5
		for(int space = 1; space <= 4; space++) {
			System.out.print(" ");
		}
		for(int star = 1; star <= 1; star++) {
			System.out.print("*");
		} 
		
		System.out.println();		
		
		System.out.println("-----최종-------");
			
		// 
		int space3 = 0;
		int star3 = 5;
		for(int line = 1; line <= 5; line++) {
			for(int space = 1; space <= space3; space++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= star3; star++) {
				System.out.print("*");
			} 
			
			System.out.println();
			space3++;
			star3--;
		
		}
		
		System.out.println("-----문제4-------");
		/* 문제4----------------
		1		  : (1 + 빈칸1) + 줄바꿈
		1 2		  : (1 + 빈칸1) + (2 + 빈칸1) + 줄바꿈
		1 2 3	  : (1 + 빈칸1) + (2 + 빈칸1) + (3 + 빈칸1) + 줄바꿈
		1 2 3 4	  : (1 + 빈칸1) + (2 + 빈칸1) + (3 + 빈칸1) + (4 + 빈칸1) + 줄바꿈
		 ---------------------*/
		System.out.println("------세분화-----");
		//1
		System.out.print("1");
		System.out.print(" ");
		System.out.println();
		//2
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.println();
		//3
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.print("3");
		System.out.print(" ");
		System.out.println();		
		//4
		System.out.print("1");
		System.out.print(" ");
		System.out.print("2");
		System.out.print(" ");
		System.out.print("3");
		System.out.print(" ");
		System.out.print("4");
		System.out.print(" ");
		System.out.println();	
		
		System.out.println("------------------");
		//1
		for (int num = 1; num <=1; num++) {
			System.out.print(num);
		}
		for (int space = 1; space <= 1; space++) {
			System.out.print(" ");
		}
		System.out.println();
		
		//2
		for (int num = 1; num <=2; num++) {
			System.out.print(num);
			for (int space = 1; space <= 1; space++) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		//3
		for (int num = 1; num <=3; num++) {
			System.out.print(num);
			for (int space = 1; space <= 1; space++) {
				System.out.print(" ");
			}
		}
		System.out.println();
				
		System.out.println("-------최종----------");
		int num1 = 1;
		int space4 = 1;
		for (int line = 1; line <=4; line++) {
			for (int num = 1; num <= num1; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
			num1++;
		}
		
		System.out.println("----------문제5-------------");
		
		/* 문제5----------------
		1 
		2 3
		4 5 6
		7 8 9 10 
		 ---------------------*/
		
		System.out.println("======");
		int cnt = 1;
		int num5 = 1;
		for(int line = 1; line <= 4; line++) {
			for (int i = 1; i <=cnt; i++) {
				System.out.print(num5++ + " ");
			}
			System.out.println();
			cnt++;
		}
		
	

	}

}
