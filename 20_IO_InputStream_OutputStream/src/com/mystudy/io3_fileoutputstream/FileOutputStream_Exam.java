package com.mystudy.io3_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStream_Exam {

	public static void main(String[] args) {
		// FileOutputStream : byte 단위로 파일에 저장(출력,쓰기)
		File file = new File("file/test_out_01.txt");
		
		FileOutputStream fos = null;
		
		try {
			//1. 사용할 객체 생성
			fos = new FileOutputStream(file); // 내용 새로 작성하고 쓰기
			//fos = new FileOutputStream(file,false); 
			// append : true - 내용 추가 모드 , false - 내용 추가 X 
			
			//2. 객체 사용해서 작업처리 
			fos.write('H');
			fos.write('E');
			fos.write('L');
			fos.write('L');
			fos.write('O');
			
			byte[] bytes = "Hello Java!!".getBytes(); // 바이트 배열에 담음
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			fos.write(bytes); 
			fos.write('\n'); // 줄바꿈 
			
			//				시작위치  사용갯수
			fos.write(bytes, 0, bytes.length); // (배열의 ~부터 ~까지)
			fos.write('\n');
			
			fos.write(bytes, 6, 5); //6번 인덱스부터 5개
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
