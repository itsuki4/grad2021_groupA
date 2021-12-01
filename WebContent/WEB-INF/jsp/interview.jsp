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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="5">面談内容</font></P>
<table border='1'class="table table-striped"><tr><th>児童ID　　</th><th>児童氏名　　</th><th>記載日</th><th>職員ID</th><th>職員氏名　　</th><th>協力態度　　</th><th>保護者の性格的問題の経過状況</th>
                      <th>保護者の性格的問題の経過状況</th><th>子供への感情の変化</th><th>親の意見　　</th><th>当面の課題　　</th><th>今後の課題　　</th><th>備考欄</th></tr>

<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from interview_content");
            while (rs.next()) {
%>
    <tr>
    <td><%= rs.getInt("person_id")%></td>
    <td><%= rs.getString("person_name1")%></td>
    <td><%= rs.getString("interview_date")%></td>
    <td><%= rs.getInt("staff_id")%></td>
    <td><%= rs.getString("staff_name1")%></td>
    <td><%= rs.getInt("cooperation_attitude")%></td>
    <td><%= rs.getInt("personality_progress")%></td>
    <td><%= rs.getInt("mental_progress")%></td>
    <td><%= rs.getInt("emotional_changes")%></td>
    <td><%= rs.getString("parental_opinion")%></td>
    <td><%= rs.getString("immediate_issues")%></td>
    <td><%= rs.getString("future_tasks")%></td>
    <td><%= rs.getString("personality_remarks")%></td>
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