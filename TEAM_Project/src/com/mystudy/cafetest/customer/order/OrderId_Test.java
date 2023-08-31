package com.mystudy.cafetest.customer.order;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class OrderId_Test {
	public static void main(String[] args) {
	
		
		Pattern pattern = Pattern.compile("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
		
		
		String num = "010-1234-5678";
		
		 Matcher matcher = pattern.matcher(num);
		 
		 System.out.println(matcher.find());
		
		System.out.println(num);
		
		System.out.println(num.length());
		
		System.out.println(num.indexOf("-"));
		
		int num1 = Integer.parseInt(num.substring(0, 2));
		System.out.println(num1);
		
		
		
		
	}

}
