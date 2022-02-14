package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDeleteDAO {
	public AccountDeleteDAO(int ab) {
		final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";

	  try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

	      String sql = "DELETE FROM staff_user WHERE staff_id=?";
	      PreparedStatement ps= con.prepareStatement(sql);

	      ps.setInt(1, ab);


	      int r = ps.executeUpdate();

	      if(r != 0) {
	          System.out.println("削除に成功( *´艸｀)！");
	      } else {
	          System.out.println("削除に失敗( ﾉД`)ｼｸｼｸ…");
	      }

	  } catch (SQLException e) {
	      e.printStackTrace();
	  }
	    }
}
