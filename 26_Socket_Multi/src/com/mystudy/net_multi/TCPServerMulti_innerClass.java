package com.mystudy.net_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// 다중 접속을 처리할 수 있는 서버(서버에서 읽기만 - 독립적인 쓰레드)
public class TCPServerMulti_innerClass {

	public static void main(String[] args) {
		System.out.println("==== main() 시작 ====");
		new TCPServerMulti_innerClass();
		
		
		
		System.out.println("==== main() 끝 ====");

	}
	
	public TCPServerMulti_innerClass() {
		serverStart();
	}

	private void serverStart() {
		// 서버 소켓을 만들고, 클라이언트 접속 처리를 반복한다.
		ServerSocket server = null;
		
		try {
			System.out.println(">> 서버 소켓 객체 생성");
			server = new ServerSocket(10000);
			
			// 다중 접속을 위한 반복처리 
			while (true) {
				System.out.println(">> 접속 대기 중" 
						+ InetAddress.getLocalHost().getHostAddress()
						+ " : " + server.getLocalPort()); // IP / Port
				Socket socket = server.accept();
				System.out.println("사용자가 접속되었습니다."
						+ socket.getRemoteSocketAddress()); // IP
				// 접속된 클라이언트(사용자)에 대한 처리 - 쓰레드 생성(읽기 전용)
				System.out.println(":: 접속유저 읽기 전용 쓰레드 생성");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}

		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	// ServerReceiver : 클라이언트에서 보내온 메세지 수신 전용 
	private class ServerReceiver extends Thread {
		Socket socket;

		public ServerReceiver(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() { // 실제 작업
			// 클라이언트에서 보낸 메세지를 읽어서 화면(콘솔)에 표시
			System.out.println(">>> 읽기 전용 쓰레드 시작 -----------");
			
			BufferedReader br = null;
			
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(">> 읽기 시작");
				
				while(true) {
					// 읽고->대기->읽고 -> 대기 반복 
					String msg = br.readLine();
					if (msg == null || "exit".equalsIgnoreCase(msg)) {
						// 갑자기 중단되거나 사용자가 중단한다고 했을 때 주단
						break;
					}
					System.out.println(">>" + msg);
				}
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[예외 발생]" + e.getMessage());
			} finally {
				System.out.println(socket.getInetAddress().getHostAddress() + " > 클라이언트 종료");
				try {
					if (br != null) br.close();
				} catch (IOException e) {}
			}
		}
		
	}

}
