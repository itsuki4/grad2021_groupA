<%@ page language="java" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入所条件の検索</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">

</head>
<body>
<div id="contents">
<div class="inner">
<div id="main">
<h2>条件の検索</h2>
<form action="/grad2021_groupA/ShelterVacancyServlet" method="get">
<input type="text" name="vacancy">
<input type="submit" value="検索" >
</form>
<br>
<h2>複数の条件検索</h2>
<form action="/grad2021_groupA/ShelterVacancyServlet" method="get">
<article><table class="ta1">
<tr>

<th><h3>性別</h3></th>
<td><input type="checkbox" name="vacancy" value="女"><label for="Hokkaidô">女子</label>
<input type="checkbox" name="vacancy" value="男"><label for="Aomori">男子</label>

</td></tr>
<tr><th>
<h3>学校</h3></th>
<td><input type="checkbox" name="vacancy" class="ibaraki" value="幼稚園"><label for="Ibaraki">幼稚園</label>
<input type="checkbox" name="vacancy" class="totigi" value="保育園"><label for="Totigi">保育園</label>
<input type="checkbox" name="vacancy" class="gunma" value="小学生"><label for="Gunma">小学生</label>
<input type="checkbox" name="vacancy" class="saitama" value="中学生"><label for="Saitama">中学生</label>
<input type="checkbox" name="vacancy" class="tiba" value="高校生"><label for="Tiba">高校生</label>
</td></tr>

</table>
<br><input type="submit" value="検索">
</article>
</form>
<a href="/grad2021_groupA/shelter_addServlet">都道府県検索へ</a>
</div>
</div>
</div>

</body>
</html>