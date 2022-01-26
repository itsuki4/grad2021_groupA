package interview_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interview_model.Interview;
import interview_model.Interview_Mutter;

public class Interview_MutterDAO {

	private final String JDBC_URL = "jdbc:mySQL://localhost/groupa";
	private final String DB_USER = "root";
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
				String cooperation_attitude = rs.getString("cooperation_attitude");
				String personality_progress = rs.getString("personality_progress");
				String mental_progress = rs.getString("mental_progress");
				String emotional_changes = rs.getString("emotional_changes");
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

	public Interview findOne(int person_id){
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			String sql ="SELECT FROM interview_content WHERE Person_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, person_id);

        ps.executeUpdate();
      } catch ( SQLException e) {
        e.printStackTrace();
      }
		return null;
    }
}