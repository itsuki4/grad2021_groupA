
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%
List<Children> list=(List<Children>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>児童一覧(一時保護所)</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
<%@ include file="navNav.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">児童一覧(一時保護所)</h1>
                        <ol class="breadcrumb mb-4">
                        </ol>
                        </div>
<input type="submit" onclick="location.href='/grad2021_groupA/PersonCreate'" value="新規登録">
<%if(list != null && list.size() > 0){ %>

<table class="table table-striped">
<tr><th>児童ID</th><th>児童名前</th><th>児童名前（カナ）</th><th>保護者名</th><th>保護者名（カナ）</th><th>施設ID</th><th>施設名</th><th>施設名（カナ）</th><th>登録日</th><th>削除日</th><th></th></tr>

<%for(Children p:list){ %>

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



<td><a href="/grad2021_groupA/Person_Date_Main?id=<%=p.getPerson_id()%>">児童詳細</a><br>
<a href="/grad2021_groupA/Interview_Read?id=<%=p.getPerson_id()%>">面談内容</a><br>
<a href="/grad2021_groupA/BrowsingDetailServlet?id=<%=p.getPerson_id()%>">健康状態</a></td>
<td><a href="/grad2021_groupA/PersonUpdate?id=<%=p.getPerson_id()%>">編集</a>
<a href="/grad2021_groupA/PersonDelete?id=<%=p.getPerson_id()%>" onclick="return confirm('児童ID=<%=p.getPerson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
<%@ include file="basefooter.jsp" %>
<%--<a href="/grad2021_groupA/Children_Create">新規登録</a>--%>

<%-- <input type="submit" onclick="location.href='/grad2021_groupA/MenuServlet'" value="戻る">--%>
</body>
</html>
