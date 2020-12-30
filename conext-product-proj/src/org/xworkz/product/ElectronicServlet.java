package org.xworkz.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		 ServletContext context = getServletContext();
		String offerMsg = context.getInitParameter("offerMsg");
		String offerPrice = context.getInitParameter("offerPrice");
		    
		/*
		 * context.setAttribute("om",offerMsg); context.setAttribute("op", offerPrice);
		 */
		
PrintWriter printWriter = resp.getWriter();
   printWriter.println("<html>"
   		+ "<h1>" + offerMsg + offerPrice +"</h1>"
		
		  + "<form action='elect'>" + "<body bgcolor='cyan'>" +
		  "Name : <input type='text' name='nm'>" + "Id : <input type='text' name='id'>"
		  + "noOfProducts: <input type='text' name='nop'>" +
		  "Price : <input type='text' name='pr'>" +
		  "<input type='submit' value='SUBMIT'>" + "</form>" + "</body>" + "</html>"
		 );
		
	}

}
