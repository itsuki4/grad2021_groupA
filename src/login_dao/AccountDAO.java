package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_model.AccountSerch;

public class AccountDAO {
	 public AccountSerch findAccount(AccountSerch ab) {
    // データベース接続に使用する情報
		 final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";


    // ログインアカウントを探す


        // 戻り値の用意
		  AccountSerch returnAb = new AccountSerch();

        // データベースへ接続
        try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            String sql = "SELECT staff_id,shelter_id, staff_name1, staff_name2, staff_pass, staff_role,admin_role, staff_start FROM staff_user WHERE staff_id = ? AND staff_pass = ?";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, ab.getStaff_id());
            ps.setString(2, ab.getStaff_pass());


            ResultSet rs = ps.executeQuery();



            if (rs.next()) {
                // 見つかったアカウント情報を戻り値にセット
                returnAb.setStaff_id(rs.getInt("staff_id"));
                returnAb.setShelter_id(rs.getInt("shelter_id"));
                returnAb.setStaff_name1(rs.getString("staff_name1"));
                returnAb.setStaff_name2(rs.getString("staff_name2"));
                returnAb.setStaff_pass(rs.getString("staff_pass"));
                returnAb.setStaff_role(rs.getInt("staff_role"));
                returnAb.setAdmin_role(rs.getInt("staff_role"));
                returnAb.setStaff_start(rs.getString("staff_start"));
            } else {
                // アカウントがなければnullを返す
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return returnAb;
    }
}


