package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;

public class AccountDAO {
    // データベース接続に使用する情報
    final String jdbcId = "root";
    final String jdbcPass = "";
    final String jdbcUrl = "jdbc:mySQL://localhost/GroupA";

    // ログインアカウントを探す
    public Account findAccount(Account ab) {

        // 戻り値の用意
        Account returnAb = new Account();

        // データベースへ接続
        try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

            String sql = "SELECT * FROM shelter_user WHERE shelter_id = ? AND shelter_pass = ?";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, ab.getId());
            ps.setString(2, ab.getPass());

            ResultSet rs = ps.executeQuery();


            if (rs.next()) {
                // 見つかったアカウント情報を戻り値にセット
                returnAb.setId(rs.getInt("Id"));
                returnAb.setPass(rs.getString("pass"));
                returnAb.setName(rs.getString("name"));
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