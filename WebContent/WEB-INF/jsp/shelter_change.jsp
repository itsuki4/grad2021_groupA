<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>変更完了</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
<%@ include file="baseNavber.jsp" %>
</head>
<body>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">空き情報の変更</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">施設の情報/マイページ/空き情報の編集/空き情報の変更</li>
                        </ol>
                        </div>
<table border="1" width="500px">

</table>
<div id="contents">
<div class="inner">
<div id="main">
<table class="ta1">
<tr><td align="center">変更しました</td></tr>
</table>
<article><table class="ta1">

<tr>
<th>定員数</th>
<td><%=s.getCapacity() %>
</td></tr>
<tr>
<th>入所条件</th>
<td><%=s.getShelter_conditions() %>
</td></tr>
<tr>
<th>空き人数</th>
<td><%=s.getShelter_vacancy() %>
</td></tr>

</table>
</article>
<a href="/grad2021_groupA/Shelter_mypageServlet?id=<%=s.getId() %>">マイページへ</a>
</div>
</div>
</div>
<%@ include file="basefooter.jsp" %>
</body>
</html>