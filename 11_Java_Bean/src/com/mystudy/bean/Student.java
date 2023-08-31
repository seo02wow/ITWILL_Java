package com.mystudy.bean;


/*
■ 자바빈(Java Bean)
  - 멤버변수(property)의 접근제어자는 private
  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
  - get/set 메소드는 public
  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
 */

//public class Student extends Object { 
// public 모든 곳에서 접근 가능  , public 없이 바로 class는 해당 클래스에서만 사용 가능
class Student { // extends Object 생략하면 컴파일러가 자동 삽입 
	private String name; // 멤버변수 private 선언 -> 해당 클래스 내부에서만 가능 
	private int kor; 
	private int eng; 
	private int math; 
	private int tot; 
	private double avg; 
	
	// === 생성자 ===
	public Student() {
		// super : 부모클래스 객체(인스턴스)
		// super() : 부모클래스 객체(인스턴스)의 기본 생성자 호출;
		super(); // 생략 시, 컴파일러가 자동 삽입하여 처리함
	}
	
	public Student(String name) {
		super(); // 생성자호출 // 생략 시, 컴파일러가 자동 삽입하여 처리함
		this.name = name; // 현재객체
	}
	
	public Student(String name, int kor, int eng, int math) {
		// 현재객체(인스턴스)의 생성자 호출 
		// 생성자의 재사용 
		this(name); // 생성자 코드 중 맨 처음 작성되어 실행되어야 함
		//this.name = name;
		this.kor = kor; // 현재객체 
		this.eng = eng;
		this.math = math;
	}
	
	
	
	//==  메소드 작성 영역 == 
	// 외부에서 사용할 수 있도록 메소드 제공 (일반적으로 public으로)
	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터 저장하기 위한 set 메소드
	// 명칭(호칭) : set 메소드,setter,set property(속성값 설정-쓰기)
	public void  setName(String name) {
		this.name = name; 
	}
	
	// 외부에서 데이터를 읽어가기 위한 get 메소드
	// 명칭(호칭) : get메소드, getter, get property(속성값 읽기)
	public String getName() {
		return name;
	}
	
	// kor : setter-데이터 설정, getter-데이터 읽어감
	public void setKor(int kor) {
		// 적절한 데이터 여부 확인 
		if (kor >= 0 && kor <= 100) {
		this.kor = kor; // 범위에 해당하면 저장
		} else {
			System.out.println("[예외발생] 국어 0~100값이 아님");
		}
	}
	
	public int getKor() {
		return kor;
	}
	
	// (실습) eng, math : setters, getters 작성
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	// (실습) printData() 메소드
	public void printData() { //외부에서도 사용 가능하게 public
		System.out.println
		(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg );
	}
	
	private void copmuteTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
}
