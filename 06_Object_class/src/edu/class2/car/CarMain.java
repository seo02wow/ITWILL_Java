package edu.class2.car;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스를 이용해서 Car 타입의 객체(인스턴스)를 생성해서 사용 \
		// 클래스 사용 -> 
		Car car1 = new Car();  
		// 새로 만들겠다. 기본 생성자 호출 - Car 클래스에 있어서 가능
		car1.color = "검정";  // 흰색 -> 검정
		// car1.CAR_LENGTH = 400; // 컴파일 오류 -> final 변수는 치환 불가 
		
		System.out.println("자동차명 : " + car1.name);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상명 : " + car1.color);
		System.out.println("차량길이 : " + car1.CAR_LENGTH);
		System.out.println("차량폭 : " + car1.CAR_WIDTH);
		System.out.println("에어백유무 : " + car1.hasAirbag);
		System.out.println("-----------");
		
		car1.name = "처음 가져본 차"; // 마이카->처음 가져본 차로 변경 
		System.out.println("자동차명 : " + car1.name);
		car1.hasAirbag = true;
		System.out.println("에어백유무 : " + car1.hasAirbag);
		
		System.out.println("==== 기능 테스트 ====");
		car1.run();
		car1.stop();
		car1.back();
		// car1.speedUp(); -> 만들지 않아서 안 나옴 
		
		System.out.println("====== car2 생성 사용 ======");
		// Car car2 = new Car();
		Car car2 = new Car("패밀리카","제네시스","검정"); // 생성자 호출-> 변경
		car2.dispData(); 
		
		car2.run();
		car2.stop();
		car2.back();
		
	}

}
