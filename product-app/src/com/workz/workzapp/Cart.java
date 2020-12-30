package com.workz.workzapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cart")
public class Cart extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		// getting the data from the request scope
		String proName = (String) req.getAttribute("prodName");
		String proQuantity = (String) req.getAttribute("prodQuantity");
		
		
		int qty = Integer.parseInt(proQuantity);

		double price = 19000.00;
		double totalSum = (qty * price);
		
		req.setAttribute("total",totalSum);

	}

}
