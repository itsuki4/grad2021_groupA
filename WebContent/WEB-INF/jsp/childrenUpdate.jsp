
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%
Children children=(Children)request.getAttribute("children");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>編集画面</title>
</head>
<body>
<form action="/grad2021_groupA/PersonUpdate" method="post">
<table>

<tr>
	<td>児童名前</td>
	<td class="td"><input type="text" name="person_name1"value="<%=children.getPerson_name1() %>"><br></td>
</tr>
<tr>
	<td>児童名前（カナ）</td>
	<td class="td"><input type="text" name="person_name2"value="<%=children.getPerson_name2() %>"><br></td>
</tr>
<tr>
	<td>保護者名</td>
	<td class="td"><input type="text" name="person_parent1"value="<%=children.getPerson_parent1() %>"><br></td>
</tr>
<tr>
	<td>保護者名（カナ）</td>
	<td class="td"><input type="text" name="person_parent2"value="<%=children.getPerson_parent2() %>"><br></td>
</tr>
<tr>
	<td>施設ID</td>
	<td class="td"><input type="number" name="shelter_id"value="<%=children.getShelter_id() %>"><br></td>
</tr>
<tr>
	<td>施設名</td>
	<td class="td"><input type="text" name="shelter_name1"value="<%=children.getShelter_name1() %>"><br></td>
</tr>
<tr>
	<td>施設名（カナ）</td>
	<td class="td"><input type="text" name="shelter_name2"value="<%=children.getShelter_name2() %>"><br></td>
</tr>
<tr>
	<td>登録日</td>
	<td class="td"><input type="text" name="person_start"value="<%=children.getPerson_start() %>"><br></td>
</tr>
<tr>
	<td>削除日</td>
	<td class="td"><input type="text" name="person_end"value="<%=children.getPerson_end() %>"><br></td>
</tr>
<tr>
	<td><input type="hidden" name="id" value="<%=children.getPerson_id() %>"><br></td>
</tr>
<tr>
	<td><button type="submit">更新</button>
	<input type="submit" onclick="location.href='/grad2021_groupA/Person_Read'" value="キャンセル"></td>
</tr>
</table>



</form>
</body>
</html>
