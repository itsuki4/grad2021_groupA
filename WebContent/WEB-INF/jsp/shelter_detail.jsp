<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<% List<Shelter_Date> list=(List<Shelter_Date>)request.getAttribute("list"); %>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>施設の詳細画面</h2>


<form action="/grad2021_groupA/Shelter_chatServlet" method="post">
		      		<p>すべて入力してください</p>
		      		　　　名前：<input type="text" name="shelter_id"><br>
		      		ユーザーID：<input type="text" name="shelter_comment"><br>
		      		<input type="submit" value="送信"><br>
		      		</form>
</body>
</html>