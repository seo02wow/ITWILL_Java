package com.mystudy.socket02_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLine {

	public static void main(String[] args) {
		// 서버쪽 : 클라이언트가 보낸 메시지를 1번 읽어서 화면에 출력
		// BufferedReader 사용해서 라인단위로 읽기(1번 읽기)
		// InputStream --> InputStreamReader --> BufferedReader
		//---------------------------------------------------
		System.out.println(">> 서버 시작 -------------");
		ServerSocket server = null;
		
		try {
			// 1. ServerSocket 객체 생성 - 서비스할 포트번호(port)  지정
			server = new ServerSocket(10000);
			System.out.println(">> 서버(ServerSocket) 대기 중");
			System.out.println("서버/IP : " + InetAddress.getLocalHost());
			
			// 2. 서버소켓 대기 중 접속한 Socket과 통신할 수 있는 Socket 객체 생성
			Socket socket = server.accept(); 
			System.out.println(">> 클라이언트 접속됨 : " + socket);
			
			// 3. Socket으로부터 InputStream 혹은 OutputStream 객체 (Socket에 있는 걸 가져다 사용)
			OutputStream os = socket.getOutputStream();
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is); // 버퍼 생성 위해 리더타입으로 변경
			BufferedReader br = new BufferedReader(isr);
			
			// 4. 받을 메시지가 있으면 읽기 
			String msg = br.readLine();
			System.out.println("[서버-받은메시지] : " + msg);
			
			// 5. 보낼 메시지가 있으면 보내기 
			// 구현 안 함
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if (server != null) {
					server.close();
					System.out.println("close> ServerSocket close 완료");
					}
				} catch (IOException e) {}
			}
		
		System.out.println(">>> 서버 종료");
	}

}
