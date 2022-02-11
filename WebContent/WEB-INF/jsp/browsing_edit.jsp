
<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8" import="model.*"%>
<%@page import="java.sql.*"%>
<%
Health_date date = (Health_date)request.getAttribute("date");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康状態記録/編集</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">健康状態記録</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">健康状態記録</li>
                        </ol>
                        </div>
<p><font size="6">健康状態記録・編集</font></p>
<form action="/grad2021_groupA/BrowsingUpdate?id=<%= date.getPerson_id() %>" method= "post">

<p>児童ID：<%= date.getPerson_id() %></p>
<p>身長：<input type = "text" name ="person_body"  value ="<%= date.getPerson_body() %>"></p>
<p>体重：<input type="text" name ="person_check" value="<%= date.getPerson_check() %>"></p>
<p>体重の状態：
<input type="radio" name ="person_datail" value ="1"checked>
<label for="1">やせ型</label>
<input type="radio" name ="person_datail" value ="2">
<label for="2">普通</label>
<input type="radio" name = "person_datail"value ="3">
<label for="3">肥満</label>
</p>
<p>アレルギー7品目：<input type="text" name = "allergies" value ="<%= date.getAllergies() %>"></p>
<p>アレルギー症状の程度：
<input type= "radio" name="allergies_degree" value ="1"checked>
<label for="1">軽症</label>
<input type= "radio" name="allergies_degree" value ="2">
<label for="2">重症</label>
<input type= "radio" name="allergies_degree" value ="3">
<label for="3">なし</label>
</p>
<p>アレルギー備考欄：<input type= "text"name ="allergies_remarks" value ="<%= date.getAllergies_remarks() %>"></p>
<p>病気・薬：<input type="text" name= "chronic_condition" value= "<%= date.getChronic_condition() %>"></p>
<p>病気の対応：<input type ="text"name ="chronic_correspondence" value ="<%= date.getChronic_correspondence() %>"></p>
<p>不眠：
<input type="radio" name ="insomnia" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="insomnia" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="insomnia" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="insomnia" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="insomnia" value="5">
<label for="5">不明</label>
</p>
<p>不安・怯え：
<input type="radio" name ="frightened" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="frightened" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="frightened" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="frightened" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="frightened" value="5">
<label for="5">不明</label>
</p>
<p>抑うつ：
<input type="radio" name ="depression" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="depression" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="depression" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="depression" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="depression" value="5">
<label for="5">不明</label>
</p>
<p>精神症状備考欄：<input type="text"name = "mental_remarks" value ="<%= date.getMental_remarks() %>"></p>
<p>自殺行為：
<input type="radio" name ="suicide" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="suicide" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="suicide" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="suicide" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="suicide" value="5">
<label for="5">不明</label>
</p>
<p>脱水症状：
<input type="radio" name ="dehydration" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="dehydration" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="dehydration" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="dehydration" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="dehydration" value="5">
<label for="5">不明</label>
</p>
<p>栄養不足：
<input type="radio" name ="malnutrition" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="malnutrition" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="malnutrition" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="malnutrition" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="malnutrition" value="5">
<label for="5">不明</label>
</p>
<p>偏食：
<input type="radio" name ="unbalanced_diet" value="1" checked>
<label for="1">当てはまる</label>
<input type="radio" name ="unbalanced_diet" value="2">
<label for="2">やや当てはまる</label>
<input type="radio" name ="unbalanced_diet" value="3">
<label for="3">やや当てはまらない</label>
<input type="radio" name ="unbalanced_diet" value="4">
<label for="4">当てはまらない</label>
<input type="radio" name ="unbalanced_diet" value="5">
<label for="5">不明</label>
</p>
<p>偏食備考欄：<input type ="text" name ="unbalanced_remarks" value ="<%= date.getUnbalanced_remarks() %>"></p>
<p>傷の部位：<input type ="text"name ="scratch_point" value ="<%= date.getScratch_point() %>"></p>
<p>傷の数：<input type ="text" name ="scratch_number" value="<%= date.getScratch_number() %>"></p>
<p>傷の大きさ：
<input type="radio" name ="scratch_size" value="1" checked>
<label for="1">大きい</label>
<input type="radio" name ="scratch_size" value="2">
<label for="2">普通</label>
<input type="radio" name ="scratch_size" value ="3">
<label for="3">小さい</label>
</p>
<p>傷の色：
<input type="radio" name ="scratch_colour" value="1" checked>
<label for="1">赤色</label>
<input type="radio" name ="scratch_colour" value="2">
<label for="2">赤紫色</label>
<input type="radio" name ="scratch_colour" value ="3">
<label for="3">黄色</label>
<input type="radio" name ="scratch_colour" value ="4">
<label for="4">当てはまらない</label>
</p>
<p>傷の備考欄：<input type ="text" name ="scratch_remarks" value="<%= date.getScratch_remarks() %>"></p>
<p>障害の有無：
<input type="radio" name ="hindrance" value="1" checked>
<label for="1">あり</label>
<input type="radio" name ="hindrance" value="2">
<label for="2">なし</label>
<input type="radio" name ="hindrance" value="3">
<label for="3">不明</label>
</p>
<p>児童の備考欄：<input type ="text" name ="person_remarks" value ="<%= date.getPerson_remarks() %>"></p>
<p><input type ="hidden" name ="person_id" value="<%=date.getPerson_id() %>"></p>

<input type = "submit" value ="更新">
</form><form action="">
<p>
<a href=/grad2021_groupA/Browsing>一覧へ</a>
</p>
</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>
