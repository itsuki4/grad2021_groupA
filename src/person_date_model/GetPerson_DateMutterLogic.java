package person_date_model;

import java.util.List;

import person_date_dao.Person_Date_MutterDAO;

public class GetPerson_DateMutterLogic{
	public List<Person_Date_Mutter> execute(){
		Person_Date_MutterDAO dao = new Person_Date_MutterDAO();
		List<Person_Date_Mutter> mutterList = dao.findAll();
		return mutterList;
	}
}