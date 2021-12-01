<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%!
public void jspInit() {
    try {
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
<title>虐待以外の詳細</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="5">虐待以外の詳細</font></P>
<table border='1' class="table table-striped"><tr><th>保護内容　　</th><th>児童ID　　</th><th>保護理由</th><th>今後の方向性</th><th>対象者の状況　　</th><th>現状と課題　　</th><th>備考論</th></tr>

<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Groupa", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from abuse_excepts");
            while (rs.next()) {
%>
    <tr>
    <td><%= rs.getInt("person_protect")%></td>
    <td><%= rs.getInt("person_id")%></td>
    <td><%= rs.getInt("except_reason")%></td>
    <td><%= rs.getInt("except_direction")%></td>
    <td><%= rs.getInt("except_status")%></td>
    <td><%= rs.getInt("except_task")%></td>
    <td><%= rs.getString("except_remarks")%></td>
    </tr>
<%
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }
%>

        </table>
<form action="">
<p>
</p>
</form>
<input type="submit" onclick="location.href='/grad2021_groupA/MenuServlet'" value="戻る">
</body>
</html>