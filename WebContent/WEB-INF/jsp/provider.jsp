<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.*,java.util.*"%>

<%
List<Others> List = (List<Others>)request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>その他情報提供者から</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>
<body>
<p><font size="5">その他情報提供者</font></p>
<form action="/grad2021_groupA/Provider" method="post">
<%if(List !=null && List.size()>0){ %>
<table align="center">
<hr>
<% for(Others date: List) {%>
<tr>
<td>児童ID:<%= date.getPerson_id() %></td></tr>
<tr><td>氏名:<%= date.getProvider_name() %></td></tr>
<tr><td>児童との関係:<%= date.getProvider_relationship() %></td></tr>
<td><input type="submit" value="詳細"></td>
<% } %>
</table>
<% } %>
</form>
</body>
</html>