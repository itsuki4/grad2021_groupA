<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>児童の詳細追加</title>

</head>
<body>
<%@ include file="baseNav.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">児童の情報追加</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">児童の詳細情報/児童の情報追加</li>
                        </ol>
                        </div>
<form action="/grad2021_groupA/Person_Create" method="post">
<table class="row" >
<tr><th align="left">　　児童ID</th><td><input type="text" name="person_id" ></td></tr>
<tr><th align="left">　　児童氏名</th><td><input type="text" name="person_name1"></td></tr>
<tr><th align="left">　　児童氏名（カタカナ）</th><td><input type="text" name="person_name2"></td></tr>
<tr><th align="left">　　生年月日</th><td><input type="date" name="person_birthday"></td></tr>
<tr><th align="left">　　性別</th><td><select name="person_gender">
          <option value="男性">男性</option>
          <option value="女性">女性</option>
      </select></td></tr>
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
<button type="submit">登録</button>
</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>