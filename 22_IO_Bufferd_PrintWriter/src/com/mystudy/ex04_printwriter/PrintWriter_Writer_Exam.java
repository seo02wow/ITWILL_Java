package com.mystudy.ex04_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Writer_Exam {

	public static void main(String[] args) {
		// File --> FileOutputStream --> PrintWriter  
		PrintWriter pw = null;
		
		try {
			//방식1 : 생성된 객체를 변수에 모두 저장(재사용해야 되는 경우)
			File file = new File("file/pw_out2.txt");
			FileWriter fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			
			
			//방식2 : 최종 사용객체만 저장해서 한 번에 처리 
			pw = new PrintWriter(new FileWriter("file/pw_out2.txt"));
			
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
		}

	}

}
