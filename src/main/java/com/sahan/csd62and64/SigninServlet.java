package com.sahan.csd62and64;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahan.csd62and64.config.DbConnection;


public class SigninServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String email = req.getParameter("u-email");
		String password = req.getParameter("u-pass");
		
		//System.out.println("EMAIL : "+email);
		
		int result = loginChecker(email, password);
		
		if(result == 1) {
			//redirect to home.
		} else {
			//handle the error.
		}		
		
		
	}
	
	
	public int loginChecker(String email, String password){
		
		try {
			
			Connection conn = DbConnection.getConnection();
			//Prepare the query
			String sql = "SELECT * FROM `tbl_user` WHERE `email`=? AND `password`=?;";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
			
			int rows = 0;
			while(rs.next()) {
				rows++;
			}
			
			if(rows > 0) {
				return 1; // Successfully logged in.
			} else {
				return 0; // Invalid login.
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // Error has occurred.
		}
		
		
	}
	

}
