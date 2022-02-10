<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>確認</h1>
<form action="/grad2021_groupA/AccountRegister" method="post">
<table>

<tr><th>名前</th><td><c:out value="${account.staff_name1 }"></c:out><c:out value="${account.staff_name2 }"></c:out></td></tr>
<tr><th>施設ID</th><td><c:out value="${account.shelter_id }"></c:out></td></tr>
<tr><th>パスワード</th><td><c:out value="${account.staff_pass }"></c:out></td></tr>
<tr><th>ロール</th><td><c:out value="${account.staff_role }"></c:out></td></tr>
<tr><th>管理者権限</th><td><c:out value="${account.admin_role }"></c:out></td></tr>
</table>
<input type="submit" value="登録"><br>
</form>
</body>
</html>