<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%
List<Shelter> list=(List<Shelter>)request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>空き情報</title>
</head>
<body>

<h1>空き情報一覧</h1>
<form action="/grad2021_groupA/Shelter_DateServlet" method="post">
<%if(list !=null && list.size()>0){ %>
<table>
<hr>

<tr><th>施設名</th><th>施設番号</th><th>空き詳細</th><th>空き人数</th><th></th></tr>
<tr><td><hr></td><td><hr></td><td><hr></td><td><hr></td><td><hr></td></tr>
<%for(Shelter s:list){ %>
<tr>
<td><%=s.getShelter_name1() %></td>
<td><%=s.getId() %></td>
<td><%=s.getShelter_conditions() %></td>
<td>　　<%=s.getShelter_vacancy() %></td>
<td><input type="submit" value="詳細"></td>
</tr>
<tr><td><hr></td><td><hr></td><td><hr></td><td><hr></td><td><hr></td></tr>
<%} %>

</table>
<%} %>
</form>
</body>
</html>