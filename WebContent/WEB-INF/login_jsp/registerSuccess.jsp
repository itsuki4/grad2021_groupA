<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録完了</title>
</head>
<body>
新規登録が完了しました!
<form action="/grad2021_groupA/AccountRegister" method="post">
<table>

<tr><th>職員ID</th><td><c:out value="${account.staff_id }"></c:out></td></tr>
<tr><th>施設ID</th><td><c:out value="${account.shelter_id }"></c:out></td></tr>
<tr><th>名前</th><td><c:out value="${account.staff_name1 }"></c:out></td></tr>

</table>
<input type="submit" value="登録"><br>
</form>

</body>
</html>