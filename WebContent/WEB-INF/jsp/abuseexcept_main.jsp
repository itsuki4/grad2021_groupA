<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="abuse_except_model.*,java.util.*"%>
<%@page import="java.sql.*"%>
<%
AbuseExcept abuse=(AbuseExcept)request.getAttribute("abuse");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>詳細ページ</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">虐待以外の情報</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">虐待以外の情報</li>
                        </ol>
                        </div>
<div id="contents">
<div class="inner">
<div id="main">
<h2>詳細ページ</h2>
<article>
<table class="table table-striped" >
<tr>
<th>児童ID</th>
<td><%=abuse.getperson_id()%></td>
</tr>
<tr>
<th>保護内容</th>
<td><%=abuse.getperson_protect()%></td>
</tr>
<tr>
<th>保護理由</th>
<td><%=abuse.getexcept_reason()%> </td>
</tr>
<tr>
<th>今後の方向性</th>
<td><%=abuse.getexcept_direction() %></td>
</tr>
<tr>
<th>対象者の状況</th>
<td><%=abuse.getexcept_status()%> </td>
</tr>
<tr>
<th>現状と課題</th>
<td><%=abuse.getexcept_task() %></td>
</tr>
<tr>
<th>備考欄</th>
<td><%=abuse.getexcept_remarks() %></td>
</tr>
</table>
</article>
</div>
</div>
</div>
<form action="">

<a href=/grad2021_groupA/Abuse_exceptRead>一覧へ</a>

</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>