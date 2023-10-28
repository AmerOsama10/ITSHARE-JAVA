package com.itshare.test.param;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet(
		urlPatterns = {"/ParamServlet"},
		initParams  = {
				@WebInitParam (name="name",value="ahmed"), 
				@WebInitParam (name="session",value="java")
})
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ParamServlet() {
        super();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parameter1= getInitParameter("name");
		String parameter2= getInitParameter("session");
		
		PrintWriter out = response.getWriter();
		out.println(parameter1 +"    "+parameter2);


	}

}

