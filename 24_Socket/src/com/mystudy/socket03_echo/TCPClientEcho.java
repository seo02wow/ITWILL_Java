package com.mystudy.socket03_echo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) throws UnknownHostException {
		// (실습) 클라이언트(사용자) : 쓰고, 읽기
		// 서버 접속 후 메시지를 1번 보내고, - PrintWriter
		// 서버에서 보내온 메시지를 받기 - BufferedReader
		// OutputStream--> PrintWriter
		// InputStream --> InputStreamReader --> BufferedReader
		// (추가) 보내는 메시지를 Scanner 사용, 화면에서 직접 입력하여 처리
		//----------------------------------------------------
		System.out.println("=== 클라이언트 시작 ===");
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		System.out.println("현재 컴퓨터 IP : " + InetAddress.getLocalHost());
		try {
			while (true) {
			// 소켓을 통해 서버 접속 
			socket = new Socket("localhost", 10000); // 서버 위치, 서비스 되고 있는 포트번호
			System.out.println(">> 서버 접속 성공");
			
			// PrintWriter 메세지 보내기 
			pw = new PrintWriter(socket.getOutputStream());
			// BufferedReader 서버에서 보내온 메시지 받기 
			br = new BufferedReader(new InputStreamReader (socket.getInputStream()));
			
			// Scanner 생성 
			Scanner scan = new Scanner(System.in);
			System.out.print(":: 보낼 메세지 입력 : ");
			String sendMsg = scan.nextLine();
			pw.println(sendMsg); // 보내기 
			pw.flush(); // 버퍼에 있는 데이터 강제 출력
			
			String msg1 = br.readLine();
			System.out.println("[내가 보낸 메세지] : " + msg1);
			
			String msg2 = br.readLine();
			System.out.println("[클라이언트 - 받은 메세지] : " + msg2);
			
			pw.close();
			
			if(sendMsg.equals("종료")) {break;}
			
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {}
			try {
				if (socket != null) socket.close();
			} catch (IOException e) {}
		}
		

	}

}
