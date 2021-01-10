package com.sahan.csd62and64;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sahan.csd62and64.config.DbConnection;


public class SigninServlet extends HttpServlet {
	
	HttpSession httpSession;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		httpSession = req.getSession();
		
		
		String email = req.getParameter("u-email");
		String password = req.getParameter("u-pass");
		
		//System.out.println("EMAIL : "+email);
		
		int result = loginChecker(email, password);
		
		if(result == 1) {
			//redirect to home.
			res.sendRedirect("index.jsp");
			
		} else {
			//handle the error.
			res.sendRedirect("signin.jsp");
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
				
				httpSession.setAttribute("u_id", rs.getObject("id"));
				httpSession.setAttribute("u_email", rs.getObject("email"));
				httpSession.setAttribute("u_name", rs.getObject("name"));
				httpSession.setAttribute("u_role", rs.getObject("role"));
				httpSession.setAttribute("logged_in", true);
				
			}
			
			if(rows > 0) {
				return 1; // Successfully logged in.
			} else {
				httpSession.setAttribute("logged_in", false);
				return 0; // Invalid login.
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			httpSession.setAttribute("logged_in", false);
			return -1; // Error has occurred.
		}
		
		
	}
	

}
