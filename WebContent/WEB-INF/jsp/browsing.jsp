<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<%
List<Health> List = (List<Health>)request.getAttribute("List");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康状態記録</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="6">健康状態記録一覧</font></P>

<form action="/grad2021_groupA/Browsing" method="post">
<%if(List !=null && List.size()>0){ %>
<table align="center">
<hr>
<a href= "/grad2021_groupA/BrowsingAdd">新規追加</a>
<% for(Health date: List) {%>
<tr>
<td>児童ID: <%= date.getPerson_id() %></td></tr>
<tr><td>備考欄: <%= date.getPerson_remarks() %></td></tr>
<tr><td align="right">記入日: <%= date.getCreate_data() %></td></tr>
<td><a href = "/grad2021_groupA/BrowsingDetailServlet?id=<%= date.getPerson_id() %>">詳細</a></td>
<% } %>
</table>
<% } %>
</form>
</body>
</html>