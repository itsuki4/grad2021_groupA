<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<form action="/grad2021_groupA/AccountLoginServlet" method="post">
<p>
<input type="radio" name="staff_role" value="1">管理者ユーザ
<input type="radio" name="staff_role" value="2" checked>職員ユーザ
</p>
　　施設ID：<input type="text" name="shelter_id" required><br>
ユーザー名：<input type="text" name="staff_name1" required><br>
ユーザー名（カタカナ）：<input type="text" name="staff_name2" required><br>
パスワード：<input type="password" name="staff_pass" required><br>
<input type="submit" value="ログイン"><br>
</form>

</body>
</html>