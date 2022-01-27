<%@ page language="java" contentType="text/html;  charset=Windows-31J"
    pageEncoding="UTF-8" import="person_date_model.*"%>
<%
Person person=(Person)request.getAttribute("person");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>更新</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">

</head>
<body>
<form action="/grad2021_groupA/Person_Update" method="post">
<table class="row">
<tr><th align="left">　　住所</th><td></td></tr>
<tr><th align="left">　　郵便番号</th><td><input type="text" name="person_address1"></td></tr>
<tr><th align="left">　　都道府県名</th><td><input type="text" name="person_address2"></td></tr>
<tr><th align="left">　　市町村名</th><td><input type="text" name="person_address3"></td></tr>
<tr><th align="left">　　市町村（カタカナ）</th><td><input type="text" name="person_address4"></td></tr>
<tr><th align="left">　　登録日</th><td><input type="date" name="acceptance"></td></tr>
<tr><th align="left">　　就学状況</th><td><select name="person_status">
          <option value="小学校在学">小学校在学</option>
          <option value="中学校在学">中学校在学</option>
          <option value="高校在学">高校在学</option>
          <option value="ない">ない</option>
          <option value="不明">不明</option>
          </select></td></tr>
<tr><th align="left">　　保護内容</th><td><select name="person_protect">
          <option value="虐待">虐待</option>
          <option value="非行">非行</option>
          <option value="家庭環境">家庭環境</option>
          <option value="社会的養護">社会的養護</option>
          </select></td></tr>
<tr><th align="left">　　保護者氏名</th><td><input type="text" name="person_parent1"></td></tr>
<tr><th align="left">　　保護者氏名（カタカナ）</th><td><input type="text" name="person_parent2"></td></tr>
<tr><th align="left">　　保護者の職業</th><td><input type="tel" name="parent_job"></td></tr>
<tr><th align="left">　　保護者の電話番号</th><td><input type="text" name="parent_phone"></td></tr>
<tr><th align="left">　　兄弟氏名（続柄）</th><td><input type="text" name="brother1"></td></tr>
<tr><th align="left">　　兄弟氏名（カタカナ）</th><td><input type="text" name="brother2"></td></tr>
<tr><th align="left">　　保護者の了承</th><td><select name="parent_ok">
              <option value="あり">あり</option>
              <option value="なし">なし</option>
              </select></td></tr>
<tr><th align="left">　　備考欄</th><td><textarea name="person_remarks" rows=”10″ cols=”100″  wrap="soft"></textarea></td></tr>
</table>
<input type="hidden" name="person_id" ><br>

<button type="submit">更新</button>
</form>
</body>
</html>