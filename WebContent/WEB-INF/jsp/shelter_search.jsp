<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%@ include file="baseNavber.jsp" %>

<a href="/grad2021_groupA/Shelter_mypageServlet?id=2000">2001マイページへ</a>
<a href="/grad2021_groupA/Shelter_mypageServlet?id=2001">2002マイページへ</a>
<a href="/grad2021_groupA/shelter_addServlet">都道府県検索</a>
<a href="/grad2021_groupA/shelterConditionServlet">条件検索</a>
<a href="/grad2021_groupA/AccountRegisterJs">新規会員登録</a>

<a href="/grad2021_groupA/LoginServlet">職員のログイン画面</a>
<a href="/grad2021_groupA/AdminLoginServlet">管理者のログイン画面</a>



<%@ include file="basefooter.jsp" %>
</body>
</html>