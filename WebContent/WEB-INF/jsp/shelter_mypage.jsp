<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>施設のマイページ</title>
</head>
<body>
<h2>施設の情報</h2>


<form action="/grad2021_groupA/Shelter_changeServlet?id=<%=s.getId() %>" method="post">
<p>ID：<%=s.getId() %></p>
<h2>施設名：<%=s.getShelter_name1() %><br>　　　　<%=s.getShelter_name2() %></h2>
<p>郵便番号：〒<%=s.getShelter_address1() %></p>
<p>住所：<%=s.getShelter_address2() %><%=s.getShelter_address3() %><br>　　　　<%=s.getShelter_address4() %></p>
<p>電話番号：<%=s.getTel() %></p>
<p>定員数：<%=s.getCapacity() %></p>
<p>入所条件：<%=s.getShelter_conditions() %></p>
<p>空き人数：<%=s.getShelter_vacancy() %></p>
<input type="submit"value="変更">

</form>
</body>
</html>