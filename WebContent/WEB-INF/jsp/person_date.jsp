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
<title>児童の詳細情報</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="5">児童の詳細情報</font></P>
<table border='1'><tr><th>児童ID　　</th><th>児童氏名</th><th>児童氏名　（カタカナ)　　</th><th>生年　月日</th><th>性別</th>
                  <th>郵便　番号</th><th>都道府県</th><th>市町村</th><th>市町村（カタカナ）</th><th>受理生年月日</th><th>就学状況</th><th>保護内容</th>
                  <th>保護者氏名</th><th>保護者氏名（カタカナ）</th><th>保護者の職業</th><th>保護者電話番号</th><th>兄弟氏名（続柄）</th><th>兄弟氏名（カタカナ）</th><th>保護者の了解</th><th>備考欄</th></tr>

<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Groupa", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from person_date");
            while (rs.next()) {
%>
    <tr>
     <td><%= rs.getInt("person_id")%></td>
     <td><%= rs.getString("person_name1")%></td>
     <td><%= rs.getString("person_name2")%></td>
     <td><%= rs.getString("person_birthday")%></td>
	 <td><%= rs.getInt("person_gender")%></td>
     <td><%= rs.getString("person_address1")%></td>
	 <td><%= rs.getString("person_address2")%></td>
	 <td><%= rs.getString("person_address3")%></td>
	 <td><%= rs.getString("person_address4")%></td>
	 <td><%= rs.getString("acceptance")%></td>
	 <td><%= rs.getInt("person_status")%></td>
	 <td><%= rs.getInt("person_protect")%></td>
     <td><%= rs.getString("person_parent1")%></td>
	 <td><%= rs.getString("person_parent2")%></td>
	 <td><%= rs.getString("parent_job")%></td>
	 <td><%= rs.getString("parent_phone")%></td>
	 <td><%= rs.getString("brother1")%></td>
	 <td><%= rs.getString("brother2")%></td>
	 <td><%= rs.getInt("parent_ok")%></td>
	 <td><%= rs.getString("person_remarks")%></td>
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
<input type = "submit" value = "戻る">
</p>
</form>
</body>
</html>