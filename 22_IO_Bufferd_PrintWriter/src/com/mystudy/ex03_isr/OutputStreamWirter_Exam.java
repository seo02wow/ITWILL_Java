package com.mystudy.ex03_isr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWirter_Exam {

	public static void main(String[] args) {
		File file = new File("file/test_osw.txt");
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		// (실습) OutputStreamWirter 객체 생성해서 텍스트 출력하기 
		// Hello Java ~ 안녕 ! 
		
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos); // 문자 단위 출력 
			
			fos.write('A'); //정상출력
			fos.write('대'); // 출력 안 됨
			
			osw.write("Hello Java ~ ");
			osw.write("안녕");
			osw.write('!');
			osw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			if (osw != null) osw.close();
			} catch (IOException e) {}
		}
		

	}

}
