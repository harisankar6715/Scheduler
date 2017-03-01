<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduler</title>
<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel='stylesheet'
	type='text/css' />
<!-- Custom CSS -->
<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- jQuery -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="resources/css/icon-font.min.css"
	type='text/css' />

<!-- //lined-icons -->
<script src="resources/js/jquery-1.10.2.min.js"></script>
<style>
body {
	position: relative;
}

#section1 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #1E88E5;
}

#section2 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #673ab7;
}

#section3 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #ff9800;
}

#section4 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #00bcd4;
}
</style>
</style>

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand">Scheduler</a>
		</div>
		<div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="#section1">Home</a></li>
					<li><a href="#section2">About</a></li>
					<li><a href="contacts">Contact</a></li>
					<li><a href="#section4">Footer</a></li>
					<li><a href="loginhere">LogIn</a></li>
					<li><a href="register">SignUp</a></li>
				</ul>
			</div>
			
		</div>
	</div>
	</nav>

	<div id="section1" class="container-fluid">
		<h1>Carousel</h1>
		<p>Space for carousel.</p>
	</div>
	<div id="section2" class="container-fluid">
		<h1>About</h1>
		<p>Space for about.</p>
	</div>
	<div id="section3" class="container-fluid">
		<h1>Contact</h1>
		<p>Space for Contact.</p>
	</div>
	<div id="section4" class="container-fluid">
		<h1>Footer</h1>
		<p>Space for footer.</p>
	</div>

	<script>
		$(document).ready(function() {
			// Add scrollspy to <body>
			$('body').scrollspy({
				target : ".navbar",
				offset : 50
			});

			// Add smooth scrolling on all links inside the navbar
			$("#myNavbar a").on('click', function(event) {
				// Make sure this.hash has a value before overriding default behavior
				if (this.hash !== "") {
					// Prevent default anchor click behavior
					event.preventDefault();

					// Store hash
					var hash = this.hash;

					// Using jQuery's animate() method to add smooth page scroll
					// The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
					$('html, body').animate({
						scrollTop : $(hash).offset().top
					}, 800, function() {

						// Add hash (#) to URL when done scrolling (default click behavior)
						window.location.hash = hash;
					});
				} // End if
			});
		});
	</script>

</body>
</html>