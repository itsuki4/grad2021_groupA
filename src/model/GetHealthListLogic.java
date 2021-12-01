package model;

import java.util.List;

import dao.Health_dateDAO;

public class GetHealthListLogic {
	public List<Health_date> execute() {
		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> healthList = dao.findAll();
		return healthList;
	}
}