<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="interview_model.*,java.util.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%
List<Interview> List = (List<Interview>) request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>詳細一覧</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<a href="/grad2021_groupA/InterviewCreate">新規登録</a>
<%if(List != null && List.size() > 0){ %>


<table class="table table-striped"><tr><th>児童氏名</th><th>面談実施日　　</th><th>スタッフ名</th>

<%for(Interview ps:List){ %>

<tr>

<td><%=ps.getperson_name1()%></td>
<td><%= ps.getinterview_date()%></td>
<td><%= ps.getstaff_name1()%></td>
<td><a href="/grad2021_groupA/Interview_Main">児童詳細</a></td>
<td><a href="/grad2021_groupA/InterviewUpdate?id=<%=ps.getperson_id()%>">更新</a>
<a href="/grad2021_groupA/InterviewDelete?id=<%=ps.getperson_id()%>" onclick="return confirm('id=<%=ps.getperson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
</body>
</html>