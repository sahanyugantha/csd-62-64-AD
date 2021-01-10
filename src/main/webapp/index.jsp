
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.sahan.csd62and64.config.DbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<jsp:include page="views/header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-sm-10 offset-sm-1">
			<h2 class="my-title">Welcome to CSD 62 & 64 official website</h2>
			
			
			<%
				HttpSession httpSession = request.getSession();
				
				if(httpSession.getAttribute("logged_in") != null && (Boolean)httpSession.getAttribute("logged_in") == true){
					
					%>
					
						<table class="table table-dark table-striped">
						  <thead>
						    <tr>
						      <th scope="col"></th>
						      <th scope="col">#</th>
						      <th scope="col">Name</th>
						      <th scope="col">Quantity</th>
						      <th scope="col">Unit Price</th>
						    </tr>
						  </thead>
						  <tbody>
						  
						  	<%
						  	try{
						  		String sql = "SELECT * FROM tbl_item ORDER BY `name`";
						  		Connection conn = DbConnection.getConnection();
						  	
						  		PreparedStatement stmt = conn.prepareStatement(sql);
						  		
						  		ResultSet rs = stmt.executeQuery();
						  		
						  		int rows = 0;
						  		
						  		while(rs.next()){
						  			
						  			rows++;
						  			
						  			%>
						  				<tr>
						  				
						  					<td><img class="item-img" alt="n/a" src="img/<% out.print(rs.getString("img_url")); %>"></td>
						  					<td><% out.print(rs.getString("id")); %></td>
						  					<td><% out.print(rs.getString("name")); %></td>
						  					<td><% out.print(rs.getString("qty")); %></td>
						  					<td><% out.print(rs.getString("unit_price")); %></td>
						  										  				
						  				</tr>
						  			
						  			<% 
						  			
						  			
						  			
						  		}
						  		
						  		if(rows == 0){
						  			%>
						  				<tr>
							  				<td>
								  				<div class="alert alert-info" role="alert">
												  No item available.
												</div>
											</td>
										</tr>
						  			<%
						  		}
						  		
						  	} catch (Exception ex){
						  		ex.printStackTrace();
						  	}
						  								  	
						  	%>
						    
						  </tbody>
						</table>
					
					<% 
					
				} else {
					
					//Redirecting user to the login page.
					
					response.sendRedirect("signin.jsp");
					
				}
			
			%>
			
		</div>
	</div>
</div>


<jsp:include page="views/footer.jsp"></jsp:include>


