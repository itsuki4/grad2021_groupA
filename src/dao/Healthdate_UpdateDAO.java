
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Healthdate_update;


public class Healthdate_UpdateDAO {
	public Healthdate_UpdateDAO(Healthdate_update ab) {
		final String JDBC_URL =
				"jdbc:mySQL://localhost/GroupA";
		final String DB_USER = "root";
		final String DB_PASS = "";

		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			String sql = "UPDATE health_date SET person_body =?," +
					"person_check =?, person_datail =?,allergies =?,allergies_degree =?, allergies_remarks=?,"+
					"chronic_condition =?,chronic_correspondence=?,insomnia=?,frightened=?,"+
					"depression=?,mental_remarks=?,suicide=?,dehydration=?,malnutrition=?,"+
					"unbalanced_diet=?, unbalanced_remarks=?, scratch_point=?,scratch_number=?,"+
					"scratch_size =?,scratch_colour=?,scratch_remarks=?,hindrance=?,person_remarks=? where person_id like ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1,ab.getPerson_body());
			ps.setInt(2,ab.getPerson_check());
			ps.setInt(3,ab.getPerson_datail());
			ps.setString(4, ab.getAllergies());
			ps.setInt(5,ab.getAllergies_degree());

			ps.setString(6, ab.getAllergies_remarks());
			ps.setString(7, ab.getChronic_condition());
			ps.setString(8, ab.getChronic_correspondence());
			ps.setInt(9,ab.getInsomnia());
			ps.setInt(10,ab.getFrightened());

			ps.setInt(11,ab.getDepression());
			ps.setString(12, ab.getMental_remarks());
			ps.setInt(13,ab.getSuicide());
			ps.setInt(14,ab.getDehydration());
			ps.setInt(15,ab.getMalnutrition());

			ps.setInt(16,ab.getUnbalanced_diet());
			ps.setString(17, ab.getUnbalanced_remarks());
			ps.setString(18, ab.getScratch_point());
			ps.setInt(19,ab.getScratch_number());
			ps.setInt(20,ab.getScratch_size());

			ps.setInt(21,ab.getScratch_colour());
			ps.setString(22,ab.getScratch_remarks());
			ps.setInt(23,ab.getHindrance());
			ps.setString(24, ab.getPerson_remarks());
			ps.setInt(25,ab.getPerson_id());

			int r = ps.executeUpdate();

			if(r != 0) {
				System.out.println("成功");
			}else {
				System.out.println("失敗");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
