package com.itshare.test.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SessionServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("sessionName","Servlet" );
		session.setAttribute("className","Java Development" );
		session.setAttribute("number",106 );

		
		
		List<String> products = new ArrayList<>();
		products.add("skin care");
		products.add("hair care");
		session.setAttribute("products",products );

		
		String sessionName=(String) session.getAttribute("sessionName");
		String className= (String)session.getAttribute("className");
		int number =(int)session.getAttribute("number");
		List<String> listProduct=(List<String>)session.getAttribute("products");
		
		
		System.out.println(sessionName);
		System.out.println(className);
		System.out.println(number);
		System.out.println(listProduct.toString());
	}

}
