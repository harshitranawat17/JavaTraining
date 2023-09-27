<%@ page import="com.firstPractical.jsp.*"  %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic</title>
</head>
<body>
_______________________________________________________________________

<h3> Hello World!</h3>
The time on the server is <%= new java.util.Date()%>
<br/>

_______________________________________________________________________
<br/>
Convert to Uppercase: <%= new String("Harshit").toUpperCase()%>
<br/>
_______________________________________________________________________

<br/> 
MUltiplication of 25*6 is:  <%= 25*6 %>
<br/>
_______________________________________________________________________

<br/>
is the number 45 greater than 34 <%= 45>34 %>
<br/>
_______________________________________________________________________

<br/>
<h3> jsp scriplet</h3>
<br/>

<%
	for(int i=1;i<=5;i++){
		out.println("<br/> My name is Harshit: "+ i);
	}
%>
<br/>
_______________________________________________________________________


<br/>
<h3> jsp declaration</h3>
<br/>

<%!
	String makeitlowercase(String data){
		return data.toLowerCase();
	}
%>

Lower case function: <%= makeitlowercase("HARSHIT")  %>
<br/>
_______________________________________________________________________


<br/>
<h3> call java class from jsp</h3>
<br/>

calling method inside demo.java: <%= Demo.makeituppercase("ranawat") %>
<br/>
_______________________________________________________________________

<h3>JSP Built-In Objects</h3>

Request user agent: <%= request.getHeader("User-Agent") %>

<br/><br/>

Request language: <%= request.getLocale() %>

</body> 
</html>
	