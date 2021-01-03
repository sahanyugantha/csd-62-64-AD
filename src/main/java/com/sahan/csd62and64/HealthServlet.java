package com.sahan.csd62and64;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HealthServlet extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String weight = request.getParameter("u-weight");
		String height = request.getParameter("u-height");
		
	
		double bmi_rd = calculateBmi(weight, height);
		System.out.println("BMI : "+bmi_rd);
				

		PrintWriter writer = response.getWriter();
		writer.write("<h3>Weight is "+weight+"</h3>");
		writer.write("<h3>Height is "+height+"</h3>");
		writer.write("<h3>Your BMI is "+bmi_rd+"</h3>");
		
		
	}
	
	
	public double calculateBmi(String weight, String height) {
		
		//Converting values to Double data type.
		Double w = Double.parseDouble(weight); // Weight in kilograms.
		Double h_cm = Double.parseDouble(height); // Height in centimeters.
		
		//Convert height in to meters.
		Double h = h_cm/100;
		
		//Calculate the BMI.
		Double bmi = w/(h*h);
		
		//Rounding the BMI value to two decimal places.
		Double bmi_r = Double.parseDouble(String.valueOf(Math.round(bmi*100)));
		Double bmi_rd = bmi_r/100;
		
		return bmi_rd;
		
	}
	
	
	/**
	 * This method is just for learn Unit testing.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addTwoNumbers(int num1, int num2) {
		
		int total = num1 + num2;
		
		return total;
		
	}


}
