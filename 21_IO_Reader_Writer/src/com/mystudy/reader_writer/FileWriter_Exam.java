package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Exam {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		// FileWriter : 파일에 문자단위 출력(쓰기)
		File file = new File("file/test_char_out.txt");
		
		FileWriter fw = null;
		
		try {
			//1. 객체(인스턴스) 생성
			fw = new FileWriter(file);
			
			//2. 객체 사용(파일 문자단위 출력)
			fw.write('대');
			fw.write("한");
			fw.write("민국");
			
			fw.flush(); // 버퍼에 있는 데이터를 강제로 Output 처리 
			
			fw.write("Hello Java !!"); //flush에 저장되어 있음 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 close
			try {
				if(fw != null) fw.close(); 
				// 버퍼에 있는 데이터를 출력하고 종료
				// close 없으면 데이터 입력 X 
			} catch (IOException e) {}
		}
		System.out.println("--- main() 끝 ---");
	}

}
