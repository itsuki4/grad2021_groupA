
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Person;

public class PersonDAO {
	// データベース接続に使用する情報
		  private final String JDBC_URL =
		          "jdbc:mySQL://localhost/groupa";
		  private final String DB_USER = "root";
		  private final String DB_PASS = "";
		  private Connection db;
		  private PreparedStatement ps;
		  private ResultSet rs;

		  private void connect() throws NamingException, SQLException {
				Context context = new InitialContext();
				DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
				this.db = ds.getConnection();
			}
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
		  public List<Person> findAll() {
		    List<Person> list = new ArrayList<Person>();

		    // データベースへ接続
		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {

		      // SELECT文を準備
		      String sql = "SELECT * FROM person_user WHERE shelter_id < 200000";
		      PreparedStatement pStmt = conn.prepareStatement(sql);

		      // SELECTを実行し、結果表を取得
		      ResultSet rs = pStmt.executeQuery();

		      while(rs.next()){
	  				int person_id = rs.getInt("person_id");
	  				String shelter_name1 = rs.getString("shelter_name1");
	  				String shelter_name2 = rs.getString("shelter_name2");
	  				String person_name1 = rs.getString("person_name1");
	  				String person_name2 = rs.getString("person_name2");
	  				String person_start =rs.getString("person_start");
	  				String person_end = rs.getString("person_end");
	  				int shelter_id = rs.getInt("shelter_id");
	  				String person_parent1 = rs.getString("person_parent1");
	  				String person_parent2 = rs.getString("person_parent2");
	  				int person_brother = rs.getInt("person_brother");
	  				Person person = new Person(person_id,shelter_name1,shelter_name2,person_name1,person_name2,person_start,person_end,shelter_id, person_parent1,person_parent2,person_brother);
	  				list.add(person);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return list;
		  }

		  //DBへ追加の処理
		  public void insertOne(Person person){
				try {
					this.connect();
					ps=db.prepareStatement("INSERT INTO person_user(shelter_name1,shelter_name2,person_name1,person_name2,person_start,person_end,shelter_id,person_parent1,person_parent2) VALUES(?,?,?,?,?,?,?,?,?)");
					ps.setString(1, person.getShelter_name1());
					ps.setString(2, person.getShelter_name2());
					ps.setString(3, person.getPerson_name1());
					ps.setString(4, person.getPerson_name2());
					ps.setString(5, person.getPerson_start());
					ps.setString(6, person.getPerson_end());
					ps.setInt(7,person.getShelter_id());
					ps.setString(8, person.getPerson_parent1());
					ps.setString(9, person.getPerson_parent2());
					ps.executeUpdate();
				} catch (NamingException | SQLException e) {
					e.printStackTrace();
				}finally{
					this.disconnect();
				}
			}

		  //DBの編集（フォームに反映）の処理
		  public Person findOne(int id){
				Person person=null;
				try {
					this.connect();
					ps=db.prepareStatement("SELECT * FROM person_user WHERE person_id=?");
					ps.setInt(1, id);
					rs=ps.executeQuery();
					if(rs.next()){
						String shelter_name1 = rs.getString("shelter_name1");
		  				String shelter_name2 = rs.getString("shelter_name2");
		  				String person_name1 = rs.getString("person_name1");
		  				String person_name2 = rs.getString("person_name2");
		  				String person_start =rs.getString("person_start");
		  				String person_end = rs.getString("person_end");
		  				int shelter_id = rs.getInt("shelter_id");
		  				String person_parent1 = rs.getString("person_parent1");
		  				String person_parent2 = rs.getString("person_parent2");
//		  				int person_brother = rs.getInt("person_brother");
						person=new Person(id,shelter_name1,shelter_name2,person_name1,person_name2,person_start,person_end,shelter_id, person_parent1,person_parent2);
					}
				} catch (NamingException | SQLException e) {
					e.printStackTrace();
				}finally{
					this.disconnect();
				}
				return person;
			}

		  //DB編集の処理
		  public void updateOne(Person person){
				try {
					this.connect();
					ps=db.prepareStatement("UPDATE person_user SET shelter_name1=?,shelter_name2=?,person_name1=?,person_name2=?,person_start=?,person_end=?,shelter_id=?,person_parent1=?,person_parent2=? WHERE person_id=?");
					ps.setString(1, person.getShelter_name1());
					ps.setString(2, person.getShelter_name2());
					ps.setString(3, person.getPerson_name1());
					ps.setString(4, person.getPerson_name2());
					ps.setString(5, person.getPerson_start());
					ps.setString(6, person.getPerson_end());
					ps.setInt(7,person.getShelter_id());
					ps.setString(8, person.getPerson_parent1());
					ps.setString(9, person.getPerson_parent2());
					ps.setInt(10, person.getPerson_id());
					ps.executeUpdate();
				} catch (NamingException | SQLException e) {
					e.printStackTrace();
				}finally{
					this.disconnect();
				}
			}

		  //DB削除の処理
		  public void deleteOne(int id){
				try {
					this.connect();
					ps=db.prepareStatement("DELETE FROM person_user WHERE person_id=?");
					ps.setInt(1, id);
					ps.executeUpdate();
				} catch (NamingException | SQLException e) {
					e.printStackTrace();
				}finally{
					this.disconnect();
				}
			}
}
