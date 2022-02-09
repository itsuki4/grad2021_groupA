package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Shelter_chat;

public class Shelter_chatDAO {
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
	      
    public Shelter_chatDAO(Shelter_chat ab) {

    	

    	try {
	        this.connect();
	        ps = db.prepareStatement("INSERT INTO sheltercomment (shelter_id, shelter_comment, shelter_send) VALUES (?, ?, ?)");
	        rs = ps.executeQuery();

            ps.setInt(1, ab.getShelter_id());
            ps.setString(2, ab.getShelter_comment());
            ps.setInt(3, ab.getShelter_send());




            int r = ps.executeUpdate();

            if(r != 0) {
                System.out.println("コメントに成功( *´艸｀)！");
            } else {
                System.out.println("コメントに失敗( ﾉД`)ｼｸｼｸ…");
            }

        } catch (NamingException | SQLException e) {
	        e.printStackTrace();
	      }finally {
	        this.disconnect();
	      }
    }
}
