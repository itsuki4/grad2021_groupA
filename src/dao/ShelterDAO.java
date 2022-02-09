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

import model.Shelter;
import model.Shelter_Date;
import model.Shelter_chatList;

public class ShelterDAO {

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



	      public List<Shelter> ShelterAll() {
	    	  List<Shelter> list = new ArrayList<Shelter>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT shelter_name1,shelter_id,shelter_conditions,shelter_vacancy FROM shelter_date");
	    	        rs = ps.executeQuery();
	    	        while (rs.next()) {
	    	        	int id = rs.getInt("shelter_id");
	    	        	String shelter_name1 = rs.getString("shelter_name1");
	    		        String shelter_conditions = rs.getString("shelter_conditions");
	    		        int shelter_vacancy = rs.getInt("shelter_vacancy");
	    		        Shelter l = new Shelter(id,shelter_name1, shelter_conditions,shelter_vacancy);
	    	          list.add(l);
	    	        }
	    	      } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return list;
	    	    }


	      public List<Shelter_Date> search(String pre) throws Exception{
	    	  List<Shelter_Date> list = new ArrayList<Shelter_Date>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM shelter_date where shelter_address2 like ?");
	    	        ps.setString(1, "%"+ pre +"%");
	    	        rs = ps.executeQuery();




	    	        while (rs.next()) {
	    	        	int id = rs.getInt("shelter_id");
	    		        String shelter_name1 = rs.getString("shelter_name1");
	    		        String shelter_name2 = rs.getString("shelter_name2");
	    		        String shelter_address1 = rs.getString("shelter_address1");
	    		        String shelter_address2 = rs.getString("shelter_address2");
	    		        String shelter_address3 = rs.getString("shelter_address3");
	    		        String shelter_address4 = rs.getString("shelter_address4");
	    		        String tel = rs.getString("shelter_tel");
	    		        int capacity = rs.getInt("shelter_capacity");
	    		        String shelter_conditions = rs.getString("shelter_conditions");
	    		        int shelter_vacancy = rs.getInt("shelter_vacancy");
	    		        Shelter_Date l = new Shelter_Date(id, shelter_name1,shelter_name2, shelter_address1,shelter_address2,shelter_address3,shelter_address4,tel,capacity,shelter_conditions,shelter_vacancy);
	    	          list.add(l);
	    	        }
	    	      } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return list;
	    	    }


	      public List<Shelter_Date> ShelterDetail(int Sid) {
	    	  List<Shelter_Date> list = new ArrayList<Shelter_Date>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM shelter_date where shelter_id like ?");
	    	        ps.setInt(1, Sid);
	    	        rs = ps.executeQuery();




	    	        while (rs.next()) {
	    	        	int id = rs.getInt("shelter_id");
	    		        String shelter_name1 = rs.getString("shelter_name1");
	    		        String shelter_name2 = rs.getString("shelter_name2");
	    		        String shelter_address1 = rs.getString("shelter_address1");
	    		        String shelter_address2 = rs.getString("shelter_address2");
	    		        String shelter_address3 = rs.getString("shelter_address3");
	    		        String shelter_address4 = rs.getString("shelter_address4");
	    		        String tel = rs.getString("shelter_tel");
	    		        int capacity = rs.getInt("shelter_capacity");
	    		        String shelter_conditions = rs.getString("shelter_conditions");
	    		        int shelter_vacancy = rs.getInt("shelter_vacancy");
	    		        Shelter_Date l = new Shelter_Date(id, shelter_name1,shelter_name2, shelter_address1,shelter_address2,shelter_address3,shelter_address4,tel,capacity,shelter_conditions,shelter_vacancy);
	    	          list.add(l);
	    	        }
	    	      } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return list;
	    	    }

	      public List<Shelter_chatList> Shelter_chat(int Sid) {
	    	  List<Shelter_chatList> list = new ArrayList<Shelter_chatList>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM sheltercomment where shelter_id like ?");
	    	        ps.setInt(1, Sid);
	    	        rs = ps.executeQuery();


	    	        while (rs.next()) {
	    	        	int id = rs.getInt("shelter_id");
	    		        String shelter_comment = rs.getString("shelter_comment");


	    		        String interview_date = rs.getString("interview_date");
	    		        int shelter_send = rs.getInt("shelter_send");

	    		        Shelter_chatList l = new  Shelter_chatList(id, shelter_comment,interview_date,shelter_send);
	    	          list.add(l);
	    	        }
	    	      } catch (NamingException | SQLException e) {
	    	        e.printStackTrace();
	    	      }finally {
	    	        this.disconnect();
	    	      }
	    	      return list;
	    	    }


	      public List<Shelter_Date> vacancySearch(String v)throws Exception{
	    	  List<Shelter_Date> list = new ArrayList<Shelter_Date>();
	    	      try {
	    	        this.connect();
	    	        ps = db.prepareStatement("SELECT * FROM shelter_date where shelter_conditions like ?");
	    	        ps.setString(1, "%"+ v +"%");
	    	        rs = ps.executeQuery();


	    	        while (rs.next()) {
	    	        	int id = rs.getInt("shelter_id");
	    		        String shelter_name1 = rs.getString("shelter_name1");
	    		        String shelter_name2 = rs.getString("shelter_name2");
	    		        String shelter_address1 = rs.getString("shelter_address1");
	    		        String shelter_address2 = rs.getString("shelter_address2");
	    		        String shelter_address3 = rs.getString("shelter_address3");
	    		        String shelter_address4 = rs.getString("shelter_address4");
	    		        String tel = rs.getString("shelter_tel");
	    		        int capacity = rs.getInt("shelter_capacity");
	    		        String shelter_conditions = rs.getString("shelter_conditions");
	    		        int shelter_vacancy = rs.getInt("shelter_vacancy");
	    		        Shelter_Date l = new Shelter_Date(id, shelter_name1,shelter_name2, shelter_address1,shelter_address2,shelter_address3,shelter_address4,tel,capacity,shelter_conditions,shelter_vacancy);
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
