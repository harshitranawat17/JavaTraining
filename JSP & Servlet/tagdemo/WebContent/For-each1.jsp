<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.luv2code.jsp.tagdemo.Student" %>

<%
	List<Student> data = new ArrayList<>();

	data.add(new Student("HAR", "SYM", false));
	data.add(new Student("tha", "suk", false));
	data.add(new Student("HArsjt", "rabawat", true));
	
	pageContext.setAttribute("myStudents", data);
	
%>

<html>
<body>	
		<c:forEach var="tempstu" items="${myStudents}" >																																																																																														
		${tempstu.firstname} ${tempstu.lastname}, ${tempstu.goldCustomer} 
		<c:if test="${tempstu.goldCustomer}">
			Special discount
		</c:if>
		<br/>

		</c:forEach>

</body>

</html>