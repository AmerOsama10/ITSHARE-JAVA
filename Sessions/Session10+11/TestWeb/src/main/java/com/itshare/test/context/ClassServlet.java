package com.itshare.test.context;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet("/ClassServlet")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ClassServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	ServletContext context = getServletContext();
	
	context.setAttribute("sessionName","Servlet" );
	context.setAttribute("className","Java Development" );
	context.setAttribute("number",106 );

	
	
	List<String> products = new ArrayList<>();
	products.add("skin care");
	products.add("hair care");
	context.setAttribute("products",products );

	
	String sessionName=(String) context.getAttribute("sessionName");
	String className= (String)context.getAttribute("className");
	int number =(int)context.getAttribute("number");
	List<String> listProduct=(List<String>)context.getAttribute("products");
	
	
	System.out.println(sessionName);
	System.out.println(className);
	System.out.println(number);
	System.out.println(listProduct.toString());
	
	
	response.sendRedirect("ClassContext.jsp");

	

	}

}

