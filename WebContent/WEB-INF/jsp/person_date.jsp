<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="person_date_model.*,java.util.*"%>
<%
List<Person> List = (List<Person>) request.getAttribute("List");
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
<%for(Person ps:List){ %>

<tr>
<th>児童ID</th>
<td><%=ps.getperson_id() %></td>
</tr>
<tr>
<th>児童氏名</th>
<td><%=ps.getperson_name1()%></td>
<td><%=ps.getperson_name2()%></td>
</tr>
<tr>
<th>生年月日</th>
<td><%=ps.getperson_birthday()%> </td>
</tr>
<tr>
<th>性別<th>
<td><%=ps.getperson_gender() %></td>
</tr>
<tr>
<th>住所</th>
<td>〒<%=ps.getperson_address1()%> </td>
<td><%=ps.getperson_address2()%></td>
<td><%=ps.getperson_address3()%></td>
<td><%=ps.getperson_address4()%></td>
</tr>
<tr>
<th>受理日</th>
<td><%=ps.getacceptance() %></td>
</tr>
<tr>
<th>就学状況</th>
<td><%=ps.getperson_status() %></td>
</tr>



<%} %>
</table>

<%} %>
</body>
</html>