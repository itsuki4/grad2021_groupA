package person_date_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import person_date_model.Person;


public class PersonDAO {

    final String JDBC_URL = "jdbc:mySQL://localhost/groupa";
	final String DB_USER = "root";
	final String DB_PASS = "";

		  public List<Person> findAll() {
		    List<Person> List = new ArrayList<>();


		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {
		    	 String sql = "SELECT * FROM person_date";
			      PreparedStatement pStmt = conn.prepareStatement(sql);


			      ResultSet rs = pStmt.executeQuery();
		      while(rs.next()){
	  				int person_id = rs.getInt("person_id");
	  				String person_name1 = rs.getString("person_name1");
					String person_name2 = rs.getString("person_name2");
					String person_birthday = rs.getString("person_birthday");
					String person_address1 = rs.getString("person_address1");
					String person_address2 = rs.getString("person_address2");
					String person_address3 = rs.getString("person_address3");
					String person_address4 = rs.getString("person_address4");
					String acceptence = rs.getString("acceptance");
					String person_status = rs.getString("person_status");
					String person_protect = rs.getString("person_protect");
					String person_parent1 =rs. getString("person_parent1");
					String person_parent2 = rs.getString("person_parent2");
					String parent_job = rs.getString("parent_job");
					String parent_phone = rs.getString("parent_phone");
					String brother1 = rs.getString("brother1");
					String brother2 = rs.getString("brother2");
					String parent_ok = rs.getString("parent_ok");
					String person_remarks =rs.getString("person_remarks");
					String person_gender = rs.getString("person_gender");
	  				Person person = new Person(person_id,person_name1,person_name2,person_birthday,person_address1,
	  						person_address2,person_address3,person_address4,acceptence,person_status, person_protect,
	  						person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender);
	  				List.add(person);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return List;
		  }



		public void insertOne(Person person) {
				try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
					String sql = "INSERT INTO person_date(person_name1,person_name2,person_birthday,person_address1,"
							+ "person_address2,person_address3,person_address4,acceptance,person_status, person_protect,person_parent1,"
							+ "person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender,person_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(sql);

					ps.setString(1,person.getperson_name1());
					ps.setString(2,person.getperson_name2());
					ps.setString(3,person.getperson_birthday());
					ps.setString(4,person.getperson_address1());
					ps.setString(5,person.getperson_address2());
					ps.setString(6,person.getperson_address3());
					ps.setString(7,person.getperson_address4());
					ps.setString(8,person.getacceptance());
					ps.setString(9,person.getperson_status());
					ps.setString(10,person.getperson_protect());
					ps.setString(11,person.getperson_parent1());
					ps.setString(12,person.getperson_parent2());
					ps.setString(13,person.getparent_job());
					ps.setString(14,person.getparent_phone());
					ps.setString(15,person.getbrother1());
					ps.setString(16,person.getbrother2());
					ps.setString(17,person.getparent_ok());
					ps.setString(18,person.getperson_remarks());
					ps.setString(19,person.getperson_gender());
					ps.setInt(20,person.getperson_id());
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

		public Person findOne(int person_id){
			try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

				String sql ="SELECT FROM person_date WHERE Person_id=?";
	            PreparedStatement ps = conn.prepareStatement(sql);

	        ps.setInt(1, person_id);
	        ps.executeUpdate();
	      } catch ( SQLException e) {
	        e.printStackTrace();
	      }
			return null;
	    }



		  public void updateOne(Person person){
			  try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
				  String lss ="UPDATE person_date SET person_name1=?,person_name2=?,person_birthday=?,"
			        		+ "person_address1=?,person_address2=?,person_address3=?,person_address4=?,acceptance=?,person_status=?, "
			        		+ "person_protect=?,person_parent1=?,person_parent2=?,parent_job=?,parent_phone=?, brother1=?,brother2=?,"
			        		+ "parent_ok=?,person_remarks=?,person_gender=? WHERE person_id=?";
				  PreparedStatement ps = conn.prepareStatement(lss);

			          ps.setString(1,person.getperson_name1());
					  ps.setString(2,person.getperson_name2());
					  ps.setString(3,person.getperson_birthday());
					  ps.setString(4,person.getperson_address1());
					  ps.setString(5,person.getperson_address2());
					  ps.setString(6,person.getperson_address3());
					  ps.setString(7,person.getperson_address4());
					  ps.setString(8,person.getacceptance());
					  ps.setString(9,person.getperson_status());
					  ps.setString(10,person.getperson_protect());
					  ps.setString(11,person.getperson_parent1());
					  ps.setString(12,person.getperson_parent2());
					  ps.setString(13,person.getparent_job());
					  ps.setString(14,person.getparent_phone());
					  ps.setString(15,person.getbrother1());
					  ps.setString(16,person.getbrother2());
					  ps.setString(17,person.getparent_ok());
					  ps.setString(18,person.getperson_remarks());
					  ps.setString(19,person.getperson_gender());
			          ps.executeUpdate();
			       } catch (SQLException e) {
			        e.printStackTrace();
			       }
		  }


		  public void deleteOne(int person_id){
			      try (Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

						String sql ="DELETE FROM person_date WHERE Person_id=?";
						PreparedStatement ps = conn.prepareStatement(sql);
			        ps.setInt(1, person_id);
			        ps.executeUpdate();
			      } catch ( SQLException e) {
			        e.printStackTrace();
			    }
		  }



		public List<Person> Person(int person_id) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}
}