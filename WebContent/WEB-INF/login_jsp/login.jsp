<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<form action="/grad2021_groupA/AccountSearch" method="post">
ユーザーID：<input type="text" name="loginId" required><br>
パスワード：<input type="password" name="pass" required><br>
<input type="submit" value="ログイン"><br>
</form>
<p>
アカウント登録がお済みでない方はこちらへ↓<br>
<a href="/grad2021_groupA/AccountRegisterJs"><button>新規登録</button></a>
</p>
</body>
</html>