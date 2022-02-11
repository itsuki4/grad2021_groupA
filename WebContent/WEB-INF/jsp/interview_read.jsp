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
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">面談内容</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">面談内容</li>
                        </ol>
                        </div>
<a href="/grad2021_groupA/InterviewCreate">新規登録</a>
<%if(List != null && List.size() > 0){ %>


<table class="table table-striped"><tr><th>児童氏名</th><th>面談実施日　　</th><th>スタッフ名</th>

<%for(Interview ps:List){ %>

<tr>

<td><%=ps.getperson_name1()%></td>
<td><%= ps.getinterview_date()%></td>
<td><%= ps.getstaff_name1()%></td>
<td><a href="/grad2021_groupA/Interview_Main?id=<%=ps.getperson_id()%>">児童詳細</a></td>
<td><a href="/grad2021_groupA/InterviewUpdate?id=<%=ps.getperson_id()%>">更新</a>
<a href="/grad2021_groupA/InterviewDelete?id=<%=ps.getperson_id()%>" onclick="return confirm('id=<%=ps.getperson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
<%@ include file="basefooter.jsp" %>
</body>
</html>