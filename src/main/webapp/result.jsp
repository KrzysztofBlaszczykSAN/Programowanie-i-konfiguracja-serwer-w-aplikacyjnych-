<%@ page import ="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
Najpopularniejsze rasy dla wybranego zwierzęcia:
</h1>
<%
List result= (List) request.getAttribute("rasy");
Iterator it = result.iterator(); //pętla zwracająca wyniki do momentu zwrócenia ostatniego elementu lisy
while(it.hasNext())
	{
out.println("<h2>"+it.next()+"<br></h2>");
	}
%>
</body>
</html>