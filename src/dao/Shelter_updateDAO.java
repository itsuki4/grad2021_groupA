                                                                                                                                     package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Shelter_update;


public class Shelter_updateDAO {
	public Shelter_updateDAO(Shelter_update ab) {
	final String JDBC_URL =
	          "jdbc:mySQL://localhost/GroupA";
	  final String DB_USER = "root";
	  final String DB_PASS = "";

  try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

      String sql = "UPDATE shelter_date SET shelter_capacity =?,shelter_conditions=?,shelter_vacancy=? where shelter_id like ?";
      PreparedStatement ps= con.prepareStatement(sql);



      ps.setInt(1, ab.getCapacity());
      ps.setString(2, ab.getShelter_conditions());
      ps.setInt(3, ab.getShelter_vacancy());
      ps.setInt(4, ab.getShelter_id());


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
