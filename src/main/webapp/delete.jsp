<%@page import="com.person.service.PersonService"%>
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

<%

if(request.getParameter("person_id")!=null)
{
	
	PersonService pservice= PersonServiceProvider.getPersonService();
	pservice.deletePerson(pservice.findPerson(Integer.parseInt(request.getParameter("person_id"))));
	response.sendRedirect("display.jsp");

}

%>

</body>
</html>