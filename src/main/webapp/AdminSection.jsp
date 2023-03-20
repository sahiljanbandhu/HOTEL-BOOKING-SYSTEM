<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
html {
	height: 100%;
}

body {
	height: 100%;
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	display: grid;
	justify-items: center;
	align-items: center;
	background-color: yellow;
}

#main-holder {
	width: 80%;
	height: 100%;
	display: grid;
	justify-items: center;
	align-items: center;
	background-color: white;
	border-radius: 7px;
	box-shadow: 0px 0px 5px 2px black;
}

#form {
	align-self: flex-start;
	display: grid;
	align-items: center;
}

#submit {
	width: 100%;
	padding: 20px;
	border: none;
	border-radius: 2px;
	color: white;
	font-weight: bold;
	background-color: #3a3a3a;
	cursor: pointer;
	outline: none;
}
</style>
</head>

<body>
	<main id="main-holder">
		<h1 id="header">Hotel Management System</h1>
		<form id="form">
			<a href="./AdminSave.jsp">
				<button type="button" id="submit">INSERT</button>
			</a><br> <a href="./AdminUpdate.jsp">
				<button type="button" id="submit">Update</button>
			</a><br> <a href="./AdminDelete.jsp">
				<button type="button" id="submit">Delete</button>
			</a><br> <a href="./AdminGetAll.jsp">
				<button type="button" id="submit">View All</button>
			</a><br> <a href="./AdminGetById.jsp">
				<button type="button" id="submit">View Single</button>
			</a><br> <a href="./AdminApproveLandLord.jsp">
				<button type="button" id="submit">Approve</button>
			</a><br> <a href="./AdminReadAllApprovedLandLords.jsp">
				<button type="button" id="submit">View Approved Property</button>
			</a><br> <a href="./AdminReadAllUnapprovedLandLords.jsp">
				<button type="button" id="submit">View Un-Approved Property</button>
			</a><br>

		</form>
	</main>
</body>
</html>