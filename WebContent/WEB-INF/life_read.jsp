<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%
List<Life> list=(List<Life>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>生活状況</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</head>
<body>
<a href="/grad2021_groupA/Children_Create">新規登録</a>
<%if(list != null && list.size() > 0){ %>

<table class="table table-striped" border=1>
<tr><th>記録番号</th><th>児童ID</th><th>作成日</th><th>着脱衣</th><th>着脱衣備考欄</th><th>食事</th><th>食事形態</th><th>食事介助備考欄</th><th>排泄</th><th>排泄備考欄</th><th>対人関係</th><th>対人関係備考欄</th><th>集団行動</th><th>集団行動備考欄</th><th>安全管理</th><th>安全管理備考欄</th><th>指示理解</th><th>指示理解備考欄</th><th>発声</th><th>発声備考欄</th><th>読み</th><th>読み備考欄</th><th>書き</th><th>書き備考欄</th><th>数概念</th><th>計算</th><th>数概念その他</th><th>数の備考欄</th><th>行動特徴</th><th>備考欄</th></tr>

<%for(Life p:list){ %>

<tr>

<td><%=p.getPage_no()%></td>
<td><%=p.getPerson_id()%></td>
<td><%=p.getCreate_data() %></td>
<td><%=p.getDetachable() %></td>
<td><%=p.getDetachable_remarks() %></td>
<td><%=p.getMeal() %></td>
<td><%=p.getMeal_form() %></td>
<td><%=p.getMeal_form_remarks() %></td>
<td><%=p.getExcretion() %></td>
<td><%=p.getExcretion_remarks() %></td>
<td><%=p.getInterpersonal() %></td>
<td><%=p.getInterpersonal_remarks() %></td>
<td><%=p.getCollective() %></td>
<td><%=p.getCollective_remarks() %></td>
<td><%=p.getManagement() %></td>
<td><%=p.getManagement_remarks() %></td>
<td><%=p.getUnderstanding() %></td>
<td><%=p.getUnderstanding_remarks() %></td>
<td><%=p.getPhonation() %></td>
<td><%=p.getPhonation_remarks() %></td>
<td><%=p.getReading() %></td>
<td><%=p.getReading_remarks() %></td>
<td><%=p.getWriting() %></td>
<td><%=p.getWriting_remarks() %></td>
<td><%=p.getNumber_concept() %></td>
<td><%=p.getCalculation() %></td>
<td><%=p.getOther_concept() %></td>
<td><%=p.getNumber_remarks() %></td>
<td><%=p.getAction() %></td>
<td><%=p.getRemarks() %></td>





<td><a href="/grad2021_groupA/Children_Update?id=<%=p.getPerson_id()%>">編集</a>
<a href="/grad2021_groupA/Children_Delete?id=<%=p.getPerson_id()%>" onclick="return confirm('児童ID=<%=p.getPerson_id()%>を削除してよろしいですか？');">削除</a></td>

</tr>

<%} %>
</table>

<%} %>
<input type="submit" onclick="location.href='/grad2021_groupA/MenuServlet'" value="戻る">
</body>
</html>