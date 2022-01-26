<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>生活状況登録</title>
</head>
<body>

<form action="/grad2021_groupA/Life_Create" method="post" >
記録番号:<input type="text" name="page_no"><br>
児童ID:<input type="number" name="person_id"><br>
着脱衣：<input type="number" name="detachable"><br>
着脱衣備考欄：<input type="text" name="detachable_remarks"><br>
食事：<input type="number" name="meal"><br>
食事形態：<input type="number" name="meal_form"><br>
食事介助備考欄：<input type="text" name="meal_form_remarks"><br>
排泄：<input type="number" name="excretion"><br>
排泄備考欄：<input type="text" name="excretion_remarks"><br>
対人関係：<input type="number" name="interpersonal"><br>
対人関係備考欄：<input type="text" name="interpersonal_remarks"><br>
集団行動：<input type="number" name="collective"><br>
集団行動備考欄：<input type="text" name="collective_remarks"><br>
安全管理：<input type="number" name="management"><br>
安全管理備考欄：<input type="text" name="management_remarks"><br>
指示理解：<input type="number" name="understanding"><br>
指示理解備考欄：<input type="text" name="understanding_remarks"><br>
発声：<input type="number" name="phonation"><br>
発声備考欄：<input type="text" name="phonation_remarks"><br>
読み：<input type="number" name="reading"><br>
読み備考欄：<input type="text" name="reading_remarks"><br>
書き：<input type="number" name="writing"><br>
書き備考欄：<input type="text" name="writing_remarks"><br>
数概念：<input type="number" name="number_concept"><br>
計算：<input type="number" name="calculation"><br>
数概念その他：<input type="text" name="other_concept"><br>
数の備考欄：<input type="text" name="number_remarks"><br>
行動特徴：<input type="text" name="action"><br>
全部の備考欄：<input type="text" name="remarks"><br>

<button type="submit">登録</button>
</form>

</body>
</html>