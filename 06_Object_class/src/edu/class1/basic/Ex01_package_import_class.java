/* package 선언문 : Java 파일의 첫번째에 위치한 유의미한 코드이며 한 번만 작성
 * 자바 (class) 파일의 위치를 나타냄 (경로)
 * 일반적으로 회사의 도메인명을 반대로 적용해서 사용 
 * 작성 예) com.naver.project   com.itwill.mystudy
 */
package edu.class1.basic;

//import 선언문 : 선택 항목이지만 일반적으로 사용
//(java.lang 패키지 이외의 패키지에 있는 타입 사용시,사용)
import java.util.Scanner;
//import java.util.*; // 대표문자 (wild card) *  사용 

// class 선언문 :패키지 선언문은 선택, class는 필수 항복
public class Ex01_package_import_class {

	public static void main(String[] args) {
		//java.util.Scanner scan = new java.util.Scanner(System.in); 
		// 자바- 유틸에 있는 스캐너 , 스캐너 - 클래스, () - 생성자 
		Scanner scan = new Scanner(System.in); // scan -> 객체
		System.out.print(">> 인사말 : ");
		
		String hello = scan.nextLine();
		System.out.println("인사말출력 : " + hello);
		
		
		
	}

}
