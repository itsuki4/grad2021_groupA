<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<%
Health_date date = (Health_date)request.getAttribute("date");
%>
<!DOCTYPE html>
<html>
<head>
<title>健康状態記録/更新</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>
<body>
<p><font size="4">健康状態記録を更新しました</font></p>

<p>児童ID：<%= date.getPerson_id() %></p>

<p>身長：<%= date.getPerson_body() %></p>
<p>体重：<%= date.getPerson_check() %></p>
<p>体重の状態：<%= date.getPerson_datail() %>
<%
if(date.getPerson_datail() == 1){
	out.println("・やせ型");
}else if(date.getPerson_datail() == 2){
	out.println("・普通");
}else{
	out.println("・肥満");
}
%>
</p>
<p>アレルギー7品目：<%= date.getAllergies() %></p>
<p>アレルギー症状の程度：<%= date.getAllergies_degree() %>
<%
if(date.getAllergies_degree() ==1){
	out.println("・軽症");
} else if(date.getAllergies_degree() ==2){
	out.println("・重症");
} else if(date.getAllergies_degree() ==3){
	out.println("なし");
}
%>
</p>
<p>アレルギー備考欄：<%= date.getAllergies_remarks() %></p>
<p>病気・薬：<%= date.getChronic_condition() %></p>
<p>病気の対応：<%= date.getChronic_correspondence() %></p>
<p>不眠：<%= date.getInsomnia() %>
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
</p>
<p>不安・怯え：<%= date.getFrightened() %>
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

</p>
<p>抑うつ：<%= date.getDepression() %>
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
</p>
<p>精神症状備考欄：<%= date.getMental_remarks() %></p>
<p>自殺行為：<%= date.getSuicide() %>
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
</p>
<p>脱水症状：<%= date.getDehydration() %>
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
</p>
<p>栄養不足：<%= date.getMalnutrition() %>

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
%></p>
<p>偏食：<%= date.getUnbalanced_diet() %>
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
</p>
<p>偏食備考欄：<%= date.getUnbalanced_remarks() %></p>
<p>傷の部位：<%= date.getScratch_point() %></p>
<p>傷の数：<%= date.getScratch_number() %></p>
<p>傷の大きさ：<%= date.getScratch_size() %>
<%
if (date.getScratch_size() == 1){
	out.println("・大きい");
} else if (date.getScratch_size() == 2){
	out.println("・普通");
} else {
	out.println("・小さい");
}
%>
</p>
<p>傷の色：<%= date.getScratch_colour() %>
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
</p>
<p>傷の備考欄：<%= date.getScratch_remarks() %></p>
<p>障害の有無：<%= date.getHindrance() %>
<%
if (date.getHindrance() == 1){
	out.println("・ある");
} else if (date.getHindrance() ==2){
	out.println("・ない");
} else{
	out.println("・不明");
}
%>
</p>
<p>児童の備考欄：<%= date.getPerson_remarks() %></p>
<p>記入日：<%= date.getCreate_data() %></p>
<p><a href="/grad2021_groupA/Browsing">健康状態記録一覧に戻る</a></p>
</body>
</html>