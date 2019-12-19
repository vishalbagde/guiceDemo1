<%@page import="com.person.entity.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.person.PersonServiceProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>

	<table border=1>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Contact No</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
			List<Person> per = PersonServiceProvider.getPersonService().getAllPerson();
			
			for (Person person : per) {
				out.println("<tr>");
				out.println("<td>"+person.getPerson_id()+"</td>");
				out.println("<td>"+person.getFname()+"</td>");
				out.println("<td>"+person.getMname()+"</td>");
				out.println("<td>"+person.getLname()+"</td>");
				out.println("<td>"+person.getEmail()+"</td>");
				out.println("<td>"+person.getContact_no()+"</td>");
				out.println("<td><a href='update.jsp?person_id="+person.getPerson_id()+"' >Update</td>");
				out.println("<td><a href='delete.jsp?person_id="+person.getPerson_id()+"' >Delete</td>");
				out.println("</tr>");
					
				
				
			}
		%>


	</table>


	<%@include file="footer.jsp"%>
</body>
</html>