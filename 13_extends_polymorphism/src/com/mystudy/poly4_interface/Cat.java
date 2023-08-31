package com.mystudy.poly4_interface;

public class Cat extends AbstractAnimal {
	
	public Cat() {
		super("고양이");
	}

	@Override
	public void sound() {
		// System.out.println(getName() + ">> 야옹 ~ 야옹 ~"); // 해당 클래스에 getName이 있다면 
		System.out.println(super.getName() + ">> 야옹 ~ 야옹 ~"); // 부모
	}
	
	public void test() {
		System.out.println(">> 테스트 ");
	}
	

	
}
