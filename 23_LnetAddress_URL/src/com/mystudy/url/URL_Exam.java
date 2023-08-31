package com.mystudy.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		// 프로토콜://호스트(서버):포트번호/경로(패스)?질의(query- 데이터를 전달하고 사용하는 질의..?)
		// https://section.blog.naver.com/BlogHome.naver?directoryNo=0&currentPage=1&groupId=0

		URL url = new URL("http", "mystudy.com", 8080,
				"/aaa/bbb/index.jsp?id=hong&password=1234#content"); // 프로토콜,호스트,포트,폴더 디렉토리
		// http://mystudy.com:8080//aaa/bbb/index.jsp?id=hong&password=1234#content
		System.out.println("url : " + url);
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host); //서버명
		System.out.println("포트번호(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(path) : " + path); //자원의 위치
		System.out.println("쿼리-질문,요청(query) : " + query);
		System.out.println("참조(ref) : " + ref);
		
		System.out.println("--------------------------------");
		url = new URL("https://section.blog.naver.com/BlogHome.naver?directoryNo=0&currentPage=1&groupId=0");
		System.out.println("url : " + url);
		
		protocol = url.getProtocol();
		host = url.getHost();
		port = url.getPort();
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host); //서버명
		System.out.println("포트번호(port) : " + port);
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		System.out.println("경로-패스(path) : " + path); //자원의 위치
		System.out.println("쿼리-질문,요청(query) : " + query);
		System.out.println("참조(ref) : " + ref);
		
	}

}
