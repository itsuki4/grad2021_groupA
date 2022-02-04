package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login_model.AccountBeans;

public class AccountDAO {
	 public AccountBeans findAccount(AccountBeans ab) {
    // データベース接続に使用する情報
		 final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";


    // ログインアカウントを探す


        // 戻り値の用意
        AccountBeans returnAb = new AccountBeans();

        // データベースへ接続
        try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            String sql = "SELECT loginId, pass, name, roleId FROM account WHERE loginId = ? AND pass = ?";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, ab.getLoginId());
            ps.setString(2, ab.getPass());

            ResultSet rs = ps.executeQuery();



            if (rs.next()) {
                // 見つかったアカウント情報を戻り値にセット
                returnAb.setLoginId(rs.getString("loginId"));
                returnAb.setPass(rs.getString("pass"));
                returnAb.setName(rs.getString("name"));
                returnAb.setRole(rs.getInt("roleId"));
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


