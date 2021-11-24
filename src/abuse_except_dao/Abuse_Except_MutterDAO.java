package abuse_except_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import abuse_except_model.Abuse_Except_Mutter;

public class Abuse_Except_MutterDAO {
	private static final String DB_USER = null;
	private final String JDBC_URL = "jdbc:mySQL:tcp://localhost/Groupa";
	private final String DB_PASS = "";

	public List<Abuse_Except_Mutter> findAll() {
		List<Abuse_Except_Mutter> Abuse_except_mutterList = new ArrayList<>();

		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT preson_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()){
				int person_protect = rs.getInt("person_protect");
				int person_id = rs.getInt("person_id");
				int except_reason = rs.getInt("except_reason");
				int except_direction = rs.getInt("except_direction");
				int except_status = rs.getInt("except_status");
				int except_task = rs.getInt("except_task");
				String except_remarks = rs.getString("except_remarks");
				Abuse_Except_Mutter Abuse_except_mutter = new Abuse_Except_Mutter(person_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks);
				Abuse_except_mutterList.add(Abuse_except_mutter);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return Abuse_except_mutterList;
	}
	public boolean create(Abuse_Except_Mutter mutter) {

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "INSERT INTO MUTTER( preson_protect,preson_id,except_reason,except_direction,except_status,except_task,except_remarks) VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, mutter.getperson_protect());
			pStmt.setInt(2,mutter.getperson_id());
			pStmt.setInt(3,mutter.getexcept_reason());
			pStmt.setInt(4,mutter.getexcept_direction());
			pStmt.setInt(5,mutter.getexcept_status());
			pStmt.setInt(5,mutter.getexcept_task());
			pStmt.setString(6,mutter.getexcept_remarks());

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