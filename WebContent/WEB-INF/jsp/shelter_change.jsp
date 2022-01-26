<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>空き情報の編集</title>
</head>
<body>
<h2>空き情報を編集してください。</h2>
<form action="/grad2021_groupA/Shelter_updateServlet?id=<%=s.getId() %>" method="post">
<p>ID：<%=s.getId() %></p>
<h2>施設名：<%=s.getShelter_name1() %><br>　　　　<%=s.getShelter_name2() %></h2>
<p>郵便番号：〒<%=s.getShelter_address1() %></p>
<p>住所：<%=s.getShelter_address2() %><%=s.getShelter_address3() %><br>　　　　<%=s.getShelter_address4() %></p>
<p>電話番号：<%=s.getTel() %></p>
<p><input type="hidden" name="shelter_id" value="<%=s.getId() %>"></p>
<p>定員数：<input type="text" name="capacity"  value="<%=s.getCapacity() %>"></p>
<p>入所条件：<input type="text" name="shelter_conditions" value="<%=s.getShelter_conditions()%>"></p>
<p>空き人数：<input type="text" name="shelter_vacancy" value="<%=s.getShelter_vacancy() %>"></p>
<input type="submit"value="変更">

</form>




<a href="/grad2021_groupA/Shelter_mypageServlet?id=<%=s.getId() %>">戻る</a>
</body>
</html>