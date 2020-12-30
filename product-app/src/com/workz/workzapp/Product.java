package com.workz.workzapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/prod")
public class Product extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		
		String productName=  req.getParameter("pn");
		String productQuantity=req.getParameter("proq");
		
		//  adding the data into request scope
		req.setAttribute("prodName", productName);
		req.setAttribute("prodQuantity", productQuantity);
		
		//Servlet Chaining 
		RequestDispatcher dispatcher = req.getRequestDispatcher("cart");
		dispatcher.include(req, resp);
		
		double totalSum = (double) req.getAttribute("total");
		
		if(totalSum <= 0) {
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Product Details" + productName + "Price = " + totalSum);
		printWriter.close();
		}
		
	}

}
