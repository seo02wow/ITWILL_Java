package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputStream2_List {

	public static void main(String[] args) {
		// (실습) StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고 
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 데이터를 화면 출력
		// 사용할 파일 명 : file/object_io_list.data
		//------------------------------------------------
		// VO 데이터 생성 --> List에 저장 --> List를 파일에 출력 
		// 파일에서 List 읽기 --> List에 있는 VO 가져다 화면 출력
		
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("김유신", 95, 85, 75);
		
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		list.add(stu1);
		list.add(stu2);
		
		// 파일에 List 쓰고, 파일에서 List 읽어와서 담긴 데이터 화면 출력 
		System.out.println("=== List 파일에 출력(Output) ===");
		
		File file = new File("file/object_io_list.data");
		
	
		
		try (FileOutputStream fos = new FileOutputStream (file);
			ObjectOutputStream oos = new ObjectOutputStream (fos);) { 
			
			// 파일에 List 쓰기
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
		//----------------------------------------
		System.out.println("=== 파일에서 list 읽기(Input) ===");
		
	
		try (FileInputStream fis= new FileInputStream (file);
			ObjectInputStream ois= new ObjectInputStream (fis);) {
			// 파일에서 읽기 
			// 리스트로 사용하기 위해 형변환 Object --> ArrayList
			ArrayList<StudentVO> readlist = (ArrayList<StudentVO>)(ois.readObject());  
			
			for(StudentVO vo : readlist) {
				System.out.println(vo.getName() + " "
						+ vo.getTot() + " "
						+ vo.getAvg() + " ");
			}
			
			System.out.println("----------------");
			
			for (int i = 0; i < readlist.size(); i++) {
				StudentVO vo = readlist.get(i);
				System.out.println(vo.getName() + " "
						+ vo.getTot() + " "
						+ vo.getAvg() + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
	}

}
