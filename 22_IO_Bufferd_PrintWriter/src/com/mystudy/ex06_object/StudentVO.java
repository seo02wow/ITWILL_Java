package com.mystudy.ex06_object;

import java.io.Serializable;

/* 직렬화(Serialization) / 역직렬화(Deserialization)
 - 직렬화 : JVM 메모리에 있는 객체를 바이트스트림으로 변환하는 작업 
 - 역직렬화 : 바이트스트림 데이터를 자바 객체로 변환하는 작업
 ------------------------------------------------------
 데이터 전송을 위해서는 직렬화 처리가 가능해야 하는데, Serializable 형식만 가능
 Serializable 인터페이스를 구현하면 된다.
 데이터 직렬화 처리 시 제외할 데이터는 
 - transient 처리
 transient 처리해도 전달되는 데이터 : static, final 처리된 데이터
*/

public class StudentVO implements Comparable<StudentVO>, Serializable {
	private static final long serialVersionUID = -167764646621250164L;
	//만들어진 데이터가 사용될 때 serialVersionUID가 다르면 오류 발생
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//transient : 데이터 전송시 값 전달 제외 (직렬화 제외)
	transient private String phoneNo; 
	
	//생성자 마음대로 만들기
	public StudentVO() {}

	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}

	public StudentVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	//메소드 마음대로 만들기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int vo() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		computeTotAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computeTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computeTotAvg();
	}

	public int getTot() {
		return tot;
	}

//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}

	

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int compareTo(StudentVO o) {
		return this.name.compareTo(o.name);
	}	
	
	
	
}