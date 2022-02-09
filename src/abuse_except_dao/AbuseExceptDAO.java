package abuse_except_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import abuse_except_model.AbuseExcept;



public class AbuseExceptDAO {

    final String JDBC_URL = "jdbc:mysql://localhost/GroupA";
	final String DB_USER = "root";
	final String DB_PASS = "";

	public List<AbuseExcept> findAll() {
		List<AbuseExcept> List = new ArrayList<>();


		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {
		    	String sql = "SELECT * FROM abuse_except";
				PreparedStatement pStmt = conn.prepareStatement(sql);


			      ResultSet rs = pStmt.executeQuery();
		      while(rs.next()){
		    	    String person_protect = rs.getString("person_protect");
					int person_id = rs.getInt("person_id");
					String except_reason = rs.getString("except_reason");
					String except_direction = rs.getString("except_direction");
					String except_status = rs.getString("except_status");
					String except_task = rs.getString("except_task");
					String except_remarks = rs.getString("except_remarks");
					AbuseExcept Abuse_except = new AbuseExcept(person_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks);
					List.add(Abuse_except);
				}
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return List;
	}



	public void insertOne(AbuseExcept abuse) {
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

				String sql = "INSERT INTO abuse_except(person_protect,person_id,except_reason,except_direction,"
						+ "except_status,except_task,except_remarks) VALUES(?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);

				ps.setString(1, abuse.getperson_protect());
				ps.setInt(2,abuse.getperson_id());
				ps.setString(3,abuse.getexcept_reason());
				ps.setString(4,abuse.getexcept_direction());

				ps.setString(5,abuse.getexcept_status());
				ps.setString(6,abuse.getexcept_task());
				ps.setString(7,abuse.getexcept_remarks());

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


		public AbuseExcept findOne(int person_id){
			try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

				String sql ="SELECT FROM abuse_except WHERE person_id=?";
	            PreparedStatement ps = conn.prepareStatement(sql);

	        ps.setInt(1, person_id);

	        ps.executeUpdate();
	      } catch ( SQLException e) {
	        e.printStackTrace();
	      }
			return null;
	    }



		  public void updateOne(AbuseExcept abuseexcept){
			  try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
				  String lss ="UPDATE abuse_except SET person_name1=?,preson_protect=?,except_reason=?,except_direction=?,"
				  		+ "except_status=?,except_task=?,except_remarks=? WHERE person_id=?";
				  PreparedStatement ps = conn.prepareStatement(lss);

				    ps.setString(1, abuseexcept.getperson_protect());
					ps.setInt(2,abuseexcept.getperson_id());
					ps.setString(3,abuseexcept.getexcept_reason());
					ps.setString(4,abuseexcept.getexcept_direction());
					ps.setString(5,abuseexcept.getexcept_status());
					ps.setString(6,abuseexcept.getexcept_task());
					ps.setString(7,abuseexcept.getexcept_remarks());;
			        ps.executeUpdate();
			       } catch (SQLException e) {
			        e.printStackTrace();
			       }
		  }


		  public void deleteOne(int person_id){
			      try (Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

						String sql ="DELETE FROM abuse_except WHERE person_id=?";
						PreparedStatement ps = conn.prepareStatement(sql);
			        ps.setInt(1, person_id);
			        ps.executeUpdate();
			      } catch ( SQLException e) {
			        e.printStackTrace();
			    }
		  }
}