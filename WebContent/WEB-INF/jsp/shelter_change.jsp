<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>空き情報の編集</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
<%@ include file="baseNav.jsp" %>
</head>
<body>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">空き情報の編集</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">施設の情報/マイページ/空き情報の編集</li>
                        </ol>
                        </div>
<div id="contents">
<div class="inner">
<div id="main">
<h3>空き情報を変更してください。</h3>
<form action="/grad2021_groupA/Shelter_updateServlet?id=<%=s.getId() %>" method="post">
<input type="hidden" name="shelter_id" value="<%=s.getId() %>">
<article><table class="ta1">
<tr>
<th>定員数</th>
<td><input type="text" name="capacity"  value="<%=s.getCapacity() %>">
</td></tr>
<tr>
<th>入所条件</th>
<td><input type="text" name="shelter_conditions" value="<%=s.getShelter_conditions()%>">
</td></tr>
<tr>
<th>空き人数</th>
<td><input type="text" name="shelter_vacancy" value="<%=s.getShelter_vacancy() %>">
</td></tr>



</table>
</article>
<input type="submit"value="変更">
</form>

</div>
</div>
</div>


<a href="/grad2021_groupA/Shelter_mypageServlet?id=<%=s.getId() %>">戻る</a>
<%@ include file="basefooter.jsp" %>
</body>
</html>