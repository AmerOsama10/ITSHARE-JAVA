package com.itshare;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {

	
	public void service(HttpServletRequest request , HttpServletResponse response) {
		
		String num1= request.getParameter("num1");
		int n1= Integer.parseInt(num1);
		
		String num2= request.getParameter("num2");
		int n2= Integer.parseInt(num2);
		
		
		int sum = n1+n2;
		
		
		System.out.println(sum);
	}
	
}
