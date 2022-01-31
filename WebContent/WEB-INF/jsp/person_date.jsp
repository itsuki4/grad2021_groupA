<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>児童の詳細</title>
<link rel="stylesheet" type="text/css" href="/grad2021_groupA/css/style.css">
</head>

<body>
<%@ include file="baseNavber.jsp" %>
 <div class="container-fluid px-4">
                        <h1 class="mt-4">児童の詳細情報</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">児童の詳細情報</li>
                        </ol>
                        </div>
<P><font size="5">児童の詳細</font></P>
<%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/groupa", "root", "");
            stmt = con.createStatement();
		    rs = stmt.executeQuery("select * from person_date");
            while (rs.next()) {
%>
     <p>児童ID：<%= rs.getInt("person_id")%></p>
     <p>児童氏名：<%= rs.getString("person_name1")%></p>
     <p>（カタカナ）<%= rs.getString("person_name2")%></p>
     <p>生年月日：<%= rs.getString("person_birthday")%></p>
	 <p><%= rs.getString("person_gender")%></p>
     <p>郵便番号：〒<%= rs.getString("person_address1")%></p>
	 <p>住所　　：<%= rs.getString("person_address2")%></p>
	 <p>　　　　　<%= rs.getString("person_address3")%></p>
	 <p>　　　　　<%= rs.getString("person_address4")%></p>
	 <p>登録日：<%= rs.getString("acceptance")%></p>
	 <p>就学状況：<%= rs.getString("person_status")%></p>
	 <p>保護内容：<%= rs.getString("person_protect")%></p>
     <p>保護者氏名：<%= rs.getString("person_parent1")%></p>
	 <p>（カタカナ）<%= rs.getString("person_parent2")%></p>
	 <p>保護者職業：<%= rs.getString("parent_job")%></p>
	 <p>保護者連絡先：<%= rs.getString("parent_phone")%></p>
	 <p>兄弟氏名（続柄）：<%= rs.getString("brother1")%></p>
	 <p>（カタカナ）　　　<%= rs.getString("brother2")%></p>
	 <p>承諾の有無：<%= rs.getString("parent_ok")%></p>
	 <p>備考欄：<%= rs.getString("person_remarks")%></p>
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

<a href=/grad2021_groupA/Read>一覧へ</a>

</form>
<%@ include file="basefooter.jsp" %>
</body>
</html>