package com.xworkz.workzapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sr")
public class LinkServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=     req.getParameter("nm");
	resp.setContentType("text/html");
	//work client   side
	resp.sendRedirect("https://www.google.com/#q="+name);
	}

}
