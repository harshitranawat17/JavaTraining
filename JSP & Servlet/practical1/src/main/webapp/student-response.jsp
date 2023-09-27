<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student details</title>
</head>
<body>
	The student is confirmed: ${param.firstName} ${param.lastName}
	
	<br/><br/>
	
	The student country: ${param.Country}
	
	<br/><br/>
	
	My favorite Programming Language is: ${param.gender}
	
	<br/><br/>
	
	<! -- display list of "languages" -->
	
	<ul>
		<%
			String[] lang = request.getParameterValues("favoriteLanguage");
		
			if (lang != null){
				for(String langs : lang){
				
					out.println("<li>"+langs+"</li>");
				}
			}
 		%>
	</ul>
	
</body>
</html>