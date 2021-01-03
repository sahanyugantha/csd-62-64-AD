<jsp:include page="views/header.jsp"></jsp:include>

<div class="container mt-5">

	<div class="col-md-8 offset-md-2">
	
		<div>
			
			<form action="signin" method="post">
			  <div class="mb-3">
			    <label for="u-email" class="form-label">Email address</label>
			    <input name="u-email" type="email" class="form-control" id="u-email" aria-describedby="emailHelp">
			  </div>
			  <div class="mb-3">
			    <label for="u-pass" class="form-label">Password</label>
			    <input name="u-pass" type="password" class="form-control" id="u-pass">
			  </div>
			  <button name="btn-submit" type="submit" class="btn btn-primary">Sign in</button>
			</form>
			
		</div>
	
	</div>

</div>



	
<jsp:include page="views/footer.jsp"></jsp:include>
