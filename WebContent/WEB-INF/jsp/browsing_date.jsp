<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.*,java.util.*"%>
<%@page import="java.sql.*"%>
<%
Health_date date = (Health_date)request.getAttribute("date");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>詳細ページ</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">健康状態記録</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">健康状態記録</li>
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
<td><%= date.getPerson_id() %></td>
</tr>
<tr>
<th>身長</th>
<td><%= date.getPerson_body() %></td>
</tr>
<tr>
<th>体重</th>
<td><%= date.getPerson_check() %></td>
</tr>
<tr>
<th>体重の状態</th>
<td><%= date.getPerson_datail() %>
<%
if(date.getPerson_datail() == 1){
	out.println("・やせ型");
}else if(date.getPerson_datail() == 2){
	out.println("・普通");
}else{
	out.println("・肥満");
}
%>
</td>
</tr>
<tr>
<th>アレルギー7品目</th>
<td><%= date.getAllergies() %></td>
</tr>
<tr>
<th>アレルギー症状の程度</th>
<td><%= date.getAllergies_degree() %>
<%
if(date.getAllergies_degree() ==1){
	out.println("・軽症");
} else if(date.getAllergies_degree() ==2){
	out.println("・重症");
} else {
	out.println("なし");
}
%>
</td>
</tr>
<tr>
<th>アレルギー備考欄</th>
<td><%= date.getAllergies_remarks() %></td>
</tr>
<tr>
<th>病気・薬</th>
<td><%= date.getChronic_condition() %></td>
</tr>
<tr>
<th>病気の対応</th>
<td><%= date.getChronic_correspondence() %></td>
</tr>
<tr>
<th>不眠</th>
<td><%= date.getInsomnia() %>
<%
if (date.getInsomnia() == 1){
	out.println("・当てはまる");
} else if (date.getInsomnia() == 2){
	out.println("・やや当てはまる");
} else if (date.getInsomnia() == 3){
	out.println("・やや当てはまらない");
} else if(date.getInsomnia() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>
</td>
<tr>
<th>不安・怯え</th>
<td><%= date.getFrightened() %>
<%
if (date.getFrightened() == 1){
	out.println("・当てはまる");
} else if (date.getFrightened() == 2){
	out.println("・やや当てはまる");
} else if (date.getFrightened() == 3){
	out.println("・やや当てはまらない");
} else if(date.getFrightened() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>

</td>
</tr>
<tr>
<th>抑うつ</th>
<td><%= date.getDepression() %>
<%
if (date.getDepression() == 1){
	out.println("・当てはまる");
} else if (date.getDepression() == 2){
	out.println("・やや当てはまる");
} else if (date.getDepression() == 3){
	out.println("・やや当てはまらない");
} else if(date.getDepression() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>
</td>
</tr>
<tr>
<th>精神症状備考欄</th>
<td><%= date.getMental_remarks() %></td>
</tr>
<tr>
<th>自殺行為</th>
<td><%= date.getSuicide() %>
<%
if (date.getSuicide() == 1){
	out.println("・当てはまる");
} else if (date.getSuicide() == 2){
	out.println("・やや当てはまる");
} else if (date.getSuicide() == 3){
	out.println("・やや当てはまらない");
} else if(date.getSuicide() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>
</td>
</tr>
<tr>
<th>脱水症状</th>
<td><%= date.getDehydration() %>
<%
if (date.getDehydration() == 1){
	out.println("・当てはまる");
} else if (date.getDehydration() == 2){
	out.println("・やや当てはまる");
} else if (date.getDehydration() == 3){
	out.println("・やや当てはまらない");
} else if(date.getDehydration() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>
</td>
</tr>
<tr>
<th>栄養不足</th>
<td><%= date.getMalnutrition() %>

<%
if (date.getMalnutrition() == 1){
	out.println("・当てはまる");
} else if (date.getMalnutrition() == 2){
	out.println("・やや当てはまる");
} else if (date.getMalnutrition() == 3){
	out.println("・やや当てはまらない");
} else if(date.getMalnutrition() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%></td>
</tr>
<tr>
<th>偏食</th>
<td><%= date.getUnbalanced_diet() %>
<%
if (date.getUnbalanced_diet() == 1){
	out.println("・当てはまる");
} else if (date.getUnbalanced_diet() == 2){
	out.println("・やや当てはまる");
} else if (date.getUnbalanced_diet() == 3){
	out.println("・やや当てはまらない");
} else if(date.getUnbalanced_diet() == 4){
	out.println("・当てはまらない");
} else{
	out.println("・不明");
}
%>
</td>
</tr>
<tr>
<th>偏食備考欄</th>
<td><%= date.getUnbalanced_remarks() %></td>
</tr>
<tr>
<th>傷の部位</th>
<td><%= date.getScratch_point() %></td>
</tr>
<tr>
<th>傷の数</th>
<td><%= date.getScratch_number() %></td>
</tr>
<tr>
<th>傷の大きさ</th>
<td><%= date.getScratch_size() %>
<%
if (date.getScratch_size() == 1){
	out.println("・大きい");
} else if (date.getScratch_size() == 2){
	out.println("・普通");
} else {
	out.println("・小さい");
}
%>
</td>
</tr>
<tr>
<th>傷の色</th>
<td><%= date.getScratch_colour() %>
<%
if (date.getScratch_colour() == 1){
	out.println("・赤色");
} else if (date.getScratch_colour() == 2){
	out.println("・赤紫色");
} else if (date.getScratch_colour() == 3){
	out.println("・黄色");
} else {
	out.println("・当てはまらない");
}
%>
</td>
</tr>
<tr>
<th>傷の備考欄</th>
<td><%= date.getScratch_remarks() %></td>
</tr>
<tr>
<th>障害の有無</th>
<td><%= date.getHindrance() %>
<%
if (date.getHindrance() == 1){
	out.println("・ある");
} else if (date.getHindrance() ==2){
	out.println("・ない");
} else{
	out.println("・不明");
}
%>
</td>
</tr>
<tr>
<th>児童の備考欄</th>
<td><%= date.getPerson_remarks() %></td>
</tr>
<tr>
<th>記入日</th>
<td><%= date.getCreate_data() %></td>
</tr>
</table>
</article>
</div>
</div>
</div>
<p><a href="/grad2021_groupA/BrowsingEdit?id=<%= date.getPerson_id() %>">編集</a></p>
<p>
<form action="">
<a href=/grad2021_groupA/Browsing>一覧へ</a>
</p>
</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>
