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
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>児童一覧</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<table class="table table-striped">
<tr><th>児童ID</th><th>施設名</th><th>施設名（カナ）</th><th>児童名前</th><th>児童名前（カナ）</th><th>登録日</th><th>削除日</th><th>施設ID</th><th>保護者名</th><th>保護者名（カナ）</th><th>兄弟の有無</th></tr>

<%
        // データベースへのアクセス開始
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select * from person_user");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>
<tr>
    <td><%= rs.getString("person_id")%></td>
    <td><%= rs.getString("shelter_name1")%></td>
    <td><%= rs.getString("shelter_name2")%><br></td>
	<td><%= rs.getString("person_name1")%> </td>
	<td><%= rs.getString("person_name2") %></td>
	<td><%= rs.getString("person_start")%> </td>
	<td><%= rs.getString("person_end")%></td>
	<td><%= rs.getString("shelter_id")%></td>
	<td><%= rs.getString("person_parent1")%></td>
	<td><%= rs.getString("person_parent2")%></td>
	<td><%= rs.getString("person_brother") %></td>

    <td><a href="/grad2021_groupA/Children_Update?id=<%=rs.getString("person_id")%>">編集</a>
	<a href="/joytas9/Delete?id=<%=rs.getString("person_id")%>" onclick="return confirm('児童ID<%=rs.getString("person_id")%>を削除してよろしいですか？');">削除</a></td>

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
%>

</table>
<input type="submit" onclick="location.href='/grad2021_groupA/ChildrenList'" value="戻る">
</body>
</html>