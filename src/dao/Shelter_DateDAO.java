package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Shelter_Date;

public class Shelter_DateDAO {
	// データベース接続に使用する情報
		  private final String JDBC_URL =
		          "jdbc:mySQL://localhost/GroupA";
		  private final String DB_USER = "root";
		  private final String DB_PASS = "";

		  public List<Shelter_Date> findAll() {
		    List<Shelter_Date> dateList = new ArrayList<Shelter_Date>();

		    // データベースへ接続
		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {

		      // SELECT文を準備
		      String sql = "SELECT * FROM shelter_date";
		      PreparedStatement pStmt = conn.prepareStatement(sql);

		      // SELECTを実行し、結果表を取得
		      ResultSet rs = pStmt.executeQuery();

		      while (rs.next()) {
		        int id = rs.getInt("shelter_id");
		        String shelter_name1 = rs.getString("shelter_name1");
		        String shelter_name2 = rs.getString("shelter_name2");
		        String shelter_address1 = rs.getString("shelter_address1");
		        String shelter_address2 = rs.getString("shelter_address2");
		        String shelter_address3 = rs.getString("shelter_address3");
		        String shelter_address4 = rs.getString("shelter_address4");
		        String tel = rs.getString("shelter_tel");
		        int capacity = rs.getInt("shelter_capacity");
		        Shelter_Date shelter_date = new Shelter_Date(id, shelter_name1,shelter_name2, shelter_address1,shelter_address2,shelter_address3,shelter_address4,tel,capacity);
		        dateList.add(shelter_date);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return dateList;
		  }

}
