
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>施設のマイページ</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
<%@ include file="baseNavber.jsp" %>
</head>
<body>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">マイページ</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">施設の情報/マイページ</li>
                        </ol>
                        </div>
<div id="contents">
<div class="inner">
<div id="main">

<article><table class="ta1">
<tr>
<th>ID</th>
<td><%=s.getId() %>
</td></tr>
<tr>
<th>施設名</th>
<td><%=s.getShelter_name1() %><br>
</td></tr>
<tr>
<th>住所</th>
<td>〒<%=s.getShelter_address1() %><br>
<%=s.getShelter_address2() %><%=s.getShelter_address3() %>
</td></tr>
<tr>
<th>電話番号</th>
<td><%=s.getTel() %>
</td></tr>
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

<form action="/grad2021_groupA/Shelter_changeServlet?id=<%=s.getId() %>" method="post">
<p align="center"><input type="submit"value="空き情報や入所条件の変更" class="btn"></p>
</form>
<h3>チャット</h3>

<a href="/grad2021_groupA/ShelterCommentServlet?id=<%=s.getId() %>">chatへ</a>
</div>
</div>
</div>

<%@ include file="basefooter.jsp" %>
</body>
</html>
