<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>児童の新規追加</title>
<%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/children.css">--%>
</head>
<body>
<h3>新規児童の登録</h3>
<form action="/grad2021_groupA/Children_Create" method="post">
<table>

<tr>
	<td>児童名前</td>
	<td class="td"><input type="text" name="person_name1"><br></td>
</tr>
<tr>
	<td>児童名前（カナ）</td>
	<td class="td"><input type="text" name="person_name2"><br></td>
</tr>
<tr>
	<td>保護者名</td>
	<td class="td"><input type="text" name="person_parent1"><br></td>
</tr>
<tr>
	<td>保護者名（カナ）</td>
	<td class="td"><input type="text" name="person_parent2"><br></td>
</tr>
<tr>
	<td>施設ID</td>
	<td class="td"><input type="number" name="shelter_id"><br></td>
</tr>
<tr>
	<td>施設名</td>
	<td class="td"><input type="text" name="shelter_name1"><br></td>
</tr>
<tr>
	<td>施設名（カナ）</td>
	<td class="td"><input type="text" name="shelter_name2"><br></td>
</tr>
<tr>
	<td>登録日</td>
	<td class="td"><input type="text" name="person_start"><br></td>
</tr>
<tr>
	<td>削除日</td>
	<td class="td"><input type="text" name="person_end"><br></td>
</tr>
<tr>
	<td><button type="submit">登録</button></td>
</tr>

</table>
</form>
<br>
<input type="submit" onclick="location.href='/grad2021_groupA/Read'" value="キャンセル">


</body>
</html>