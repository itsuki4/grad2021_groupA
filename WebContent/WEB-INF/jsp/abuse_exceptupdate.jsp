<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="abuse_except_model.*"%>

<%
AbuseExcept abuse=(AbuseExcept)request.getAttribute("abuse");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>面談内容の追加</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>
<body>
<form action="/grad2021_groupA/Abuse_ExceptCreate" method="post">
<table class="row" >
<tr><th align="left">　　保護内容</th><td><select name="person_protect">
          <option value="非行">非行</option>
          <option value="家庭環境">家庭環境</option>
          <option value="社会的養護">社会的養護</option>
          </select></td></tr>
<tr><th align="left">　　保護理由</th><td><select name="except_reason" >
          <option value="はい">はい</option>
          <option value="やや">やや</option>
          <option value="いいえ">いいえ</option>
          <option value="疑い">疑い</option>
          <option value="不明">不明</option>
          </select></td></tr>
<tr><th align="left">　　今後の方向性</th><td><select name="except_direction">
          <option value="はい">はい</option>
          <option value="やや">やや</option>
          <option value="いいえ">いいえ</option>
          <option value="疑い">疑い</option>
          <option value="不明">不明</option>
          </select></td></tr>
<tr><th align="left">　　対象者の状況</th><td><select name="except_status">
          <option value="はい">はい</option>
          <option value="やや">やや</option>
          <option value="いいえ">いいえ</option>
          <option value="疑い">疑い</option>
          <option value="不明">不明</option>
          </select></td></tr>
<tr><th align="left">　　現状と課題</th><td><select name="except_task">
          <option value="良好">良好</option>
          <option value="変化なし">変化なし</option>
          <option value="悪化">悪化</option>
          </select></td></tr>
<tr><th align="left">　　備考欄</th><td><textarea name="except_remarks" rows=”10″ cols=”100″  wrap="soft"></textarea></td></tr>

</table>
<input type="hidden" name="person_id"value="<%=abuse.getperson_id() %>" ><br>
<button type="submit">更新</button>
</form>

</body>
</html>