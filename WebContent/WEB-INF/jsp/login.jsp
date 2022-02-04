<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者ログイン画面</title>
</head>
<body>
<form action="/grad2021_groupA/LoginServlet" method="post">
管理者ID:<input type="text" name="admin_id"><br>
パスワード:<input type="password" name="admin_pass"><br>
<input type="submit" value="ログイン">
</form>
</body>
</html>