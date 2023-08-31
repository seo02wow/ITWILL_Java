package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. 파일을 읽기 위한 객체 생성(File 객체 입력(주입) 받음)
			fis = new FileInputStream(file); 
			
			
			//2. 객체 사용(파일 읽고 데이터를 화면 출력)
			byte[] bytes = new byte[10];
			System.out.println("bytes: " + Arrays.toString(bytes));
			// read(byte[] b) :  바이트 배열을 전달 받는 메소드 
			int readCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + readCnt);
			System.out.println("bytes : " + Arrays.toString(bytes));
			for(int i = 0; i < readCnt; i++) {
				System.out.println("int : " + bytes[i] 
						+ ", char : " + (char)bytes[i]);
			}
			System.out.println("-------------------------------");
			readCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + readCnt); 
			// 유의미한 데이터가 존재할 땐 읽으나, 더 이상 읽을 데이터가 없으면 저장된 데이터 읽음 
			System.out.println("bytes : " + Arrays.toString(bytes));
			for(int i = 0; i < readCnt; i++) {
				System.out.println("int : " + bytes[i] 
						+ ", char : " + (char)bytes[i]);
			}
			System.out.println("-------------------------------");
			readCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + readCnt); 
			System.out.println("bytes : " + Arrays.toString(bytes));
			for(int i = 0; i < readCnt; i++) {
				System.out.println("int : " + bytes[i] 
						+ ", char : " + (char)bytes[i]);
			}
			System.out.println("-------------------------------");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용 객체 닫기(close)
			
		}
		
	}

}
