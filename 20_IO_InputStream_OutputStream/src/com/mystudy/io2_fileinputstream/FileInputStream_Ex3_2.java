package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		//(실습) Ex3_1 파일을 반복문으로 변경
		
		FileInputStream fis = null;
		try {
			//0. 사용할 파일객체 생성
			File file = new File("file/test01.txt");
			//1. 파일을 읽어서 작업할 객체 생성(FileInputStream)
			fis = new FileInputStream(file);
			
			//2. 객체를 사용하여 파일데이터 읽어서 화면 출력
			//	(byte[] 사용,반복 처리)
			byte[] bytes = new byte[10];
			int readCnt; 
			/*
			while (true) {
			readCnt= fis.read(bytes); 
			if(readCnt == -1) break;
			//System.out.println("readCnt : " + readCnt);
			//System.out.println("bytes : " + Arrays.toString(bytes));
			for (int i =0; i < readCnt; i++) {
				System.out.print((char)bytes[i]);
			}
			}
			*/
			
			while (((readCnt= fis.read(bytes)) != -1)) {
				if(readCnt == -1) break;
				//System.out.println("readCnt : " + readCnt);
				//System.out.println("bytes : " + Arrays.toString(bytes));
				for (int i =0; i < readCnt; i++) {
					System.out.print((char)bytes[i]);
				}
			}
			
			
			// (bytes) -> 읽은 데이터를 배열에 저장 
			// readCnt = 실제로 읽은 데이터의 길이, 한 번에 읽을 수 있는 맥스 값은 배열의 길이
			
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 닫기(close)
			try {
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 // close를 반복문에 넣으면 예외처리가 되기 전에 
			//close 되기 때문에 finally 절에 담아주어야 함
		}
		
		
		
		
		

	}

}
