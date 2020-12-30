package com.dev.devapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sess")
public class FirstSession extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		String name = req.getParameter("nm");
		//  getting the ref of HttpSession
		     HttpSession   hs=  req.getSession();
		     // set of age for Session
		     hs.setMaxInactiveInterval(15);
		     //add session object into the scope
		     hs.setAttribute("nam", name);
		     
		     PrintWriter printWriter= resp.getWriter();
		     printWriter.print("<form action ='ss'>");
		     printWriter.print("<input type ='submit' value='NextServlet'>");
		     printWriter.print("</form>");
		     printWriter.close();
		     
            
	}

}
