package login_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import login_model.Account;

public class AdminUpDAO {
	public AdminUpDAO(Account ab) {
		final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  final String DB_USER = "root";
		  final String DB_PASS = "";

	  try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

	      String sql = "UPDATE staff_user SET shelter_id =?,staff_name1=?,staff_name2=?, staff_pass=? where staff_id like ?";
	      PreparedStatement ps= con.prepareStatement(sql);



	      ps.setInt(1, ab.getShelter_id());
	        ps.setString(2, ab.getStaff_name1());
	        ps.setString(3, ab.getStaff_name2());
          ps.setString(4, ab.getStaff_pass());
          ps.setInt(5, ab.getStaff_id());
          


	      int r = ps.executeUpdate();

	      if(r != 0) {
	          System.out.println("変更に成功( *´艸｀)！");
	      } else {
	          System.out.println("変更に失敗( ﾉД`)ｼｸｼｸ…");
	      }

	  } catch (SQLException e) {
	      e.printStackTrace();
	  }
	    }
}
