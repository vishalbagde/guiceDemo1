<%@page import="com.person.service.PersonService"%>
<%@page import="com.person.PersonServiceProvider"%>
<%@page import="com.person.entity.Person"%>
<%@page import="javax.persistence.Entity"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<%@include file="header.jsp"%>
	<table border=1 width="500px">
		<tr>
			<th colspan="2">Person Details Insert</th>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" /></td>
		</tr>
		<tr>
			<td>Moddile Name</td>
			<td><input type="text" name="mname" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" /></td>
		</tr>
			<tr>
			<td>Contact No.</td>
			<td><input type="text" name="contact_no" /></td>
		</tr>

		<tr>
			<td><td><input type="submit" name="submit" value="insert" />
			<input type="reset" name="reset" value="reset" /></td></td>

		</tr>
	</table>
	</form>
</body>
</html>

<%
if(request.getParameter("submit")!=null)
{
	
		
	Person per=new Person();
	per.setFname(request.getParameter("fname"));
	per.setMname(request.getParameter("mname"));
	per.setLname(request.getParameter("lname"));
	
	per.setEmail(request.getParameter("email"));
	per.setContact_no(request.getParameter("contact_no"));
	
	
	PersonService pservice = PersonServiceProvider.getPersonService();
	pservice.insertPerson(per);
	out.println("<script>alert('person added successful')</script>");
	

}


%>