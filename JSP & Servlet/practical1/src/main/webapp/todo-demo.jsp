<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<body>

<!-- create HTML form -->

<form action="todo-demo.jsp">
	Add new item: <input type="text" name="theItem"/>
	
	<input type="submit" value="Submit">

</form>

<br>

Added: <%= request.getParameter("theItem")%>

<!-- Add new item to to-do list -->

<%
	//get the to do item from the session
	
	List<String> items = (List<String>)session.getAttribute("myTodoList");
	
	//if the to-do items doesnot exist, then create new one
	
	if(items == null){
		items = new  ArrayList<String>();
		session.setAttribute("myTodoList", items);
		
	}
	
	//see if there is form data to add
	
	
	
	
	String item = request.getParameter("theItem");
	
	boolean isItemNotEmpty = item != null && item.trim().length() > 0;
	
   	boolean isItemNotDuplicate = item != null && !items.contains(item.trim());
   	
	if(isItemNotEmpty && isItemNotDuplicate){
		items.add(item.trim());
	}

%>

<!-- display all todo items from the session -->
<hr>
<b>To List items:</b></br>

<ol>
<%
	for(String temp : items){
		out.println("<li>"+temp+"</li>");
	}
%>
</ol>


</body>
</html>