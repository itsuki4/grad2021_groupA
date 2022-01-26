<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.*,java.util.*"%>
<%@page import="java.sql.*" %>
<% Others_date date = (Others_date)request.getAttribute("date"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>その他情報提供者から</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>
<body>
<h1>その他情報提供者</h1>

<p>児童ID:<%= date.getPerson_id() %></p>
<p>氏名:<%= date.getProvider_name() %></p>
<p>氏名(カタカナ):<%= date.getProvider_name2() %></p>
<p></p>
<p>郵便番号:<%= date.getShelter_address1() %></p>
<p>都道府県:<%= date.getShelter_address2() %></p>
<p>市町村:<%= date.getShelter_address3() %></p>
<p>市町村(カタカナ):<%= date.getShelter_address4() %></p>
<p></p>
<p>情報源:<%= date.getSource() %></p>
<p>児童との関係:<%= date.getProvider_relationship() %></p>
<p>通告経緯:<%= date.getNotification() %></p>
<p>調査協力:<%= date.getCooperation() %></p>
<p>連絡許可:<%= date.getContact() %></p>
<p>提供内容:<%= date.getContents() %></p>
<p>備考欄:<%= date.getProvider_remarks() %></p>
<p>記録番号:<%= date.getPage_no() %></p>
</body>
</html>