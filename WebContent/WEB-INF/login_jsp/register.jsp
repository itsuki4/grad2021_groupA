<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<form action="/grad2021_groupA/AccountRegister" method="post">
<p>すべて入力してください</p>
<p>
<input type="radio" name="staff_role" value="1">児童相談所
<input type="radio" name="staff_role" value="2" checked>一時保護所で登録する
</p>
<p>
<h2>管理者権限をあたえますか？</h2>

<input type="radio" name="admin_role" value="1">管理者
<input type="radio" name="admin_role" value="2" checked>職員で登録する
</p>
　施設ID：<input type="text" name="shelter_id" required><br>
　　　名前：<input type="text" name="staff_name1" required><br>
　　　名前(カタカナ)：<input type="text" name="staff_name2" required><br>
パスワード：<input type="password" name="staff_pass" required><br>
<input type="submit" value="登録"><br>
</form>
</body>
</html>