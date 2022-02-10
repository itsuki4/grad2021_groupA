<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%
List<Person> list=(List<Person>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>児童一覧</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</head>
<body>
<h2>児童一覧(児童相談所)</h2>
<input type="submit" onclick="location.href='/grad2021_groupA/Children_Create'" value="新規登録">
<%if(list != null && list.size() > 0){ %>

<table class="table table-striped">
<tr><th>児童ID</th><th>児童名前</th><th>児童名前（カナ）</th><th>保護者名</th><th>保護者名（カナ）</th><th>施設ID</th><th>施設名</th><th>施設名（カナ）</th><th>登録日</th><th>削除日</th><th></th></tr>

<%for(Person p:list){ %>

<tr>

<td><%=p.getPerson_id()%></td>
<td><%=p.getPerson_name1()%></td>
<td><%=p.getPerson_name2() %></td>
<td><%=p.getPerson_parent1()%></td>
<td><%=p.getPerson_parent2()%></td>
<td><%=p.getShelter_id()%></td>
<td><%=p.getShelter_name1()%></td>
<td><%=p.getShelter_name2()%></td>
<td><%=p.getPerson_start()%> </td>
<td><%=p.getPerson_end()%></td>




<td><a href="/grad2021_groupA/Children_Update?id=<%=p.getPerson_id()%>">編集</a>
<a href="/grad2021_groupA/Children_Delete?id=<%=p.getPerson_id()%>" onclick="return confirm('児童ID=<%=p.getPerson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
<%--<a href="/grad2021_groupA/Children_Create">新規登録</a>--%>

<%-- <input type="submit" onclick="location.href='/grad2021_groupA/MenuServlet'" value="戻る">--%>
</body>
</html>