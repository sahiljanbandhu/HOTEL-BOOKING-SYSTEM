<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- <link rel="stylesheet" href="./css/style.css"> -->
<style>
@import
	url("https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700;800;900&display=swap")
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

#d {
	display: flex;
	background: #333;
	justify-content: flex-end;
	align-items: flex-end;
	min-height: 100px;
	margin-top: 100px;
}

.footer {
	position: relative;
	width: 100%;
	background: #3586ff;
	min-height: 100px;
	padding: 20px 50px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}

.social-icon, .menu {
	position: relative;
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 10px 0;
	flex-wrap: wrap;
}

.social-icon__item, .menu__item {
	list-style: none;
}

.social-icon__link {
	font-size: 2rem;
	color: #fff;
	margin: 0 10px;
	display: inline-block;
	transition: 0.5s;
}

.social-icon__link:hover {
	transform: translateY(-10px);
}

.menu__link {
	font-size: 1.2rem;
	color: #fff;
	margin: 0 10px;
	display: inline-block;
	transition: 0.5s;
	text-decoration: none;
	opacity: 0.75;
	font-weight: 300;
}

.menu__link:hover {
	opacity: 1;
}

.footer p {
	color: #fff;
	margin: 15px 0 10px 0;
	font-size: 1rem;
	font-weight: 300;
}

.wave {
	position: absolute;
	top: -100px;
	left: 0;
	width: 100%;
	height: 100px;
	background: url("https://i.ibb.co/wQZVxxk/wave.png");
	background-size: 1000px 100px;
}

.wave#wave1 {
	z-index: 1000;
	opacity: 1;
	bottom: 0;
	animation: animateWaves 4s linear infinite;
}

.wave#wave2 {
	z-index: 999;
	opacity: 0.5;
	bottom: 10px;
	animation: animate 4s linear infinite !important;
}

.wave#wave3 {
	z-index: 1000;
	opacity: 0.2;
	bottom: 15px;
	animation: animateWaves 3s linear infinite;
}

.wave#wave4 {
	z-index: 999;
	opacity: 0.7;
	bottom: 20px;
	animation: animate 3s linear infinite;
}

@
keyframes animateWaves { 0% {
	background-position-x: 1000px;
}

100


%
{
background-positon-x


:


0px
;


}
}
@
keyframes animate { 0% {
	background-position-x: -1000px;
}

100


%
{
background-positon-x


:


0px
;


}
}
.a-col {
	background-color: rgb(226, 25, 25);
	text-decoration: black;
	display: flex;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">book my hotel</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">about</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> my profile</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="CustomerUpdate.jsp">update</a> <a
							class="dropdown-item" href="newhome.html">logout </a></li>

			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>

		</div>
	</nav>
	<br>

	<div class="row row-cols-1 row-cols-md-2 g-4">
		<div class="col">
			<div class="card">
				<img src="./img/pexels-pixabay-271619.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Double Room</h5>
					<p class="card-text">A double room has one double bed for
						double occupancy. An extra bed may be added to this room at the
						request of a guest and charged accordingly. The size of the double
						bed is generally 4.5 feet by 6 feet.</p>
				</div>
				<div class="card-footer">
					<a class="btn btn-primary" href="CustomerCheckIn2.jsp"
						role="button">BOOK NOW</a>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card">
				<img src="./img/pexels-pixabay-271619.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Single Room</h5>
					<p class="card-text">A single room has one single bed for
						single occupancy. An additional bed (called an extra bed) may be
						added to this room at the request of a guest and charged
						accordingly.</p>
				</div>
				<div class="card-footer">
					<a class="btn btn-primary" href="CustomerCheckIn2.jsp"
						role="button">BOOK NOW</a>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card">
				<img src="./img/pexels-pixabay-271619.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Triple Room</h5>
					<p class="card-text">A triple room has three separate single
						beds and can be occupied by three guests. This type of room is
						suitable for groups and delegates of meetings and conferences.</p>
				</div>
				<div class="card-footer">
					<a class="btn btn-primary" href="CustomerCheckIn2.jsp"
						role="button">BOOK NOW</a>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="card">
				<img src="./img/pexels-pixabay-271619.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Quad Room</h5>
					<p class="card-text">A quad room has four separate single beds
						and can accommodate four persons together in the same room.</p>
				</div>
				<div class="card-footer">
					<a class="btn btn-primary" href="CustomerCheckIn2.jsp"
						role="button">BOOK NOW</a>
				</div>
			</div>
		</div>
	</div>



	<br>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="d">
		<footer class="footer">
			<div class="waves">
				<div class="wave" id="wave1"></div>
				<div class="wave" id="wave2"></div>
				<div class="wave" id="wave3"></div>
				<div class="wave" id="wave4"></div>
			</div>
			<ul class="social-icon">
				<li class="social-icon__item"><a class="social-icon__link"
					href="#"> <ion-icon name="logo-facebook"></ion-icon>
				</a></li>
				<li class="social-icon__item"><a class="social-icon__link"
					href="#"> <ion-icon name="logo-twitter"></ion-icon>
				</a></li>
				<li class="social-icon__item"><a class="social-icon__link"
					href="#"> <ion-icon name="logo-linkedin"></ion-icon>
				</a></li>
				<li class="social-icon__item"><a class="social-icon__link"
					href="#"> <ion-icon name="logo-instagram"></ion-icon>
				</a></li>
			</ul>
			<ul class="menu">
				<li class="menu__item"><a class="menu__link" href="#">Home</a></li>
				<li class="menu__item"><a class="menu__link" href="#">About</a></li>
				<li class="menu__item"><a class="menu__link" href="#">Services</a></li>
				<li class="menu__item"><a class="menu__link" href="#">Team</a></li>
				<li class="menu__item"><a class="menu__link" href="#">Contact</a></li>

			</ul>
			<p>&copy;Qspiders | All Rights Reserved</p>
		</footer>
	</div>
	<script type="module"
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>