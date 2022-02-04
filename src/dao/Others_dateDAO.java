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

import model.Others;
import model.Others_date;

public class Others_dateDAO {

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

      public List<Others_date> findAll() {
    	  List<Others_date> othersList = new ArrayList<Others_date>();

    	  try {
			  this.connect();
    	        ps = db.prepareStatement("SELECT * FROM Others_date");
    	        rs = ps.executeQuery();

    	        while (rs.next()) {
    	        	int person_id = rs.getInt("person_id");
    	        	String provider_name = rs.getString("provider_name");
    	        	String provider_name2 = rs.getString("provider_name2");
    	        	int shelter_address1 = rs.getInt("shelter_address1");
    	        	String shelter_address2 = rs.getString("shelter_address2");
    	        	String shelter_address3 = rs.getString("shelter_address3");
    	        	String shelter_address4 = rs.getString("shelter_address4");
    	        	int source = rs.getInt("source");
    	        	String provider_relationship = rs.getString("provider_relationship");
    	        	String notification = rs.getString("notification");
    	        	int cooperation = rs.getInt("cooperation");
    	        	int contact = rs.getInt("contact");
    	        	int contents = rs.getInt("contents");
    	        	String provider_remarks = rs.getString("provider_remarks");
    	        	int page_no = rs.getInt("page_no");

    	        	Others_date others_date = new Others_date(person_id, provider_name, provider_name2,
    	        			shelter_address1,shelter_address2, shelter_address3, shelter_address4,
    	        			source, provider_relationship, notification, cooperation, contact,
    	        			contents, provider_remarks, page_no);

    	        	othersList.add(others_date);
    	        	}
    	  		} catch (NamingException | SQLException e) {
  			      e.printStackTrace();
  			    } finally {
  			    	this.disconnect();
  			    }
  			  return othersList;
  		  }

      	public List<Others> OthersAll() {
      		List<Others> List = new ArrayList<Others>();
      		try {
    	        this.connect();
    	        ps = db.prepareStatement("SELECT person_id, provider_name, provider_relationship FROM Others_date");
    	        rs = ps.executeQuery();

    	        while (rs.next()) {
    	        	int person_id = rs.getInt("person_id");
    	        	String provider_name = rs.getString("provider_name");
    	        	String provider_relationship = rs.getString("provider_relationship");

    	        	Others others = new Others(person_id, provider_name, provider_relationship);
    	        	List.add(others);
    	        }
      		} catch (NamingException | SQLException e) {
      			e.printStackTrace();
      			}finally {
      	    	   this.disconnect();
      	    	}
      	    	 return List;
      		  }

      	}