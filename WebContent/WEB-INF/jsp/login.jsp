<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*" %>
<%@page import="java.sql.*"%>
<% Shelter_Date s = (Shelter_Date)request.getAttribute("s"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
<h3>空き情報を編集するには施設のパスワードを入力してください。</h3>
<p>ID:<%=s.getId() %></p>
<p><%=s.getShelter_name1() %></p>
 <hr>
         <div align="center">
             <table border="0">
                 <form action="list.html" method="get">

                         <th>
                             パスワード
                         </th>
                         <td>
                             <input type="password" name="password" value="" size="24">
                         </td>
                     </tr>
                     <tr>
                         <td colspan="2">
                             <input type="submit" value="ログイン">
                         </td>
                     </tr>
                 </form>
             </table>
         </div>
</body>
</html>