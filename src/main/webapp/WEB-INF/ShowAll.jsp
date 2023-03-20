<%@page import="com.jsp.dto.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.CustomerService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<form action="AllStudent" >
<%CustomerService customerService = new CustomerService(); %>
<%List<Customer> customers = customerService.readAllCustomer(); %>>
 
    
    <table border="2px " cellspacing="5px" cellpadding="5px">
    <tr>
       <th>Customer_ID</th>
       <th>Customer_Name</th>
       <th>Customer_PhoneNo</th>
       <th>Customer_AdharNo</th>
       
       <th></th>
    </tr>
    <% for(Customer customer : customers){ %>
    <tr>
    <td><%=customer.getCustomer_id()%></td>
        <td><%=customer.getCustomer_name()%></td>
        <td><%=customer.getCustomer_phnone_num()%></td>
        <td><%=customer.getCustomer_aadhar_num()%></td>
    	<td><a href="edit? id="<%=customer.getCustomer_id() %>" >Edit</a></td>
          </tr>
    <%} %>
    
    </table>
    </form>
</body>
</html>
