<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="interview_model.*,java.util.*"%>
<%@page import="java.sql.*"%>
<%
Interview interview=(Interview)request.getAttribute("interview");
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
                        <h1 class="mt-4">面談内容</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">面談内容</li>
                        </ol>
                        </div>
<div id="contents">
<div class="inner">
<div id="main">
<h2><%=interview.getperson_name1()%>の詳細ページ</h2>
<article>
<table class="table table-striped" >
<tr>
<th>児童ID</th>
<td><%=interview.getperson_id()%></td>
</tr>
<tr>
<th>児童氏名</th>
<td><%=interview.getperson_name1()%></td>
</tr>
<tr>
<th>面談実施日</th>
<td><%=interview.getinterview_date()%> </td>
</tr>
<tr>
<th>職員ID</th>
<td><%=interview.getstaff_id() %></td>
</tr>
<tr>
<th>職員氏名</th>
<td><%=interview.getstaff_name1()%> </td>
</tr>
<tr>
<th>協力態度</th>
<td><%=interview.getcooperation_attitude() %></td>
</tr>
<tr>
<th>保護者の性格的問題の経過状況</th>
<td><%=interview.getpersonality_progress() %></td>
</tr>
<tr>
<th>保護者の精神的問題の経過状況</th>
<td><%=interview.getmental_progress()%></td>
</tr>
<tr>
<th>子供への感情の変化</th>
<td><%=interview.getemotional_changes()%></td>
</tr>
<tr>
<th>親の意見</th>
<td><%=interview.getparental_opinion()%></td>
</tr>
<tr>
<th>当面の課題</th>
<td><%=interview.getimmediate_issues()%></td>
</tr>
<tr>
<th>今後の方針</th>
<td><%=interview.getfuture_tasks()%></td>
</tr>
<tr>
<th>備考欄</th>
<td><%=interview.getpersonality_remarks()%></td>
</tr>
</table>
</article>
</div>
</div>
</div>
<form action="">
<p>
<a href=/grad2021_groupA/InterviewRead>一覧へ</a>
</p>
</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>