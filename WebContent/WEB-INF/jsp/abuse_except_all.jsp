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
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<p><font size="5">虐待以外の詳細</font></P>
<table border='1'><tr><th>保護内容　　</th><th>児童ID　　</th>
<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Groupa", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from abuse_except");
            while (rs.next()) {
%>
    <tr>
    <td><%= rs.getInt("person_protect")%></td>
    <td><%= rs.getInt("person_id")%></td>
    <td><a href=/grad2021_groupA/Abuse_Exsept_Main>詳細</a></td>
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
<a href=/grad2021_groupA/Person_Date_All>戻る</a>
</p>
</form>
</body>
</html>