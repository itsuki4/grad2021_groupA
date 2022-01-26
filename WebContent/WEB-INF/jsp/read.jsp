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
</head>
<body>
<a href="/grad2021_groupA/Person_Create">新規登録</a>
<%if(List != null && List.size() > 0){ %>


<table border='1'><tr><th>児童氏名</th><th>児童氏名　（カタカナ)　　</th><th>生年　月日</th><th>性別</th>
                  <th>郵便　番号</th><th>都道府県</th><th>市町村</th><th>市町村（カタカナ）</th>
<%for(Person ps:List){ %>

<tr>

<td><%=ps.getperson_name1()%></td>
<td><%=ps.getperson_name2()%></td>
<td><%=ps.getperson_birthday()%> </td>
<td><%=ps.getperson_gender() %></td>
<td><%=ps.getperson_address1()%> </td>
<td><%=ps.getperson_address2()%></td>
<td><%=ps.getperson_address3()%></td>
<td><%=ps.getperson_address4()%></td>
<td><a href="/grad2021_groupA/Person_Date_Main?id=<%=ps.getperson_id()%>">児童詳細</a></td>
<td><a href="/grad2021_groupA/Person_Update?id=<%=ps.getperson_id()%>">更新</a>
<a href="/grad2021_groupA/Person_Delete?id=<%=ps.getperson_id()%>" onclick="return confirm('id=<%=ps.getperson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>


<%} %>
</table>

<%} %>
</body>
</html>