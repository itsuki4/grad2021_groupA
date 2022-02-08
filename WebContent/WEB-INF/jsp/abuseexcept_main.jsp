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
<title>詳細一覧</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
<%if(List != null && List.size() > 0){ %>


<table class="table table-striped" >
<%for(AbuseExcept ps:List){ %>

<tr>
<th>児童ID</th>
<td><%=ps.getperson_id() %></td>
</tr>
<tr>
<th>保護内容</th>
<td><%=ps.getperson_protect()%></td>
</tr>
<tr>
<th>保護理由</th>
<td><%=ps.getexcept_reason()%> </td>
</tr>
<tr>
<th>今後の方向性<th>
<td><%=ps.getexcept_direction() %></td>
</tr>
<tr>
<th>対象者の状況</th>
<td><%=ps.getexcept_status()%> </td>
</tr>
<tr>
<th>現状と課題</th>
<td><%=ps.getexcept_task() %></td>
</tr>
<tr>
<th>備考欄</th>
<td><%=ps.getexcept_remarks() %></td>
</tr>



<%} %>
</table>

<%} %>
</body>
</html>