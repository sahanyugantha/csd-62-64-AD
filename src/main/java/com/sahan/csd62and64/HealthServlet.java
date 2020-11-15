package com.sahan.csd62and64;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HealthServlet extends HttpServlet{
	
	
	//this will be executed when you make GET request to the HealthServlet
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		String weight = req.getParameter("u-weight").toString();
		String height = req.getParameter("u-height").toString();
		
		PrintWriter printWriter = res.getWriter();
		printWriter.write("<h3> Weight : "+weight+"</h3>");
		printWriter.write("<h3> Height : "+height+"</h3>");
		
		System.out.println("Yes Its working...");
		
	}

}
