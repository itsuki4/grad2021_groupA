<%@ page language="java" contentType="text/html;  charset=Windows-31J" pageEncoding="UTF-8"
import="interview_model.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>面談内容の追加</title>
<link rel=”stylesheet” type=”text/css” href=”grad2021_groupA/css/style.css”>
</head>
<body>
<form action="/grad2021_groupA/InterviewCreate" method="post">
<p>児童氏名：</p>
<input type="text" name="person_name1">
<p>職員ID：</p>
<input type="text" name="staff_id" >
<p>職員名:</p>
<input type="text" name="staff_name1"><br>
協力態度:<select name="cooperation_attitude">
          <option value="はい">はい</option>
          <option value="やや">やや</option>
          <option value="いいえ">いいえ</option>
          <option value="疑い">疑い</option>
          <option value="不明">不明</option>
          </select>
子供への感情の変化:<select name="emotional_changes">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select><br>
保護者の性格的問題の経過状況:<select name="personality_progress">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select>
保護者の精神的問題の経過状況:<select name="mental_progress">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select>
<p>親の意見</p>
<input type="text" name="parental_opinion">
<p>当面の課題</p>
<input type="text" name="immediate_issues">
<p>今後の方針</p>
<input type="text" name="future_tasks">
<p>備考欄</p>
<input type="text" name="personality_remarks"><br>
<input type="hidden" name="person_id"><br>

<button type="submit">更新</button>
</form>

</body>
</html>