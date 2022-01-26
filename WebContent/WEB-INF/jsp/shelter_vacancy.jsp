<%@ page language="java" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入所条件の検索</title>
</head>
<body>

<form action="/grad2021_groupA/ShelterVacancyServlet" method="get">
<input type="text" name="vacancy">
<input type="submit" value="送信する" >
</form>

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
<br><input type="submit" value="送信する">
</article>
</form>


</body>
</html>