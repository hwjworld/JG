<%@page import="cn.net.gracefully.model.task.Task"%>
<%@page import="java.util.List"%>
<%@page import="cn.net.gracefully.service.task.TaskServiceImpl"%>
<%@page import="cn.net.gracefully.service.task.TaskService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
TaskService service = new TaskServiceImpl();
List<Task> list =  service.listAllTask();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Task list</h1>
<div style="float: left;">
<table border="1">
<tr><td>task title</td><td>start time</td><td>state</td></tr>
<%for(Task task: list){ %>
<tr>
<td><%=task.getTitle() %></td><td><%=task.getStartTime() %></td><td><%=task.getTaskStatus().isFinish() %></td>
</tr>
<%} %>
</table>
</div>
</body>
</html>