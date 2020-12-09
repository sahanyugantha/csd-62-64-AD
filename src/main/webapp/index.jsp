<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSD 62 & 64</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">CSD62n64</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>

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


<script type="text/javascript" src="js/jquery-3.5.1.slim.min.js"></script>
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>