package com.itshare.test.project.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginCookie")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String username =(String)request.getParameter("username");
		
		// 1- save in session
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		
		Cookie usernameCookie=new Cookie("username", username);
		usernameCookie.setMaxAge(3600);
		response.addCookie(usernameCookie);
		
		response.sendRedirect("cookie/welcome.jsp");
	}

}
