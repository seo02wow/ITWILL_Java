package com.mystudy.io4_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// 파일복사 : 원본 파일에서 읽고, 대상 파일에 쓰기 
		//------------------------------------------
		//File inputFile = new File("file/img102.jpg"); // 읽어들이기 위한 원본파일
		//File outputFile = new File("file/img102_copy.jpg"); // 복사본
		
		File inputFile = new File("src/com/mystudy/io4_filecopy/FileCopy.java"); // 원본파일
		File outputFile = new File("file/FileCopy_backup.java");// 복사본
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//1. 파일을 읽고.쓰기 위한 객체 생성 (FileInputStream,FileOutputStream)
			fis = new FileInputStream(inputFile); //읽기
			fos = new FileOutputStream(outputFile); //쓰기
			System.out.println(">>> 파일복사 시작");
			//2. 1byte 읽고, 1byte 쓰기 - read(), write(데이터) 반복처리
			while (true) {
				int readValue = fis.read();
				if (readValue == -1) break;
				fos.write(readValue);
				
			}
			System.out.println(">>> 파일복사 끝");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기 
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {}
			}
			if (fos != null) {
			try {
				fos.close();
			} catch (IOException e) {
			}
			}
		}
		
		
	}

}
