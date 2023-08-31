package com.mystudy.ex03_singjuk;

public class JumsuOutOfVauleException extends SungjukProcessException {

	public JumsuOutOfVauleException() {
		super("점수범위(0~100)를 벗어난 값입니다.");
	}
	
	public JumsuOutOfVauleException(String msg) {
		super(msg);
	}
	
	
}
