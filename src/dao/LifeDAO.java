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

import model.Life;

public class LifeDAO {
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
		  public List<Life> findAll() {
		    List<Life> list = new ArrayList<Life>();

		    // データベースへ接続
		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {

		      // SELECT文を準備
		      String sql = "SELECT * FROM behavior_observation_record";
		      PreparedStatement pStmt = conn.prepareStatement(sql);

		      // SELECTを実行し、結果表を取得
		      ResultSet rs = pStmt.executeQuery();

		      while(rs.next()){
	  				int page_no = rs.getInt("page_no");
	  				int person_id = rs.getInt("person_id");
	  				String create_data= rs.getString("create_data");
	  				int detachable= rs.getInt("detachable");
	  				String detachable_remarks= rs.getString("detachable_remarks");
	  				int meal= rs.getInt("meal");
	  				int meal_form= rs.getInt("meal_form");
	  				String meal_form_remarks= rs.getString("meal_form_remarks");
	  				int excretion= rs.getInt("excretion");
	  				String excretion_remarks= rs.getString("excretion_remarks");
	  				int interpersonal= rs.getInt("interpersonal");
	  				String interpersonal_remarks= rs.getString("interpersonal_remarks");
	  				int collective= rs.getInt("collective");
	  				String collective_remarks= rs.getString("collective_remarks");
	  				int management= rs.getInt("management");
	  				String management_remarks= rs.getString("management_remarks");
	  				int understanding= rs.getInt("understanding");
	  				String understanding_remarks= rs.getString("understanding_remarks");
	  				int phonation= rs.getInt("phonation");
	  				String phonation_remarks= rs.getString("phonation_remarks");
	  				int reading= rs.getInt("reading");
	  				String reading_remarks= rs.getString("reading_remarks");
	  				int writing= rs.getInt("writing");
	  				String writing_remarks= rs.getString("writing_remarks");
	  				int number_concept= rs.getInt("number_concept");
	  				int calculation= rs.getInt("calculation");
	  				String other_concept= rs.getString("other_concept");
	  				String number_remarks= rs.getString("number_remarks");
	  				String action= rs.getString("action");
	  				String remarks= rs.getString("remarks");
	  				Life life = new Life(page_no,person_id,
	  					   create_data,
	  					   detachable,
	  					   detachable_remarks,
	  					   meal,
	  					   meal_form,
	  					   meal_form_remarks,
	  					   excretion,
	  					   excretion_remarks,
	  					   interpersonal,
	  					   interpersonal_remarks,
	  					   collective,
	  					   collective_remarks,
	  					   management,
	  					   management_remarks,
	  					   understanding,
	  					   understanding_remarks,
	  					   phonation,
	  					   phonation_remarks,
	  					   reading,
	  					   reading_remarks,
	  					   writing,
	  					   writing_remarks,
	  					   number_concept,
	  					   calculation,
	  					   other_concept,
	  					   number_remarks,
	  					   action,
	  					   remarks);
	  				list.add(life);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return list;
		  }
		  //DBへ追加の処理
		  public void insertOne(Life life){
				try {
					this.connect();
					ps=db.prepareStatement("INSERT INTO behavior_observation_record(page_no,person_id, detachable,detachable_remarks,meal,meal_form,meal_form_remarks,excretion,excretion_remarks, interpersonal, interpersonal_remarks,collective,collective_remarks, management,management_remarks, understanding, understanding_remarks,phonation,phonation_remarks,reading,reading_remarks,writing, writing_remarks,number_concept,calculation, other_concept,number_remarks,action,remarks) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, life.getPage_no());
					ps.setInt(2, life.getPerson_id());
					ps.setInt(3, life.getDetachable());
					ps.setString(4, life.getDetachable_remarks());
					ps.setInt(5, life.getMeal());
					ps.setInt(6, life.getMeal_form());
					ps.setString(7, life.getMeal_form_remarks());
					ps.setInt(8, life.getExcretion());
					ps.setString(9, life.getExcretion_remarks());
					ps.setInt(10, life.getInterpersonal());
					ps.setString(11, life.getInterpersonal_remarks());
					ps.setInt(12, life.getCollective());
					ps.setString(13, life.getCollective_remarks());
					ps.setInt(14, life.getManagement());
					ps.setString(15, life.getManagement_remarks());
					ps.setInt(16, life.getUnderstanding());
					ps.setString(17, life.getUnderstanding_remarks());
					ps.setInt(18, life.getPhonation());
					ps.setString(19, life.getPhonation_remarks());
					ps.setInt(20, life.getReading());
					ps.setString(21, life.getReading_remarks());
					ps.setInt(22, life.getWriting());
					ps.setString(23, life.getWriting_remarks());
					ps.setInt(24, life.getNumber_concept());
					ps.setInt(25, life.getCalculation());
					ps.setString(26, life.getOther_concept());
					ps.setString(27, life.getNumber_remarks());
					ps.setString(28, life.getAction());
					ps.setString(29, life.getRemarks());
					ps.executeUpdate();
				} catch (NamingException | SQLException e) {
					e.printStackTrace();
				}finally{
					this.disconnect();
				}
			}

}
