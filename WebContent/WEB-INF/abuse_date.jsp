<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="model.*,java.util.*"%>

<%@page import="java.sql.*" %>
<%

List<Abuse> list=(List<Abuse>)request.getAttribute("list");
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8"/>

<title>虐待詳細</title>

</head>

<body>

<a href="/grad2021_groupA/Abuse_create">新規登録</a>

<%if(list != null && list.size() > 0){ %>



<table class="table table-striped">

<tr><th>保護内容</th><th>児童ID</th><th>家族構成</th><th>虐待種類</th><th>虐待の程度</th><th>虐待の継続</th><th>身体の状態</th><th>精神的状態</th><th>日常的世話の欠如</th><th>意識気持ち</th><th>問題行動</th><th>家族問題</th><th>経済問題</th><th>生活環境</th><th>養育者の性格的問題</th><th>養育者の精神的問題</th><th>養育者の家事・育児能力</th><th>子供への感情</th><th>虐待の自覚</th><th>ネグレクト</th><th>養育知識</th><th>社会的サポート</th><th>協力態度</th><th>援助効果</th><th>子供の意見</th><th>親の意見</th><th>当面の課題</th><th>支援の方向</th><th>記入日</th><th>備考欄</th></tr>



<%for(Abuse p:list){ %>



<tr>



<td><%=p.getPerson_protect()%></td>

<td><%=p.getPerson_id()%></td>

<td><%=p.getFamily_structure() %></td>

<td><%=p.getAbuse_kinds()%></td>

<td><%=p.getAbuse_degree()%></td>

<td><%=p.getAbuse_continuation()%></td>

<td><%=p.getPhysical_condition()%></td>

<td><%=p.getMental_condition()%></td>

<td><%=p.getDaily_lack()%> </td>

<td><%=p.getConsciousness()%></td>

<td><%=p.getProblem_behavior()%></td>

<td><%=p.getFamily_problems()%></td>

<td><%=p.getEconomy_problem()%></td>

<td><%=p.getLiving_environment()%></td>

<td><%=p.getCaregiver_personality()%></td>

<td><%=p.getCaregiver_mental()%></td>

<td><%=p.getCaregiver_childcare()%></td>

<td><%=p.getChildren_emotions()%></td>

<td><%=p.getAbuse_awareness()%></td>

<td><%=p.getNeglect()%></td>

<td><%=p.getChildcare_knowledge()%></td>

<td><%=p.getSocial_support()%></td>

<td><%=p.getCooperation_attitude()%></td>

<td><%=p.getAid_effect()%></td>

<td><%=p.getChildrens_opinion()%></td>

<td><%=p.getParental_opinion()%></td>

<td><%=p.getImmediate_issues()%></td>

<td><%=p.getDirection_support()%></td>

<td><%=p.getCreate_data()%></td>

<td><%=p.getRemarks()%></td>







</tr>


<%} %>

</table>



<%} %>

<input type="submit" onclick="location.href='/grad2021_groupA/MenuServlet'" value="戻る">

</body>

</html>