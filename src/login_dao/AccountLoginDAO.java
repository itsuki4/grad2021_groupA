package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import login_model.AccountLogin;

public class AccountLoginDAO {
	public AccountLoginDAO(AccountLogin ab) {

    	final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";

        try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            String sql = "INSERT INTO staff_user (shelter_id, staff_name1, staff_name2, staff_pass, staff_role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, ab.getShelter_id());
            ps.setString(2, ab.getStaff_name1());
            ps.setString(3, ab.getStaff_name2());
            ps.setString(4, ab.getStaff_pass());
            ps.setInt(5, ab.getStaff_role());




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
