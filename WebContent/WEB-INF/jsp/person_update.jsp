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
</head>
<body>
<form action="/grad2021_groupA/Person_Update" method="post">
<p>児童氏名：</p>
<input type="text" name="person_name1" value="<%=person.getperson_name1()%>">
<p>児童氏名（カタカナ）:</p>
<input type="text" name="person_name2" value="<%=person.getperson_name2()%>">
<p>生年月日：</p>
<input type="date" name="person_birthday" value="<%=person.getperson_birthday()%>"><br>
性別：<select name="person_gender">
          <option value="男性">男性</option>
          <option value="女性">女性</option>
      </select><br>
<h1>住所</h1>
<p>郵便番号：</p>
<input type="text" name="person_address1"value="<%=person.getperson_address1() %>">
<p>都道府県名：</p>
<input type="text" name="person_address2"value="<%=person.getperson_address2() %>">
<p>市町村名：</p>
<input type="text" name="person_address3"value="<%=person.getperson_address3() %>">
<p>市町村（カタカナ）：</p>
<input type="text" name="person_address4"value="<%=person.getperson_address4() %>">
<p>登録日：</p>
<input type="date" name="acceptance" value="<%=person.getacceptance() %>"><br>
就学状況：<select name="person_status">
          <option value="小学校在学">小学校在学</option>
          <option value="中学校在学">中学校在学</option>
          <option value="高校在学">高校在学</option>
          <option value="ない">ない</option>
          <option value="不明">不明</option>
          </select>
保護内容：<select name="person_protect">
          <option value="虐待">虐待</option>
          <option value="非行">非行</option>
          <option value="家庭環境">家庭環境</option>
          <option value="社会的養護">社会的養護</option>
          </select>
<p>保護者氏名：</p>
<input type="text" name="person_parent1" value="<%=person.getperson_parent1() %>"><br>
<p>保護者氏名（カタカナ）:</p>
<input type="text" name="person_parent2" value="<%=person.getperson_parent2() %>"><br>
<p>保護者の職業：</p>
<input type="text" name="parent_job" value="<%=person.getparent_job() %>"><br>
<p>保護者の電話番号：</p>
<input type="tel" name="parent_phone" value="<%=person.getparent_phone() %>"><br>
<p>兄弟氏名（続柄）：</p>
<input type="text" name="brother1" value="<%=person.getbrother1() %>"><br>
<p>兄弟氏名（カタカナ）:</p>
<input type="text" name="brother2" value="<%=person.getbrother2() %>"><br>
保護者の了承：<select name="parent_ok">
              <option value="あり">あり</option>
              <option value="なし">なし</option>
              </select>
<p>備考欄：</p>
<input type="text" name="person_remarks" size="30"value="<%=person.getperson_remarks() %>"><br>
<input type="hidden" name="person_id" value="<%=person.getperson_id() %>"><br>

<button type="submit">更新</button>
</form>
</body>
</html>