package com.mystudy.ex05_data;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream_Exam {

	public static void main(String[] args) {
		// DataInputStream, DataOutputStream
		// 기본 데이터 타입의 데이터를 읽고, 쓰기
		//-----------------------------------
		// 파일에 기본데이터 타입 값를 쓰고, 읽어서 화면 출력 
		
		File file = new File("file/data_io_stream.txt");
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			//파일에 쓰고, 저장된 데이터 읽어서 화면 출력 
			FileOutputStream fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//기본 데이터 타입 값을 파일에 출력(쓰기)
			dos.writeInt(12000);
			dos.writeBoolean(true);
			dos.writeByte(127);
			dos.writeDouble(Math.PI);
			dos.writeUTF("대한민국");
			dos.writeUTF("Hello Java !");
			
			System.out.println(">> 파일에 출력 완료");
			
			//파일에 저장된 데이터를 읽어서 화면 출력
			dis = new DataInputStream(new FileInputStream(file));
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) dos.close();
			} catch (IOException e) {}
		}

	}

}
