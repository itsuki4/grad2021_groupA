package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Healthdate_add;

public class Healthdate_AddDAO {
	public Healthdate_AddDAO(Healthdate_add ab) {

		final String JDBC_URL =
				"jdbc:mySQL://localhost/GroupA";
		final String DB_USER = "root";
		final String DB_PASS = "";

		try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			String sql = "INSERT health_date SET person_id,person_body," +
					"person_check, person_datail,allergies,allergies_degree , allergies_remarks,"+
					"chronic_condition,chronic_correspondence,insomnia,frightened,"+
					"depression,mental_remarks,suicide,dehydration,malnutrition,"+
					"unbalanced_diet, unbalanced_remarks, scratch_point,scratch_number,"+
					"scratch_size ,scratch_colour,scratch_remarks,hindrance,person_remarks where person_id like ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1,ab.getPerson_id());
			ps.setInt(2,ab.getPerson_body());
			ps.setInt(3,ab.getPerson_check());
			ps.setInt(4,ab.getPerson_datail());
			ps.setString(5, ab.getAllergies());

			ps.setInt(6,ab.getAllergies_degree());
			ps.setString(7, ab.getAllergies_remarks());
			ps.setString(8, ab.getChronic_condition());
			ps.setString(9, ab.getChronic_correspondence());
			ps.setInt(10,ab.getInsomnia());

			ps.setInt(11,ab.getFrightened());
			ps.setInt(12,ab.getDepression());
			ps.setString(13, ab.getMental_remarks());
			ps.setInt(14,ab.getSuicide());
			ps.setInt(15,ab.getDehydration());

			ps.setInt(16,ab.getMalnutrition());
			ps.setInt(17,ab.getUnbalanced_diet());
			ps.setString(18, ab.getUnbalanced_remarks());
			ps.setString(19, ab.getScratch_point());
			ps.setInt(20,ab.getScratch_number());

			ps.setInt(21,ab.getScratch_size());
			ps.setInt(22,ab.getScratch_colour());
			ps.setString(23,ab.getScratch_remarks());
			ps.setInt(24,ab.getHindrance());
			ps.setString(25, ab.getPerson_remarks());


			int r = ps.executeUpdate();

			if(r != 0) {
				System.out.println("追加成功");
			}else {
				System.out.println("追加失敗");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}