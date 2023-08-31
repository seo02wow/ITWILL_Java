package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. 사용할 객체 생성
			//fis = new FileInputStream(file); //File 객체 주입(전달받아) 사용
			fis = new FileInputStream("file/test01.txt"); // 파일 문자열을 바로 넣어도 됨
			
			//2. 객체 사용 
			/* 방법 1.
			int readValue = fis.read(); //바이트 단위로 읽음 , 파일의 끝 EOF 는 -1
			while(readValue != -1) { // 읽을 값이 있을 때까지 반복
				System.out.println("read() 값 : " + readValue);
				System.out.println(">> char : " + (char)readValue); // 문자 타입으로 형변환
				readValue = fis.read(); // 무한반복 되지 않도록 
			}
			*/
			
			//방법 2.
			int readValue;
			while ((readValue = fis.read()) != -1) { // 읽은 값이 저장. -1이 아닐 때까지
				System.out.println("read() 값 : " + readValue);
				System.out.println(">> char : " + (char)readValue);
			}
 			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 닫기(close)
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
				}
			}
			
			System.out.println("----- mian() 끝 -----"); 
			
			
		}

	}

}
