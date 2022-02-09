
package person_date_dao;

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

import person_date_model.Person;

public class PersonUpdateDAO {
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
  public List<Person> findAll(){
    List<Person> list=new ArrayList<>();
    try {
      this.connect();
      ps=db.prepareStatement("SELECT * FROM person_date");
      rs=ps.executeQuery();
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
			list.add( new Person(person_id,person_name1,person_name2,person_birthday,person_address1,
					person_address2,person_address3,person_address4,acceptence,person_status, person_protect,
					person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender));
      }
    } catch (NamingException | SQLException e) {
      e.printStackTrace();
    }finally{
      this.disconnect();
    }
    return list;
  }
  public Person findOne(int person_id){
	      Person person=null;
	      try {
	        this.connect();
	        ps=db.prepareStatement("SELECT * FROM person_date WHERE person_id=?");
	        ps.setInt(1, person_id);
	        rs=ps.executeQuery();
	        if(rs.next()){
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
				person = new Person(person_id,person_name1,person_name2,person_birthday,person_address1,
  						person_address2,person_address3,person_address4,acceptence,person_status, person_protect,
  						person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender);
	        }
	      } catch (NamingException | SQLException e) {
	        e.printStackTrace();
	      }finally{
	        this.disconnect();
	      }
	      return person;
	    }
	    //ここを追記
	    public void updateOne(Person person){
	      try {
	        this.connect();
	        ps=db.prepareStatement("UPDATE person_date SET person_name1=?,person_name2=?,person_birthday=?,"
	        		+ "person_address1=?,person_address2=?,person_address3=?,person_address4=?,acceptance=?,person_status=?, "
	        		+ "person_protect=?,person_parent1=?,person_parent2=?,parent_job=?,parent_phone=?, brother1=?,brother2=?,"
	        		+ "parent_ok=?,person_remarks=?,person_gender=? WHERE person_id=?");
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
	      } catch (NamingException | SQLException e) {
	        e.printStackTrace();
	      }finally{
	        this.disconnect();
	      }
	    }
	  }



