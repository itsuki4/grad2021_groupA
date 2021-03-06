<%@ page language="java" contentType="text/html;  charset=Windows-31J" pageEncoding="UTF-8"
import="interview_model.*"%>
<% Interview interview=(Interview)request.getAttribute("interview");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>面談内容の追加</title>
<link rel="stylesheet" href="/grad2021_groupA/css/style.css">
<body>
<form action="/grad2021_groupA/InterviewCreate" method="post">
<table class="row">
<tr><th align="left">　　職員ID</th><td><input type="text" name="staff_id" ></td></tr>
<tr><th align="left">　　職員名</th><td><input type="text" name="staff_name1"></td></tr>
<tr><th align="left">　　協力態度</th><td><select name="cooperation_attitude">
          <option value="はい">はい</option>
          <option value="やや">やや</option>
          <option value="いいえ">いいえ</option>
          <option value="疑い">疑い</option>
          <option value="不明">不明</option>
          </select></td></tr>
<tr><th align="left">　　子供への感情の変化</th><td><select name="emotional_changes">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select></td></tr>
<tr><th align="left">　　保護者の性格的問題の経過状況</th><td><select name="personality_progress">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select></td></tr>
<tr><th align="left">　　保護者の精神的問題の経過状況</th><td><select name="mental_progress">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select></td></tr>
<tr><th align="left">　　親の意見</th><td><input type="text" name="parental_opinion"></td></tr>
<tr><th align="left">　　当面の課題</th><td><input type="text" name="immediate_issues"></td></tr>
<tr><th align="left">　　今後の方針</th><td><input type="text" name="future_tasks"></td></tr>
<tr><th align="left">　　備考欄</th><td><textarea name="personality_remarks" rows=”10″ cols=”100″  wrap="soft"></textarea></td></tr>
</table>
<input type="hidden" name="person_id"><br>

<button type="submit">更新</button>
</form>

</body>
</html>