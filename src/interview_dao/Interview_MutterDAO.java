package interview_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interview_model.Interview_Mutter;

public class Interview_MutterDAO {
	private static final String DB_USER = null;
	private final String JDBC_URL = "jdbc:mySQL:tcp://localhost/Groupa";
	private final String DB_PASS = "";

	public List<Interview_Mutter> findAll() {
		List<Interview_Mutter> Interview_mutterList = new ArrayList<>();

		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT preson_id,person_name1,interview_date,satff_id,staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,parental_opinion,immediate_issues,future_tasks,personality_remarks";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()){
				int person_id = rs.getInt("person_id");
				String person_name1 = rs.getString("person_name1");
				String interview_date = rs.getString("interview_date");
				int staff_id = rs.getInt("staff_id");
				String staff_name1 = rs.getString("staff_name1");
				int cooperation_attitude = rs.getInt("cooperation_attitude");
				int personality_progress = rs.getInt("personality_progress");
				int mental_progress = rs.getInt("mental_progress");
				int emotional_changes = rs.getInt("emotional_changes");
				String parental_opinion = rs.getString("parental_opinion");
				String immediate_issues = rs.getString("immediate_issues");
				String future_tasks =rs. getString("future_tasks");
				String personality_remarks = rs.getString("personality_remarks");
				Interview_Mutter Interview_mutter = new Interview_Mutter(person_id,person_name1,interview_date,staff_id,staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,parental_opinion,immediate_issues,future_tasks,personality_remarks);
				Interview_mutterList.add(Interview_mutter);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return Interview_mutterList;
	}
	public boolean create(Interview_Mutter mutter) {

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql = "INSERT INTO MUTTER( preson_id,person_name1,interview_date,staff_id,staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,parental_opinion,immediate_issues, future_tasks,personality_remarks) VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, mutter.getperson_id());
			pStmt.setString(2,mutter.getperson_name1());
			pStmt.setString(3,mutter.geinterview_date());
			pStmt.setInt(4,mutter.getstaff_id());
			pStmt.setString(5,mutter.getstaff_name1());
			pStmt.setInt(5,mutter.getcooperation_attitude());
			pStmt.setInt(6,mutter.getmental_progress());
			pStmt.setInt(7,mutter.getmental_progress());
			pStmt.setInt(8,mutter.getemotional_changes());
			pStmt.setString(9,mutter.getparental_opinion());
			pStmt.setString(10,mutter.getimmediate_issues());
			pStmt.setString(11,mutter.getfuture_tasks());
			pStmt.setString(12,mutter.getpersonality_remarks());

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