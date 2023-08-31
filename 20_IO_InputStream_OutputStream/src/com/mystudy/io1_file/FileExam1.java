package com.mystudy.io1_file;

import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		// File 클래스 
		String seperator = File.separator; // 파일경로 구분자
		// C:\MyStudy\10_Java
		System.out.println("File.separator : " + seperator);
		
		char separatorChar = File.separatorChar;
		System.out.println("File.separatorChar : " + separatorChar);
		
		String pathSeparator = File.pathSeparator; // 파일의 경로 구분자
		System.out.println("File.pathSeparator : " + pathSeparator);
		System.out.println("------------------------");
		
		File[] listRoots = File.listRoots(); // File 타입의 배열
		for(File file : listRoots) {
			System.out.println(file);
		}
		
	}

}
