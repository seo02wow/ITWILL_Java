package com.mystudy.poly2_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("--- 메소드 오버로딩(overloading) 방식 ---");
		sound_overloading(cat);
		sound_overloading(dog);
		sound_overloading(pig);
		
		System.out.println("=== 메소드 오버라이딩(overriding) 사용 ===");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);
		
		System.out.println("--- instanceof 사용 타입 확인하는 패턴 ---");
		
		
	}
	
	
	// instanceof 사용 타입 확인하는 패턴
	static void sound_instanceof(Animal animal) {
		if(animal instanceof Cat) {
			((Cat)animal).sound();
		} else if(animal instanceof Dog) {
			((Dog)animal).sound();
		}
		
	
		
	}
	
	// ★ 메소드 오버라이딩(overriding) 사용 
	// : 하위 클래스에 동일한 메소드가 있으면 하위 타입의 메소드 실행 ? 
	static void sound(Animal animal) {
		animal.sound();
	}

	// 메소드 오버로딩(overloading) 방식 ================
	static void sound_overloading(Cat cat) {
		cat.sound();
	}
	
	static void sound_overloading(Dog dog) {
		dog.sound();
	}
	
	static void sound_overloading(Pig pig) {
		pig.sound();
	}
	
	
	
}
