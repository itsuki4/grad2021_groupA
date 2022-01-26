<%@ page language="java" contentType="text/html;  charset=Windows-31J" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>児童の詳細追加</title>
</head>
<body>
<form action="/grad2021_groupA/Person_Create" method="post">
<p>児童ID：</p>
<input type="text" name="person_id" >
<p>児童氏名：</p>
<input type="text" name="person_name1">
<p>児童氏名（カタカナ）:</p>
<input type="text" name="person_name2">
<p>生年月日：　　　　性別：</p>
<input type="date" name="person_birthday">
<select name="person_gender">
          <option value="男性">男性</option>
          <option value="女性">女性</option>
      </select><br>
<br>
<p>住所</p>
郵　便　番　号　　：<input type="text" name="person_address1"><br>
都　道　府　県　名：<input type="text" name="person_address2"><br>
市　町　村　名　　：<input type="text" name="person_address3"><br>
市町村（カタカナ）：<input type="text" name="person_address4"><br>
<br>
<p>登録日：　　　　　就学状況：　　　保護内容：</p>
<input type="date" name="acceptance">
<select name="person_status">
          <option value="小学校在学">小学校在学</option>
          <option value="中学校在学">中学校在学</option>
          <option value="高校在学">高校在学</option>
          <option value="ない">ない</option>
          <option value="不明">不明</option>
          </select>
<select name="person_protect">
          <option value="虐待">虐待</option>
          <option value="非行">非行</option>
          <option value="家庭環境">家庭環境</option>
          <option value="社会的養護">社会的養護</option>
          </select><br>
<p>保護者氏名：</p>
<input type="text" name="person_parent1">
<p>保護者氏名（カタカナ）:</p>
<input type="text" name="person_parent2">
<p>保護者の職業：</p>
<input type="text" name="parent_job">
<p>保護者の電話番号：</p>
<input type="tel" name="parent_phone">
<p>兄弟氏名（続柄）：</p>
<input type="text" name="brother1">
<p>兄弟氏名（カタカナ）: 保護者の了承：</p>
<input type="text" name="brother2">
<select name="parent_ok">
              <option value="あり">あり</option>
              <option value="なし">なし</option>
              </select>
<p>備考欄：</p>
<input type="text" name="person_remarks" size="30"><br>
<button type="submit">登録</button>
</form>

</body>
</html>