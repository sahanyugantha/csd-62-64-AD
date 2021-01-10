
<jsp:include page="views/header.jsp"></jsp:include>

<div class="container">
	<div class="row">
		<div class="col-sm-10 offset-sm-1">
			<h2 class="my-title">Welcome to CSD 62 & 64</h2>
			
			<h3 id="bmi-title">BMI Calculator</h3>
			<form id="bmi-form" action="bmi" method="get">
				 <div class="form-group">
				    <label for="weight">Enter your weight (kg)</label>
				    <input type="number" name="u-weight" class="form-control" id="weight">
				 </div>
				  <div class="form-group">
				    <label for="height">Enter your height (cm)</label>
				    <input type="number" name="u-height" class="form-control" id="height">
				 </div>
				 <button id="btn-check" type="submit" class="btn btn-primary">Check</button>
			</form>
			
		</div>
	</div>
</div>


<jsp:include page="views/footer.jsp"></jsp:include>


