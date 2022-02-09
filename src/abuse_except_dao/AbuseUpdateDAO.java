package abuse_except_dao;

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

import abuse_except_model.AbuseExcept;

public class AbuseUpdateDAO {
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
	public List<AbuseExcept> findAll(){
		List<AbuseExcept> list=new ArrayList<>();
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM abuse_except");
			rs=ps.executeQuery();
			while(rs.next()){
				 String person_protect = rs.getString("person_protect");
					int person_id = rs.getInt("person_id");
					String except_reason = rs.getString("except_reason");
					String except_direction = rs.getString("except_direction");
					String except_status = rs.getString("except_status");
					String except_task = rs.getString("except_task");
					String except_remarks = rs.getString("except_remarks");
					list.add(new AbuseExcept(person_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks));

			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
		return list;
	}
	public AbuseExcept findOne(int person_id){
		AbuseExcept abuse=null;
		try {
			this.connect();
			ps=db.prepareStatement("SELECT * FROM abuse_except WHERE person_id=?");
			ps.setInt(1, person_id);
			rs=ps.executeQuery();
			if(rs.next()){
				String person_protect = rs.getString("person_protect");
				String except_reason = rs.getString("except_reason");
				String except_direction = rs.getString("except_direction");
				String except_status = rs.getString("except_status");
				String except_task = rs.getString("except_task");
				String except_remarks = rs.getString("except_remarks");
				abuse=new AbuseExcept(person_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks);
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
		return abuse;
	}

	public void updateOne(AbuseExcept abuse){
		try {
			this.connect();
			ps=db.prepareStatement("UPDATE abuse_except SET person_name1=?,preson_protect=?,except_reason=?,except_direction=?,\"\r\n" +
					"				  		+ \"except_status=?,except_task=?,except_remarks=? WHERE person_id=?");
			ps.setString(1, abuse.getperson_protect());
			ps.setString(2,abuse.getexcept_reason());
			ps.setString(3,abuse.getexcept_direction());
			ps.setString(4,abuse.getexcept_status());
			ps.setString(5,abuse.getexcept_task());
			ps.setString(6,abuse.getexcept_remarks());
			ps.setInt(7,abuse.getperson_id());
	        ps.executeUpdate();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}finally{
			this.disconnect();
		}
	}
}


