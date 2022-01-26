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

    <p>保護内容：<%= rs.getInt("person_protect")%></p>
    <p>児童ID:<%= rs.getInt("person_id")%></p>
    <p>保護理由：<%= rs.getInt("except_reason")%></p>
    <p>今後の方向性：<%= rs.getInt("except_direction")%></p>
    <p>対象者の状況<%= rs.getInt("except_status")%></p>
    <p>現状と課題<%= rs.getInt("except_task")%></p>
    <p>備考欄：<%= rs.getString("except_remarks")%></p>
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
<form action="">
<p>
<a href=/grad2021_groupA/Person_Date_Main>戻る</a>
</p>
</form>
</body>
</html>