package login_dao;

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

import login_model.Account;


public class AdminDAO {
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



	      public List<Account> StaffAll() {
	    	  List<Account> list = new ArrayList<Account>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM staff_user");
//	    	        ps.setInt(1, role);
	    	        rs = ps.executeQuery();
	    	        while (rs.next()) {
	    	        	int staff_id = rs.getInt("staff_id");
	    	        	int shelter_id = rs.getInt("shelter_id");
	    	        	String staff_name1 = rs.getString("staff_name1");
	    	        	String staff_name2 = rs.getString("staff_name2");
	    		        String staff_pass = rs.getString("staff_pass");
	    		        int staff_role = rs.getInt("staff_role");
	    		        int admin_role = rs.getInt("admin_role");
	    		        Account l = new Account(staff_id ,shelter_id,staff_name1, staff_name2,staff_pass,staff_role,admin_role);
	    	          list.add(l);
	    	        }
	    	      } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return list;
	    	    }
}
