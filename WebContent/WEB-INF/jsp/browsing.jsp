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
<title>健康状態記録</title>
<link rel= "stylesheet" type= "text/css" href= "/grad2021_groupA/css/style.css">
</head>

<body>
<P><font size="5">健康状態記録一覧</font></P>

<table border='1'>
<tr>

<th>児童ID</th>
<th>身長</th>
<th>体重</th>
<th>体重の状態</th>
<th>アレルギー7品目</th>
<th>アレルギー症状の程度</th>
<th>アレルギー備考欄</th>
<th>病気・薬</th>
<th>病気の対応</th>
<th>不眠</th>
<th>不安・怯え</th>
<th>抑うつ</th>
<th>精神症状備考欄</th>
<th>自殺行為</th>
<th>脱水症状</th>
<th>栄養不足</th>
<th>偏食</th>
<th>偏食備考欄</th>
<th>傷の部位</th>
<th>傷の数</th>
<th>傷の大きさ</th>
<th>傷の色</th>
<th>傷についての備考欄</th>
<th>障害の有無</th>
<th>備考欄</th>
<th>記入日</th>

<%
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

		try {
    		con = DriverManager.getConnection("jdbc:mySQL://localhost/groupa", "root", "");
    		stmt = con.createStatement();
            rs = stmt.executeQuery("select * price from health_date");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>

<tr>
<td><%= rs.getInt("person_id") %></td>
<td><%= rs.getInt("person_body") %></td>
<td><%= rs.getInt("person_check") %></td>
<td><%= rs.getInt("person_datail") %></td>
<td><%= rs.getString("allergies") %></td>
<td><%= rs.getInt("allergies_degree") %></td>
<td><%= rs.getString("allergies_remarks") %></td>
<td><%= rs.getString("chronic_condition") %></td>
<td><%= rs.getString("chronic_correspondence") %></td>
<td><%= rs.getInt("insomnia") %></td>
<td><%= rs.getInt("frightened") %></td>
<td><%= rs.getInt("depression") %></td>
<td><%= rs.getString("mental_remarks") %></td>
<td><%= rs.getInt("suicide") %></td>
<td><%= rs.getInt("dehydration") %></td>
<td><%= rs.getInt("malnutrition") %></td>
<td><%= rs.getInt("unbalanced_diet") %></td>
<td><%= rs.getString("unbalanced_remarks") %></td>
<td><%= rs.getString("scratch_point") %></td>
<td><%= rs.getInt("scratch_number") %></td>
<td><%= rs.getInt("scratch_size") %></td>
<td><%= rs.getInt("scratch_colour") %></td>
<td><%= rs.getString("scratch_remarks") %></td>
<td><%= rs.getInt("hindrance") %></td>
<td><%= rs.getString("person_remarks") %></td>
<td><%= rs.getString("create_data") %></td>

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
</body>
</html>