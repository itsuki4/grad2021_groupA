
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
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">健康状態記録</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">健康状態記録</li>
                        </ol>
                        </div>
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
