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
	<td class="td">
	<select name="shelter_id">
<option value="100000">100000</option>
<option value="100001">100001</option>
<option value="100002">100002</option>
<option value="100003">100003</option>
<option value="100004">100004</option>
<option value="100005">100005</option>
<option value="100006">100006</option>
<option value="100007">100007</option>
<option value="100008">100008</option>
<option value="100009">100009</option>
<option value="100010">100010</option>

	</select></td>
</tr>
<%--
<tr>
	<td>一時保護所ID</td>
	<td class="td"><input type="number" name="shelter_id"><br></td>
</tr>
<tr>
		<td>入所先</td>
		<td><select name="shelter_ok">
              <option value="決定">決定</option>
              <option value="未決定">未決定</option>
            </select>
        </td>
</tr>
--%>
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
<input type="submit" onclick="location.href='/grad2021_groupA/Children_Read'" value="キャンセル">


</body>
</html>