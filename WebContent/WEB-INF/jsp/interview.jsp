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
<title>面談内容</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="5">面談内容</font></P>
<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/groupa", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from interview_content");
            while (rs.next()) {
%>
    <p>児童ID：<%= rs.getInt("person_id")%></p>
    <p>児童氏名：<%= rs.getString("person_name1")%></p>
    <p>記載日：<%= rs.getString("interview_date")%></p>
    <p>職員ID:<%= rs.getInt("staff_id")%></p>
    <p>職員氏名：<%= rs.getString("staff_name1")%></p>
    <p>協力態度：<%= rs.getString("cooperation_attitude")%></p>
    <p>保護者の性格的問題の経過状況：<%= rs.getString("personality_progress")%></p>
    <p>保護者の精神的問題の経過状況：<%= rs.getString("mental_progress")%></p>
    <p>子供への感情の変化：<%= rs.getString("emotional_changes")%></p>
    <p>親の意見：<%= rs.getString("parental_opinion")%></p>
    <p>当面の課題：<%= rs.getString("immediate_issues")%></p>
    <p>今後の課題：<%= rs.getString("future_tasks")%></p>
    <p>備考欄：<%= rs.getString("personality_remarks")%></p>
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
<a href=/grad2021_groupA/InterviewRead>一覧へ</a>
</p>
</form>
</body>
</html>