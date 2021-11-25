package person_date_dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import person_date_model.Person_Date_Mutter;

public class Person_Date_MutterDAO {
	private static final String DB_USER = null;
	private final String JDBC_URL = "jdbc:mySQL:tcp://localhost/Groupa";
	private final String DB_PASS = "";

	public List<Person_Date_Mutter> findAll() {
		List<Person_Date_Mutter> Person_Date_mutterList = new ArrayList<>();

		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT person_id,person_name1,person_name2,person_birthday,person_address1,person_address2,person_address3,person_address4,acceptance,person_status, person_protect,person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()){
				int person_id = rs.getInt("person_id");
				String person_name1 = rs.getString("person_name1");
				String person_name2 = rs.getString("person_name2");
				String person_brithday = rs.getString("person_brithday");
				String person_address1 = rs.getString("person_address1");
				String person_address2 = rs.getString("person_address2");
				String person_address3 = rs.getString("person_address3");
				String person_address4 = rs.getString("person_address4");
				String acceptence = rs.getString("acceptance");
				int person_status = rs.getInt("person_status");
				int person_protect = rs.getInt("person_protect");
				String person_parent1 =rs. getString("person_parent1");
				String person_parent2 = rs.getString("person_parent2");
				String parent_job = rs.getString("parent_job");
				String parent_phone = rs.getString("parent_phone");
				String brother1 = rs.getString("brother1");
				String brother2 = rs.getNString("borther2");
				int parent_ok = rs.getInt("parent_ok");
				String person_remarks =rs.getString("person_remarks");
				int person_gender = rs.getInt("person_gender");
				Person_Date_Mutter Person_Date_mutter = new Person_Date_Mutter(person_id,person_name1,person_name2,person_brithday,person_address1,person_address2,person_address3,person_address4,acceptence,person_status, person_protect,person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender);
				Person_Date_mutterList.add(Person_Date_mutter);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return Person_Date_mutterList;
	}
	public boolean create(Person_Date_Mutter mutter) {

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "INSERT INTO MUTTER( preson_id,person_name1,person_name2,person_birthday,person_address1,person_address2,person_address3,person_address4,acceptance,person_status, person_protect,person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender) VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, mutter.getperson_id());
			pStmt.setString(2,mutter.getperson_name1());
			pStmt.setString(3,mutter.getperson_name2());
			pStmt.setString(4,mutter.getperson_birthday());
			pStmt.setString(5,mutter.getperson_address1());
			pStmt.setString(5,mutter.getperson_address2());
			pStmt.setString(6,mutter.getperson_address3());
			pStmt.setString(7,mutter.getperson_address4());
			pStmt.setString(8,mutter.getacceptance());
			pStmt.setInt(9,mutter.getperson_status());
			pStmt.setInt(10,mutter.getperson_protect());
			pStmt.setString(11,mutter.getperson_parent1());
			pStmt.setString(12,mutter.getperson_parent2());
			pStmt.setString(13,mutter.getparent_job());
			pStmt.setString(14,mutter.getparent_phone());
			pStmt.setString(15,mutter.getbrother1());
			pStmt.setString(16,mutter.getbrother2());
			pStmt.setInt(17,mutter.getparent_ok());
			pStmt.setString(18,mutter.getperson_remarks());
			pStmt.setInt(19,mutter.getperson_gender());

			int result = pStmt.executeUpdate();
			if (result != 1 ) {
				return false;
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}