package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerEcho {

	public static void main(String[] args) {
		// (실습) 서버쪽 : 읽고, 쓰기 
		// 클라이언트가 보내온 메시지를 1번 받고(읽기) - BufferedReader
		// 받은 메시지를 클라이언트에게 다시 보내기 - PrintWriter
		// InputStream --> InputStreamReader --> BufferedReader
		// OutputStream--> PrintWriter
		//----------------------------------------------------
		
		System.out.println("=== 서버 시작 ===");
		ServerSocket server = null; 
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			// 서버 소켓 생성 
			server = new ServerSocket(10000); // 포트번호
			System.out.println(">> 서버 소켓 대기 중");
			System.out.println(">> IP주소/포트번호 : " 
					+ InetAddress.getLocalHost().getHostAddress()
					+ " / " + server.getLocalPort());
										
			
			// 서버 소켓 대기 
			Socket socket = server.accept(); // 클라이언트와 접속할 소켓 생성 
			System.out.println(">> 클라이언트 접속");
			System.out.println(">> 접속 정보 : " + socket.getInetAddress());
			
			// BufferedReader 클라이언트가 보낸 메시지 1번 읽기 (입력)
			br = new BufferedReader(new InputStreamReader (socket.getInputStream())); // 최종 사용
			
			// PrintWriter 받은 메시지 다시 보내기 (출력)-----------------------
			pw = new PrintWriter(socket.getOutputStream()); 
			
			
			System.out.println("=== 채팅 ===");
			String msg = br.readLine();
			System.out.println("[서버 - 받은메세지] : " + msg); 
			pw.println(msg);  // 받은 메세지 보내기
			
			// Scanner 생성 
			Scanner scan = new Scanner(System.in);
			System.out.print(":: 보낼 메세지 입력 : ");
			String sendMsg = scan.nextLine();
			
			pw.println(sendMsg); // 메세지 보내기
			pw.flush(); // 버퍼에 있는 데이터 강제 출력(전송)
			
			pw.close();
			
			
			
			
			
			
		// 예외 처리 -------------------------------------------------	
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
				System.out.println("close> PrintWriter");
			}
			try {
				if (br != null) {
					br.close();
					System.out.println("close> BufferedReader");
				}
			} catch (IOException e) {}
			try {
				if (server != null) {
					server.close();
					System.out.println("close> ServerSocket");
				}
			} catch (IOException e) {}
		}
		

		
	}

	
}
