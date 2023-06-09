<%@page import="com.jsp.dto.LandLord"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	 <h1 id="header">View ALL</h1>
<form id="form" action="" >
    <% AdminService adminServices= new AdminService();  %>
    <%List<LandLord> landLords = adminServices.readAllUnapprovedLandlords(); %>
    
    <table border="2" style="text-align: center; border-collapse: collapse;" cellpadding="10">
    <tr>
       <th>LandLord ID</th>
       <th>LandLord Name</th>
       <th>LandLord Address</th>
       <th>LandLord Status</th>
      
    </tr>
    <% for(LandLord landLord : landLords){ %>
    <tr>
 		<td><%=landLord.getId() %>
       <td><%=landLord.getName() %></td>
       <td><%=landLord.getAddress() %></td>
       <td><%=landLord.getStatus() %></td>
   
          </tr>
    <%} %>
    
    </table>
     <a href="./AdminSection.jsp">
			 	<button type="button" id="submit">Back to Section</button>
			</a><br>
    </form>
    </main>
</body>
</html>