<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>変更完了</title>
</head>
<body>
<h2>変更しました</h2>
<p>ID：<%=s.getId() %></p>
<h2>施設名：<%=s.getShelter_name1() %><br>　　　　<%=s.getShelter_name2() %></h2>
<p>郵便番号：〒<%=s.getShelter_address1() %></p>
<p>住所：<%=s.getShelter_address2() %><%=s.getShelter_address3() %><br>　　　　<%=s.getShelter_address4() %></p>
<p>電話番号：<%=s.getTel() %></p>
<p><font color="red">定員数：<%=s.getCapacity() %></font></p>
<p><font color="red">入所条件：<%=s.getShelter_conditions() %></font></p>
<p><font color="red">空き人数：<%=s.getShelter_vacancy() %></font></p>

</body>
</html>