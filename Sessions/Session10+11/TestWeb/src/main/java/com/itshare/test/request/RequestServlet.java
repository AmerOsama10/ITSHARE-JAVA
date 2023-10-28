package com.itshare.test.request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RequestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setAttribute("sessionName","Servlet" );
		request.setAttribute("className","Java Development" );
		request.setAttribute("number",106 );

		
		
		List<String> products = new ArrayList<>();
		products.add("skin care");
		products.add("hair care");
		request.setAttribute("products",products );

		
		String sessionName=(String) request.getAttribute("sessionName");
		String className= (String)request.getAttribute("className");
		int number =(int)request.getAttribute("number");
		List<String> listProduct=(List<String>)request.getAttribute("products");
		
		
		System.out.println(sessionName);
		System.out.println(className);
		System.out.println(number);
		System.out.println(listProduct.toString());
		
		
	
	}




}
