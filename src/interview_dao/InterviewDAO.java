package interview_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interview_model.Interview;


public class InterviewDAO {

    final String JDBC_URL = "jdbc:mysql://localhost/GroupA";
	final String DB_USER = "root";
	final String DB_PASS = "";

	public List<Interview> findAll() {
		List<Interview> List = new ArrayList<>();



		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {
		    	String sql = "SELECT * FROM interview_content";
				PreparedStatement pStmt = conn.prepareStatement(sql);


			      ResultSet rs = pStmt.executeQuery();
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
					Interview Interview = new Interview(person_id,person_name1,interview_date,staff_id,
							staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,
							parental_opinion,immediate_issues,future_tasks,personality_remarks);
					List.add(Interview);
				}
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return List;
	}



		public void insertOne(Interview interview) {
				try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

						String sql = "INSERT INTO interview_content(person_id,person_name1,staff_id,staff_name1,"
								+ "cooperation_attitude,personality_progress,mental_progress,emotional_changes,parental_opinion"
								+ ",immediate_issues, future_tasks,personality_remarks) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps = conn.prepareStatement(sql);

						ps.setInt(1, interview.getperson_id());
						ps.setString(2,interview.getperson_name1());
						ps.setInt(3,interview.getstaff_id());
						ps.setString(4,interview.getstaff_name1());

						ps.setString(5,interview.getcooperation_attitude());
						ps.setString(6,interview.getmental_progress());
						ps.setString(7,interview.getmental_progress());
						ps.setString(8,interview.getemotional_changes());
						ps.setString(9,interview.getparental_opinion());

						ps.setString(10,interview.getimmediate_issues());
						ps.setString(11,interview.getfuture_tasks());
						ps.setString(12,interview.getpersonality_remarks());

					int r =  ps.executeUpdate();

					if(r!= 0) {
						System.out.println("成功");
					}else {
						System.out.println("失敗");
					}
				} catch (SQLException e) {
					e.printStackTrace();
		  }
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



		  public void updateOne(Interview interview){
			  try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
				  String lss ="UPDATE interview_content SET person_name1=?,staff_id=?,"
				  		+ "staff_name1=?, cooperation_attitude=?,personality_progress=?,mental_progress=?,emotional_changes=?,"
				  		+ "parental_opinion=?,immediate_issues=?, future_tasks=?,personality_remarks=? WHERE person_id=?";
				  PreparedStatement ps = conn.prepareStatement(lss);

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
			       } catch (SQLException e) {
			        e.printStackTrace();
			       }
		  }


		  public void deleteOne(int person_id){
			      try (Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

						String sql ="DELETE FROM interview_content WHERE Person_id=?";
						PreparedStatement ps = conn.prepareStatement(sql);
			        ps.setInt(1, person_id);
			        ps.executeUpdate();
			      } catch ( SQLException e) {
			        e.printStackTrace();
			    }
		  }
}
