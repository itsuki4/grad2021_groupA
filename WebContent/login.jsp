<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%!
// サーブレットのinitメソッドに相当
public void jspInit() {
try {
// JDBCドライバをロード
Class.forName("com.mysql.jdbc.Driver");
} catch (Exception e) {
e.printStackTrace();
}
}
%><!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fruitテーブルの内容(JSP版)</title>
<link rel="stylesheet"type="text/css"href="/grad2021_groupA/css/style.css">
</head><body>
<P>JSPによるデータベースのアクセス</P>
<table border='1'><tr><th>id</th><th>施設名</th><th>施設名（カナ）</th></tr><%
// データベースへのアクセス開始
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
try {
// データベースに接続するConnectionオブジェクトの取得
con = DriverManager.getConnection("jdbc:mysql://localhost/children", "root", "");
// データベース操作を行うためのStatementオブジェクトの取得
stmt = con.createStatement();
// SQL()を実行して、結果を得る
rs = stmt.executeQuery("SELECT person_id, person_name1, person_name2,person_birthday,person_address1,person_address2,person_address3,person_address4,acceptance,person_status,person_protect,person_parent1,person_parent2,parent_job,parent_phone,brother1,brother2,parent_ok,person_remarks,person_gender FROM person_date"); // 得られた結果をレコードごとに表示
while (rs.next()) {
%>
<tr>
<td><%= rs.getString("person_id")%></td>
<td><%= rs.getString("person_name1")%></td>
<td><%= rs.getString("person_name2")%></td>
<td><%= rs.getString("person_birthday")%></td>
<td><%= rs.getString("person_address1")%></td>
<td><%= rs.getString("person_address2")%></td>
<td><%= rs.getString("person_address3")%></td>
<td><%= rs.getString("person_address4")%></td>
<td><%= rs.getString("acceptance")%></td>
<td><%= rs.getString("person_protect")%></td>
<td><%= rs.getString("person_parent1")%></td>
<td><%= rs.getString("person_parent2")%></td>
<td><%= rs.getString("parent_job")%></td>
<td><%= rs.getString("parent_phone")%></td>
<td><%= rs.getString("brother1")%></td>
<td><%= rs.getString("brother2")%></td>
<td><%= rs.getString("parent_ok")%></td>
<td><%= rs.getString("person_remarks")%></td>
<td><%= rs.getString("person_gender")%></td>

</tr>
<%
} } catch (Exception e) {
e.printStackTrace();
} finally {
// データベースとの接続をクローズ
try { rs.close(); } catch (Exception e) {}
try { stmt.close(); } catch (Exception e) {}
try { con.close(); } catch (Exception e) {}
}
%> </table>
</body>
</html>

