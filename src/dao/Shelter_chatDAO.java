package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Shelter_chat;

public class Shelter_chatDAO {
    public Shelter_chatDAO(Shelter_chat ab) {

    	final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";

        try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            String sql = "INSERT INTO sheltercomment (shelter_id, shelter_comment) VALUES (?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, ab.getShelter_id());
            ps.setString(2, ab.getShelter_comment());

            
          
            

            int r = ps.executeUpdate();

            if(r != 0) {
                System.out.println("コメントに成功( *´艸｀)！");
            } else {
                System.out.println("コメントに失敗( ﾉД`)ｼｸｼｸ…");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
