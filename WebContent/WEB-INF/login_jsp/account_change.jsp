<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8" import="login_model.*,java.util.*"%>

<% Account s = (Account)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
</head>
<body>
<h1>変更します。</h1>
<form action="/grad2021_groupA/AccountChangeServlet" method="post">
<input type="hidden" name="staff_id" value="<%=s.getStaff_id()%>">

<table>

<tr><th>職員ID</th><td><%=s.getStaff_id()%></td></tr>
<tr><th>施設ID</th><td><input type="text" name="shelter_id" value="<%=s.getShelter_id()%>"></td></tr>
<tr><th>名前</th><td><input type="text" name="staff_name1" value="<%=s.getStaff_name1()%>">
<br><input type="text" name="staff_name2" value="<%=s.getStaff_name2()%>"></td></tr>
<tr><th>パスワード</th><td><input type="text" name="staff_pass" value="<%=s.getStaff_pass()%>"></td></tr>
<tr><th>ロール</th>
<%if(s.getStaff_role() == 1){ %>
<td>一時保護所</td>
<%}else if(s.getStaff_role() == 2){ %>
<td>児童相談所</td>
<%} %>
</tr>
<tr><th>管理者権限</th>
<%if(s.getAdmin_role() == 1){ %>
<td>あり</td>
<%}else if(s.getAdmin_role() == 2){ %>
<td>なし</td>
<%} %>
<td><input type="submit" value="決定" ></td>

</tr>
</form>
</body>
</html>