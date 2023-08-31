package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용하여 파일 복사 
		// 원본파일 : file/test_char.txt
		// 대상파일(출력할 파일) : file/test_char_copy.txt
		// 처리 : 원본파일에서 읽고, 대상파일에 쓰기/저장 (문자단위 처리)
		//--------------------------------------------------
		System.out.println("--- main() 시작 ---");
		//0. 사용할 파일 객체(File) 생성
		File fileIn = new File("file/test_char.txt");
		File fileOut = new File("file/test_char_copy.txt");
		
		//1-1. FileReader, FileWriter 객체를 저장할 변수 선언 
		
		FileReader fr = null; 
		FileWriter fw = null;
		char[] chars = new char[0];
		
		try {
			//1-2. FileReader, FileWriter 객체 생성
			fr = new FileReader(fileIn);
			fw = new FileWriter(fileOut);
			
			//2. 반복작업(원본 파일에서 읽고, 대상 파일에 쓰기 반복)
			int readValue = fr.read();
			while (readValue != -1) { 
				fw.write((char)readValue);
				System.out.print((char)readValue);
				readValue = fr.read(); 
			}
			fw.flush(); // 버퍼에 있는 데이터 강제 출력처리
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3. 사용객체 닫기(close)
				if (fr != null ) fr.close();
			} catch (IOException e) {}
			if (fw != null )
				try {
					fw.close();
				} catch (IOException e) {}
		}
		

		
		
		System.out.println("--- main() 끝 ---");
		
	}

}
