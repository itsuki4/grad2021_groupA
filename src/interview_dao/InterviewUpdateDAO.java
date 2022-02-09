package interview_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import interview_model.Interview;

public class InterviewUpdateDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;
	//接続共通処理
	private void connect() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}
	//切断共通処理
	private void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Interview> findAll(){
		List<Interview> list=new ArrayList<>();
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM interview_content");
			rs=ps.executeQuery();
			while(rs.next()){
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
				list.add(new Interview(person_id,person_name1,interview_date,staff_id,
						staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,
						parental_opinion,immediate_issues,future_tasks,personality_remarks));
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
		return list;
	}
	public Interview findOne(int person_id){
		Interview interview=null;
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM interview_content WHERE person_id=?");
			ps.setInt(1, person_id);
			rs=ps.executeQuery();
			if(rs.next()){
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
				interview=new Interview(person_id,person_name1,interview_date,staff_id,
						staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,
						parental_opinion,immediate_issues,future_tasks,personality_remarks);
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
		return interview;
	}

	public void updateOne(Interview interview){
		try {
			this.connect();
			ps=db.prepareStatement("UPDATE interview_content SET person_name1=?,staff_id=?,\"\r\n" +
					"				  		+ \"staff_name1=?, cooperation_attitude=?,personality_progress=?,mental_progress=?,emotional_changes=?,\"\r\n" +
					"				  		+ \"parental_opinion=?,immediate_issues=?, future_tasks=?,personality_remarks=? WHERE person_id=?");
			ps.setString(1,interview.getperson_name1());
			ps.setInt(2,interview.getstaff_id());
			ps.setString(3,interview.getstaff_name1());
			ps.setString(4,interview.getcooperation_attitude());

			ps.setString(5,interview.getmental_progress());
			ps.setString(6,interview.getmental_progress());
			ps.setString(7,interview.getemotional_changes());
			ps.setString(8,interview.getparental_opinion());
            ps.setString(9,interview.getimmediate_issues());

            ps.setString(10,interview.getfuture_tasks());
			ps.setString(11,interview.getpersonality_remarks());
			ps.setInt(12,interview.getperson_id());
	        ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
	}
}
