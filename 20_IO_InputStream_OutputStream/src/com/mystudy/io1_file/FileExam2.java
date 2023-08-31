package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException { 
		// 파일명 : temp.txt - 파일명,확장자(명)
		File file1 = new File("temp.txt"); //  ./temp.txt    ./-> 현재위치
		// File 객체 생성 시 파일의 존재여부와 관계없이 객체 생성 가능
		System.out.println("file1 : " + file1);
		
		// 상대경로 방식(. : 현재위치, ..: 상위디렉토리(=폴더))
		// 현재 위치에 따라서 경로가 다르게 변함
		File file2 = new File("./file/temp.txt"); //상위폴더 file 
		System.out.println("file2 : " + file2);
		
		// 절대주소 방식 : Root 디렉토리로부터 전체 경로를 표시를 표시(위치 불변)
		File file3 = new File("c:\\temp\\aaa\\temp.txt"); //  \ : 자바에서 제어문자임
		System.out.println("file3 : " + file3);
		
		
		System.out.println("------- getAbsolutePath() : 절대경로명 -------");
		System.out.println("file1의 절대경로 : "+ file1.getAbsolutePath()); 
		System.out.println("file2의 절대경로 : "+ file2.getAbsolutePath()); 
		System.out.println("file3의 절대경로 : "+ file3.getAbsolutePath()); 
		
		System.out.println("------- getCanonicalPath() : 정식경로명 -------");
		System.out.println("file1 정식경로 : " + file1.getCanonicalPath());
		System.out.println("file2 정식경로 : " + file2.getCanonicalPath());
		System.out.println("file3 정식경로 : " + file3.getCanonicalPath());
		
		System.out.println("------- exists() : 파일의 물리적 존재 여부 -------");
		System.out.println("file1.exists() : " + file1.exists()); 
		System.out.println("file2.exists() : " + file2.exists());
		System.out.println("file3.exists() : " + file3.exists());
		
		System.out.println("------- File 속성정보 -------");
		System.out.println("file1.length() : " + file1.length()); // 파일 사이즈
		System.out.println("file1.canRead() : " + file1.canRead()); // 
		System.out.println("file1.canWrite() : " + file1.canWrite());
		System.out.println("file1.canExecute() : " + file1.canExecute());
		
		System.out.println("------- getName() : 파일명만 -------");
		System.out.println("file1.getName() : " + file1.getName()); 
		System.out.println("file2.getName() : " + file2.getName()); 
		System.out.println("file3.getName() : " + file3.getName()); 
		
		
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		System.out.println("file1.isFile() : " + file1.isFile());
		
		System.out.println("==================================");
		File file4 = new File("file/temp4.txt");
		System.out.println("file4.delete() : " + file4.delete()); // 물리적으로 없으면 삭제 false
		
		file4.createNewFile(); // 새로 만들기 , 없으면 만들고 있으면 안 만듦
		
		System.out.println("==================================");
		File file5 = new File("temp1/temp2/temp3");
		System.out.println("file5.mkdir() : " + file5.mkdir()); // 디렉토리 만들기
		
	}

}
