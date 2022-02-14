<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一時保護所用のページ</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
</head>
<body>
<%@ include file="../jsp/baseNavber.jsp" %>
ここは一時保護所用ページです。<br>
<c:choose>
<c:when test="${account.staff_role == 2 }">
<div id="contents">
<div class="inner">
<div id="main">

<article><table class="ta1">

<tr><th>職員ID</th><td><c:out value="${account.staff_id }"></c:out></td></tr>
<tr><th>施設ID</th><td><c:out value="${account.shelter_id }"></c:out></td></tr>
<tr><th>名前</th><td><c:out value="${account.staff_name1 }"></c:out></td></tr>


</table>
</article>
</div></div></div>

<a href="/grad2021_groupA/Shelter_mypageServlet?id=<c:out value="${account.shelter_id }"></c:out>">施設の情報ページへ</a>
</c:when>
<c:when test="${account.staff_role == 1 }">
<a href="admin.jsp">管理者ページへ</a>
</c:when>
<c:otherwise>
<a href="login.jsp">ログインページへ</a>
</c:otherwise>
</c:choose>
<br><br><br><br><br><br><br><br><br><br><br><br>
<%@ include file="../jsp/basefooter.jsp" %>
</body>
</html>