package com.sahan.csd62and64;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignoutServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession httpSession = req.getSession();
		
		httpSession.removeAttribute("u_id");
		httpSession.removeAttribute("u_name");
		httpSession.removeAttribute("u_email");
		httpSession.removeAttribute("u_role");
		
		httpSession.setAttribute("logged_in", false);
		httpSession.removeAttribute("logged_in");
		
		res.sendRedirect("signin.jsp");
		
		
	}

}
