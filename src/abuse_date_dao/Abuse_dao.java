package abuse_date_dao;

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

import abuse_date_model.Abuse_model;

public class Abuse_dao {
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
		  public List<Abuse_model> findAll() {
		    List<Abuse_model> list = new ArrayList<Abuse_model>();

		    // データベースへ接続
		    try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {

		      // SELECT文を準備
		      String sql = "SELECT * FROM abuse_date";
		      PreparedStatement pStmt = conn.prepareStatement(sql);

		      // SELECTを実行し、結果表を取得
		      ResultSet rs = pStmt.executeQuery();

		      while(rs.next()){
		    	  int person_protect = rs.getInt("person_protect");
		    	  int person_id = rs.getInt("person_id");
		    	  String family_structure = rs.getString("family_structure");
		    	  int abuse_kinds = rs.getInt("abuse_kinds");
		    	  int abuse_degree = rs.getInt("abuse_degree");
		    	  String abuse_continuation = rs.getString("abuse_continuation");
		    	  String  physical_condition = rs.getString("physical_condition");
		    	  String  mental_condition = rs.getString("mental_condition");
		    	  int  daily_lack= rs.getInt("daily_lack");
		    	  String  consciousness = rs.getString("consciousness");
		    	  int  problem_behavior = rs.getInt("problem_behavior");
		    	  int  family_problems = rs.getInt("family_problems");
		    	  int  economy_problem= rs.getInt("economy_problem");
		    	  int  living_environment = rs.getInt("living_environment");
		    	  int caregiver_personality = rs.getInt("caregiver_personality");
		    	  int  caregiver_mental = rs.getInt("caregiver_mental");
		    	  int caregiver_childcare = rs.getInt("caregiver_childcare");
		    	  int children_emotions = rs.getInt("children_emotions");
		    	  int abuse_awareness= rs.getInt("abuse_awareness");
		    	  int neglect = rs.getInt("neglect");
		    	  int childcare_knowledge = rs.getInt("childcare_knowledge");
		    	  int social_support = rs.getInt("social_support");
		    	  int cooperation_attitude = rs.getInt("cooperation_attitude");
		    	  int aid_effect = rs.getInt("aid_effect");
		    	  String childrens_opinion = rs.getString("childrens_opinion");
		    	  String parental_opinion = rs.getString("parental_opinion");
		    	  String immediate_issues = rs.getString("immediate_issues");
		    	  String direction_support = rs.getString("direction_support");
		          String remarks = rs.getString("remarks");

		    	  Abuse_model abuse_model = new Abuse_model(person_protect,person_id,family_structure,abuse_kinds,abuse_degree,abuse_continuation,physical_condition,mental_condition,
		    	  daily_lack,consciousness,problem_behavior,family_problems,economy_problem,living_environment,caregiver_personality,caregiver_mental,
		    	  caregiver_childcare,children_emotions,abuse_awareness,neglect,childcare_knowledge,social_support,cooperation_attitude,
		    	  aid_effect,childrens_opinion,parental_opinion,immediate_issues,direction_support,remarks);
		    	  list.add(abuse_model);
		      }
		    } catch (SQLException e) {
		      e.printStackTrace();
		      return null;
		    }
		    return list;
		  }
}
