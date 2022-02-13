<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="login_model.*,java.util.*"%>
<%
List<Account> List = (List<Account>) request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>管理者サイト</h2>
<a href="/grad2021_groupA/AccountRegisterJs">新規会員登録</a>
<%if(List != null && List.size() > 0){ %>
<table>
<tr>
<th>職員ID</th><th>名前</th><th>パスワード</th><th>ロール</th><th>管理者権限</th>
</tr>
<%for(Account ps:List){ %>
<tr>
<td><%=ps.getStaff_id()%></td>
<td><%=ps.getStaff_name1()%><br><%=ps.getStaff_name2()%></td>
<td><%=ps.getStaff_pass()%></td>
<%if(ps.getStaff_role() == 1){ %>
<td>一時保護所</td>
<%}else if(ps.getStaff_role() == 2){ %>
<td>児童相談所</td>
<%} %>
<%if(ps.getAdmin_role() == 1){ %>
<td>あり</td>
<%}else if(ps.getAdmin_role() == 2){ %>
<td>なし</td>
<%} %>
<td><a href="/grad2021_groupA/AccountChangeServlet?id=<%=ps.getStaff_id()%>">変更</a></td>
</tr>
<%} %>
</table>

<%} %>
</body>
</html>