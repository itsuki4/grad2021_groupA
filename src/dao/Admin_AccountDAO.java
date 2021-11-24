package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin_Account;
import model.Admin_Login;

public class Admin_AccountDAO {
	// データベース接続に使用する情報
		  private final String JDBC_URL =
		          "jdbc:mySQL://localhost/groupa";
		  private final String DB_USER = "root";
		  private final String DB_PASS = "";

		  public Admin_Account findByLogin(Admin_Login login) {
			    Admin_Account admin_user = null;

			    // データベースへ接続
			    try (Connection conn = DriverManager.getConnection(
			        JDBC_URL, DB_USER, DB_PASS)) {

			    	 // SELECT文を準備
			        String sql = "SELECT ADMINISTRATOR_ID, ADMINISTRATOR_NAME1,"
			        		+ "ADMINISTRATOR_NAME2, ADMINISTRATOR_PASS FROM ADMIN_USER WHERE ADMINISTRATOR_ID = ? AND ADMINISTRATOR_PASS = ?";
			        PreparedStatement pStmt = conn.prepareStatement(sql);
			        pStmt.setString(1, login.getAdmin_id());
			        pStmt.setString(2, login.getAdmin_pass());

			        // SELECTを実行し、結果表を取得
			        ResultSet rs = pStmt.executeQuery();

			        // 一致したユーザーが存在した場合
			        // そのユーザーを表すAccountインスタンスを生成
			        if (rs.next()) {
			          // 結果表からデータを取得
			          String admin_id = rs.getString("administrator_id");
			          String admin_name1 = rs.getString("administrator_name1");
			          String admin_name2 = rs.getString("administrator_name2");
			          String admin_pass = rs.getString("administrator_pass");


			          admin_user = new  Admin_Account (admin_id, admin_name1, admin_name2 , admin_pass);
			        }
			      } catch (SQLException e) {
			        e.printStackTrace();
			        return null;
			      }
			      // 見つかったユーザーまたはnullを返す
			      return admin_user;
			    }
}