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
<title>施設一覧</title>
</head>

<body>
<h2>児童相談所・一時保護所 施設一覧</h2>
<table border='1'><tr><th>id</th><th>施設名</th><th>施設名（カナ）</th></tr>

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
            rs = stmt.executeQuery("select shelter_id,shelter_name1,shelter_name2 from shelter_user");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>
 <tr>
                <td><%= rs.getString("shelter_id")%></td>
                <td><a href=/grad2021_groupA/MenuServlet><%= rs.getString("shelter_name1")%></a></td>
                <td><%= rs.getString("shelter_name2")%></td>
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
<a href=/grad2021_groupA/MenuServlet>メニュー画面へ</a>
</body>
</html>