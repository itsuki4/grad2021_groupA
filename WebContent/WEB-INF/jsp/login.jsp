<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<h3>空き情報を編集するには施設のパスワードを入力してください。</h3>
<hr>
<form action="/grad2021_groupA/ShelterUpdate" method="post">
ID：<input type="text" name="Id" required><br>
パスワード：<input type="password" name="pass" required><br>
<input type="submit" value="ログイン"><br>
</form>
</body>
</html>