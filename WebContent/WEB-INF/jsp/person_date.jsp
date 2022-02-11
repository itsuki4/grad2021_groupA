<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="person_date_model.*,java.util.*"%>
<%
Person person=(Person)request.getAttribute("person");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>詳細ページ</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">児童の詳細情報</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">児童の詳細情報</li>
                        </ol>
                        </div>
<div id="contents">
<div class="inner">
<div id="main">
<h2><%=person.getperson_name1()%>の詳細ページ</h2>
<article>
<table class="table table-striped" >
<tr>
<th>児童ID</th>
<td><%=person.getperson_id() %></td>
</tr>
<tr>
<th>児童氏名</th>
<td><%=person.getperson_name1()%></td>
</tr>
<tr>
<th>児童氏名（カタカナ）</th>
<td><%=person.getperson_name2()%></td>
</tr>
<tr>
<th>生年月日</th>
<td><%=person.getperson_birthday()%> </td>
</tr>
<tr>
<th>性別</th>
<td><%=person.getperson_gender() %></td>
</tr>
<tr>
<th>郵便番号</th>
<td>〒<%=person.getperson_address1()%> </td>
</tr>
<tr>
<th>都道府県名</th>
<td><%=person.getperson_address2()%></td>
</tr>
<tr>
<th>市町村名</th>
<td><%=person.getperson_address3()%></td>
</tr>
<tr>
<th>市町村名（カタカナ）</th>
<td><%=person.getperson_address4()%></td>
</tr>
<tr>
<th>受理日</th>
<td><%=person.getacceptance() %></td>
</tr>
<tr>
<th>就学状況</th>
<td><%=person.getperson_status() %></td>
</tr>
<tr>
<th>保護内容</th>
<td><%=person.getperson_protect() %></td>
</tr>
<tr>
<th>保護者名</th>
<td><%=person.getperson_parent1() %></td>
</tr>
<tr>
<th>保護者氏名（カタカナ）</th>
<td><%=person.getperson_parent2() %></td>
</tr>
<tr>
<th>保護者の職業</th>
<td><%=person.getparent_job() %></td>
</tr>
<tr>
<th>保護者の電話</th>
<td><%=person.getparent_phone() %></td>
</tr>
<tr>
<th>兄弟の名前（続柄）</th>
<td><%=person.getbrother1() %></td>
</tr>
<tr>
<th>兄弟の名前（カタカナ）</th>
<td><%=person.getbrother2() %></td>
</tr>
<tr>
<th>保護者の了解</th>
<td><%=person.getparent_ok() %></td>
</tr>
<tr>
<th>備考欄</th>
<td><%=person.getperson_remarks() %></td>
</tr>
</table>
</article>
</div>
</div>
</div>
<form action="">

<a href=/grad2021_groupA/PersonRead>一覧へ</a>

</form>
<%@ include file="basefooter.jsp" %>


</body>
</html>