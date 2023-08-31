package com.mystudy.poly1_extends;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car 클래스 ===");
		Car car = new Car();
		car.type = "자동차(Car)";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance 클래스 ===");
		Ambulance am = new Ambulance();
		am.type = "구급차(Ambulance)"; // 부모 클래스의 메소드 사용 
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine 클래스 ===");
		FireEngine fe = new FireEngine();
		fe.type = "소방차(FireEngine)";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.siren();
		fe.siren();
		fe.water();
		
		System.out.println("==== 타입확인 ===");
		Car carTemp = car; // Car <-- Car
		carTemp = am; // Car <-- Ambulance  (상 <-- 하)
		carTemp = fe; // Car <-- FireEngine (상 <-- 하)
		System.out.println("자동차 타입 : " + carTemp.type);
		System.out.println("--- 타입확인(instanceof) ---");
		if (carTemp instanceof Object) {
			System.out.println("--- Object 타입이다");
		}
		if (carTemp instanceof Car) {
			System.out.println("--- Car 타입이다");
			carTemp.drive();
			carTemp.stop();
		}
		if (carTemp instanceof Ambulance) {
			System.out.println("--- Ambulance 타입이다");
			carTemp.drive();
			carTemp.stop();
			((Ambulance)carTemp).siren();
		}	
			
		if (carTemp instanceof FireEngine) {
			System.out.println("--- FireEngine 타입이다");
			carTemp.drive();
			carTemp.stop();
			((FireEngine)carTemp).siren();
			((FireEngine)carTemp).water(); // 임시형변환
		}
		System.out.println("=====================");
		System.out.println("--- Car 타입객체 전달시(타입체크) ---");
		typecheck(car); // Car
		
		System.out.println("--- Ambulance 타입객체 전달시(타입체크) ---");
		typecheck(am); // Ambulance - 상속관계(부모 Car) 때문에 가능
		
		System.out.println("--- FireEngine 타입객체 전달시(타입체크) ---");
		typecheck(fe); // FireEngine - 상속관계(부모 Car) 때문에 가능
		
		System.out.println("--- main() 끝 ---");
			
	}
	
	static void typecheck(Car car) {
		System.out.println(":::Car 타입입니다");
		car.drive();
		car.stop();
		// 확인할 객체 instanceof 비교할 클래스명 (타입명)
		if (car instanceof Ambulance) {
			System.out.println("--- Ambulance 타입이다");
			((Ambulance)car).siren();
		}	
		if (car instanceof FireEngine) {
			System.out.println("--- FireEngine 타입이다");
			((FireEngine)car).siren();
			((FireEngine)car).water();
		}
		
	}
		
}
