package com.mystudy.bean_vo;

// Java Bean 형태의 클래스 작성 
// VO(Value Object) : 값(데이터)을 저장하기 위한 클래스 (객체) - Oxxx, OxxxVO, OxxxVo
// DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체) - 전송에 의미부여하면 DTO
//    Oxxx, OxxxDTO, OxxxDto
public class StudentVO {
	// 필드(변수) 선언 ----------------------------
	// 성명 - name : String 
	// 국어 - kor : int
	// 영어 - eng : int
	// 수학 - math : int
	// 총점 - tot : int
	// 평균 - avg : double
	
	
	// private : 클래스 내에서만 사용 가능 -> 메소드(가 public이니까) setters,getters 이용 ! 
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	// 생성자 작성 --------------------------------
	// 생성자 - 성명, 국어, 영어, 수학 점수를 입력 받는 생성자 
	
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		copmuteTotAvg();
	}
	
	
	
	// 메소드 작성 --------------------------------
	// setters, getters 모두 작성 

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.println("[예외발생] 국어 0~100의 값이 아님");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
		} else {
		System.out.println("[예외발생] 영어 0~100의 값이 아님");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;	
		} else {
			System.out.println("[예외발생] 수학 0~100의 값이 아님");
		}
		
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
	
	
	
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor 
				+ ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}

	private void copmuteTotAvg() { //  이건 왜 private 쓰지
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}

	public void printData () {
		System.out.println
		(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
	}
	

	
	
	
	
	
	
	
	
	
}
