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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
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
</body>
</html>