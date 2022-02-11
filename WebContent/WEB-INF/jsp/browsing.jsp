
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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<a href= "/grad2021_groupA/BrowsingAdd">新規追加</a>
<%if(List !=null && List.size()>0){ %>
<table class="table table-striped"><tr><th>児童ID</th><th>備考欄</th><th>記入日</th>
<% for(Health date: List) {%>
<tr>
<td><%= date.getPerson_id() %></td>
<td><%= date.getPerson_remarks() %></td>
<td align="right"><%= date.getCreate_data() %></td>
<td><a href = "/grad2021_groupA/BrowsingDetailServlet?id=<%= date.getPerson_id() %>">詳細</a></td>
</tr>
<% } %>
</table>
<% } %>
</body>
</html>
