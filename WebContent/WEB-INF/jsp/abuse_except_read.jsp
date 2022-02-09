<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="abuse_except_model.*,java.util.*"%>
<%
List<AbuseExcept> List = (List<AbuseExcept>) request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>虐待以外の情報一覧</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<a href="/grad2021_groupA/Abuse_ExceptCreate">新規登録</a>
<%if(List != null && List.size() > 0){ %>


<table class="table table-striped"><tr><th>児童ID</th><th>保護内容</th><th>保護理由</th><th>今後の方向性</th><th>対象者の状況</th><th>現状と課題</th><th>備考欄</th>

<%for(AbuseExcept ps:List){ %>

<tr>
<td><%=ps.getperson_id()%></td>
<td><%=ps.getperson_protect()%></td>
<td><%= ps.getexcept_reason()%></td>
<td><%= ps.getexcept_direction()%></td>
<td><%= ps.getexcept_status()%></td>
<td><%= ps.getexcept_task()%></td>
<td><%= ps.getexcept_remarks()%></td>
<td><a href="/grad2021_groupA/Abuse_ExceptMain?id=<%=ps.getperson_id()%>">児童詳細</a></td>
<td><a href="/grad2021_groupA/Abuse_ExceptUpdate?id=<%=ps.getperson_id()%>">更新</a>
<a href="/grad2021_groupA/Abuse_ExceptDelete?id=<%=ps.getperson_id()%>" onclick="return confirm('id=<%=ps.getperson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
</body>
</html>