package com.mystudy.scanner5_guess;

import java.util.Scanner;

public class GuessNumberGameMain {
	
	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		
		GuessNumberGame game = new GuessNumberGame();
		game.gameStart();
		
		System.out.println("--- main() 끝 ---");

	}

}

