package dao;

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

import model.Health;
import model.Health_date;

public class Health_dateDAO {

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


		  public List<Health_date> findAll() {
			  List<Health_date> healthList = new ArrayList<Health_date>();

			  try {
				  this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM Health_date");
	    	        rs = ps.executeQuery();

			      while (rs.next()) {
			        int person_id = rs.getInt("person_id");
			        int person_body = rs.getInt("person_body");
			        int person_check = rs.getInt("person_check");
			        int person_datail = rs.getInt("person_datail");
			        String allergies = rs.getString("allergies");
			        int allergies_degree = rs.getInt("allergies_degree");
			        String allergies_remarks = rs.getString("allergies_remarks");
			        String	chronic_condition = rs.getString("chronic_condition");
			        String chronic_correspondence = rs.getString("chronic_correspondence");
			        int insomnia = rs.getInt("insomnia");
			        int frightened = rs.getInt("frightened");
			        int depression = rs.getInt("depression");
			        String mental_remarks = rs.getString("mental_remarks");
			        int suicide = rs.getInt("suicide");
			        int dehydration = rs.getInt("dehydration");
			        int malnutrition = rs.getInt("malnutrition");
			        int unbalanced_diet = rs.getInt("unbalanced_diet");
			        String unbalanced_remarks = rs.getString("unbalanced_remarks");
			        String scratch_point = rs.getString("scratch_point");
			        int scratch_number = rs.getInt("scratch_number");
			        int scratch_size = rs.getInt("scratch_size");
			        int scratch_colour = rs.getInt("scratch_colour");
			        String scratch_remarks = rs.getString("scratch_remarks");
			        int hindrance = rs.getInt("hindrance");
			        String person_remarks = rs.getString("person_remarks");
			        String create_data = rs.getString("create_data");

			        Health_date  health_date = new Health_date(person_id,person_body,person_check,person_datail,
			        		allergies,allergies_degree,allergies_remarks,chronic_condition,chronic_correspondence,insomnia,frightened,
			        		depression,mental_remarks,suicide,dehydration,malnutrition,unbalanced_diet,
			        		unbalanced_remarks,scratch_point,scratch_number,scratch_size,scratch_colour,
			        		scratch_remarks,hindrance,person_remarks,create_data);

			        healthList.add(health_date);
			      }
			    } catch (NamingException | SQLException e) {
			      e.printStackTrace();
			    } finally {
			    	this.disconnect();
			    }
			  return healthList;
		  }

		  public List<Health> HealthAll() {
			  List<Health> List = new ArrayList<Health>();
			  try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT person_id, person_remarks, create_data FROM health_date");
	    	        rs = ps.executeQuery();

	    	        while (rs.next()) {
	    	        	int person_id = rs.getInt("person_id");
	    	        	String person_remarks = rs.getString("person_remarks");
				        String create_data = rs.getString("create_data");

				        Health health = new Health(person_id, person_remarks, create_data);
				        List.add(health);
	    	        }
			  } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return List;
		  }
//			  public boolean create(Health_date health_date) {
//			    // データベース接続
//		    try(Connection conn = DriverManager.getConnection(
//			          JDBC_URL, DB_USER, DB_PASS)) {
//
//			      // INSERT文の準備(idは自動連番なので指定しなくてよい
//			      String sql = "INSERT INTO HEALTH_DATE(PERSON_BODY, PERSON_CHECK, PERSON_DATAIL, ALLERGIES, ALLERGIES_DEGREE,"
//			      		+ "ALLERGIES_REMARKS, CHRONIC_CONDITION, CHRONIC_CORRESPONDENCE, INSOMNIA, FRIGHTENED, DEPRESSION,"
//			      		+ "MENTAL_REMARKS, SUICIDE, DEHYDRATION, MALNUTRITION, UNBALANCED_DIET, UNBALANCED_REMARKS,"
//			      		+ "SCRATCH_POINT, SCRATCH_NUMBER, SCRATCH_SIZE, SCRATCH_COLOUR, SCRATCH_REMARKS, HINDRANCE,"
//			      		+ "PERSON_REMARKS, CREATE_DATA)"
//			      		+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//			      PreparedStatement pStmt = conn.prepareStatement(sql);
//			      // INSERT文中の「?」に使用する値を設定しSQLを完成
//			      pStmt.setInt(1, health_date.getPerson_body());
//			      pStmt.setInt(2, health_date.getPerson_check());
//			      pStmt.setInt(3, health_date.getPerson_datail());
//			      pStmt.setString(4, health_date.getAllergies());
//			      pStmt.setInt(5, health_date.getAllergies_degree());
//			      pStmt.setString(6, health_date.getAllergies_remarks());
//			      pStmt.setString(7, health_date.getChronic_condition());
//			      pStmt.setString(8, health_date.getChronic_correspondence());
//			      pStmt.setInt(9, health_date.getInsomnia());
//			      pStmt.setInt(10, health_date.getFrightened());
//			      pStmt.setInt(11, health_date.getDepression());
//			      pStmt.setString(12, health_date.getMental_remarks());
//			      pStmt.setInt(13, health_date. getSuicide());
//			      pStmt.setInt(14, health_date.getDehydration());
//			      pStmt.setInt(15, health_date.getMalnutrition());
//			      pStmt.setInt(16, health_date.getUnbalanced_diet());
//			      pStmt.setString(17, health_date.getUnbalanced_remarks());
//			      pStmt.setString(18, health_date.getScratch_point());
//			      pStmt.setInt(19, health_date.getScratch_number());
//			      pStmt.setInt(20, health_date.getScratch_size());
//			      pStmt.setInt(21, health_date.getScratch_colour());
//			      pStmt.setString(22, health_date.getScratch_remarks());
//			      pStmt.setInt(23, health_date.getHindrance());
//			      pStmt.setString(24, health_date.getPerson_remarks());
//			      pStmt.setString(25, health_date.getCreate_data());
//
//			      // INSERT文を実行
//			      int result = pStmt.executeUpdate();
//
//			      if (result != 1) {
//			        return false;
//			      }
//			    } catch (SQLException e) {
//			      e.printStackTrace();
//			      return false;
//			    }
//		    	return true;
//			  }

		  }


