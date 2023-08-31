package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		// (실습) FileReader_Exam1 내용을 반복문으로 변경 처리 
		
		File file = new File("file/test_char.txt");
		
		FileReader fr = null;
		
		try {
			//1. 객체 생성 
			fr = new FileReader(file);
			
			//2. 객체를 통해 반복문 처리 
			int readChar = fr.read();
			// 변수에 저장을 안 하면 변수마다 값이 다 다름 
			while ((readChar = fr.read()) != -1) {
				System.out.println(readChar + " : " + (char)readChar);
			}
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(">>[예외] 파일없음");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(">>[예외] 파일을 읽지 못함");
		} finally {
				try {
				if (fr != null) fr.close();
				} catch (IOException e) {}
		}
		

	}

}
