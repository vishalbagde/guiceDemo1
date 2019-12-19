<%@page import="com.person.entity.Person"%>
<%@page import="com.person.PersonServiceProvider"%>
<%@page import="com.person.service.PersonService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

PersonService pservice= PersonServiceProvider.getPersonService();
Person person  =pservice.findPerson(Integer.parseInt(request.getParameter("person_id")));

if(person!=null)
{

%>


<form method="post">
<%@include file="header.jsp"%>
	<table border=1 width="500px">
		<tr>
			<th colspan="2">Person Details Update</th>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value ="<%out.print(person.getFname()); %>" /></td>
		</tr>
		<tr>
			<td>Moddile Name</td>
			<td><input type="text" name="mname" value ="<% out.print(person.getMname()); %>" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value ="<% out.print(person.getLname()); %>" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value ="<% out.print(person.getEmail()); %>" /></td>
		</tr>
			<tr>
			<td>Contact No.</td>
			<td><input type="text" name="contact_no" value ="<% out.print(person.getContact_no()); %>" /></td>
		</tr>

		<tr>
			<td><td><input type="submit" name="submit" value="Update" />
			<input type="reset" name="reset" value="reset" /></td></td>

		</tr>
	</table>
	</form>

</body>
</html>


<% 
}


if(request.getParameter("submit")!=null)
{
	pservice= PersonServiceProvider.getPersonService();
	Person per=pservice.findPerson(Integer.parseInt(request.getParameter("person_id")));
	per.setFname(request.getParameter("fname"));
	per.setMname(request.getParameter("mname"));
	per.setLname(request.getParameter("lname"));
	
	per.setEmail(request.getParameter("email"));
	per.setContact_no(request.getParameter("contact_no"));
	
	pservice.updatePerson(per);
	out.println("<script>alert('person added successful')</script>");
	

}


%>