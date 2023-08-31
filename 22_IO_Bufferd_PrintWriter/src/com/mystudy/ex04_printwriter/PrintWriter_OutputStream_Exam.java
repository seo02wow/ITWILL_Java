package com.mystudy.ex04_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriter_OutputStream_Exam {

	public static void main(String[] args) {
		// File --> FileOutputStream --> PrintWriter  
		FileOutputStream fos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream(new File("file/pw_out.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("안녕하세요");
			pw.write("점심시간 후 오후\n");
			pw.print("지금은 자바 공부 중");
			pw.print("..졸림");
			pw.println();
			pw.println("잠깨");
			pw.println("끝나기 4시간 남음ㅜ");
			
			pw.printf("%10s %10s %10s %n", "이제","20분","남았다."); 
			// %10s - 10칸 , %n - 줄바꿈
			pw.printf("%50s%n", "김서영"); // 기본 우측정렬 , 좌측정렬은 %-50s
			pw.printf("%-50s%n", "김서영");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
		}

	}

}
