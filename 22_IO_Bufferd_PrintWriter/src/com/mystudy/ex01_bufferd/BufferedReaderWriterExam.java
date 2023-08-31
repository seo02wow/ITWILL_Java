package com.mystudy.ex01_bufferd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		/* 
		버퍼(buffer) : 기능이 구현되어 있는 클래스 
		버퍼는 데이터를 (메모리상에) 저장하는 공간 
		BufferdReader,BufferdWriter
		File --> FileReader(를) --> BufferdReader(에 주입)
		--------------------------------------*/
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedrReader = null;
		BufferedWriter bufferedrWriter = null;
		
		
		try {
			// 파일로부터 읽기 위한 객체 생성
			File inFile = new File ("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			bufferedrReader = new BufferedReader(fr); //버퍼 기능 + 파일 읽기 기능
			
			// 파일에 쓰기 위한 객체 생성 
			File outFile = new File ("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bufferedrWriter = new BufferedWriter(fw); //버퍼 기능 + 파일 쓰기 기능
			
			// 파일에 먼저 쓰기 
			bufferedrWriter.write("안녕하세요. 자바 공부 중입니다.\n"); // \n 줄바꿈
			bufferedrWriter.write("Hello Java!");
			bufferedrWriter.newLine(); // 줄바꿈 처리
			bufferedrWriter.write("재밌나요 ?");
			bufferedrWriter.newLine();
			bufferedrWriter.write("--------------------------");
			bufferedrWriter.newLine();
			
			bufferedrWriter.flush();
			
			// 파일로부터 읽고, 파일에 쓰기 (버퍼기능 이용) 
			// 파일에서 읽기(한 번 읽기)
			String str = bufferedrReader.readLine(); // 줄단위(한 줄) 읽기, 스트링 타입
			System.out.println("readLine() 읽은 값 : " + str);
			
			// 파일에 쓰기 (한 번 쓰기)
			bufferedrWriter.write(str); // 문자열 출력 , inFile --> OutFile
			bufferedrWriter.newLine(); // 줄바꿈
			
			// 남은 데이터 모두 읽고 쓰기 	
			str = bufferedrReader.readLine();
			while(str != null) {
				bufferedrWriter.write(str);
				str = bufferedrReader.readLine();// EOS(End Of Stream) : null 리턴
				if (str != null) { // 읽은값이 있으면 줄바꿈 해라
				bufferedrWriter.newLine();
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 최종 객체만 클로즈 하면 나머지도 클로즈 됨 
			try {
				if(bufferedrReader != null) bufferedrReader.close();
			} catch (IOException e) {}
		}
		try {
			if(bufferedrWriter != null) bufferedrWriter.close();
		} catch (IOException e) {}
		
		System.out.println("--- main() 끝 ---");
	}

}
