<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
<header>
<div class="p">
<br>
<p class="pp"><font size="3">管理者でログインしています</font></p>
</div>
</header>
<div class="div">
<nav>
<ul>
<li><a href="/grad2021_groupA/Read">児童一覧</a><br></li>
<li><a href="/grad2021_groupA/Shelter_DateServlet">空き情報</a><br></li>
<li><a href="/grad2021_groupA/Interview_Main">面談内容</a><br></li>
<li><a href="/grad2021_groupA/Abuse_Except_Main">虐待以外</a><br></li>
<li><a href="/grad2021_groupA/Browsing">健康状態</a><br></li>
<li><a href="/grad2021_groupA/Logout">ログアウト</a></li>
</ul>
</nav>
</div>
<div class="bgc"></div>
</body>
</html>