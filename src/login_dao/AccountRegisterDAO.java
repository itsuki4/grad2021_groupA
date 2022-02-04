package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import login_model.AccountBeans;

public class AccountRegisterDAO {
	public  AccountRegisterDAO(AccountBeans ab) {
    // データベース接続に使用する情報

    	final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";



		  try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            String sql = "INSERT INTO account (loginId, pass, name, roleId) VALUES (?, ?, ?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, ab.getLoginId());
            ps.setString(2, ab.getPass());
            ps.setString(3, ab.getName());
            ps.setInt(4, ab.getRole());


            int r = ps.executeUpdate();

            if(r != 0) {
                System.out.println("新規登録成功！");
            } else {
                System.out.println("新規登録失敗( ﾉД`)ｼｸｼｸ…");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

