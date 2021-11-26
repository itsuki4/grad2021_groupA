<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Health_date date = (Health_date)request.getAttribute("date"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康状態詳細</title>
</head>
<body>
<h1>健康状態詳細情報</h1>

<p>児童ID：<%= date.getPerson_id() %></p>
<p>身長：<%= date.getPerson_body() %></p>
<p>体重：<%= date.getPerson_check() %></p>
<p>体重の状態：<%= date.getPerson_datail() %></p>
<p>アレルギー7品目：<%= date.getAllergies() %></p>
<p>アレルギー症状の程度：<%= date.getAllergies_degree() %></p>
<p>アレルギー備考欄：<%= date.getAllergies_remarks() %></p>
<p>病気・薬：<%= date.getChronic_condition() %></p>
<p>病気の対応：<%= date.getChronic_correspondence() %></p>
<p>不眠：<%= date.getInsomnia() %></p>
<p>不安・怯え：<%= date.getFrightened() %></p>
<p>抑うつ：<%= date.getDepression() %></p>
<p>精神症状備考欄：<%= date.getMental_remarks() %></p>
<p>自殺行為：<%= date.getSuicide() %></p>
<p>脱水症状：<%= date.getDehydration() %></p>
<p>栄養不足：<%= date.getMalnutrition() %></p>
<p>偏食：<%= date.getUnbalanced_diet() %></p>
<p>偏食備考欄：<%= date.getUnbalanced_remarks() %></p>
<p>傷の部位：<%= date.getScratch_point() %></p>
<p>傷の数：<%= date.getScratch_number() %></p>
<p>傷の大きさ：<%= date.getScratch_size() %></p>
<p>傷の色：<%= date.getScratch_colour() %></p>
<p>傷の備考欄：<%= date.getScratch_remarks() %></p>
<p>障害の有無：<%= date.getHindrance() %><p>
<p>児童の備考欄：<%= date.getPerson_remarks() %></p>
<p>記入日：<%= date.getCreate_data() %></p>
</body>
</html>