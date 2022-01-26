package person_date_model;

import java.util.List;

import person_date_dao.PersonDAO;

public class GetPerson_DateMutterLogic{
	public List<Person> execute(){
		PersonDAO dao = new PersonDAO();
		List<Person> mutterList = dao.findAll();
		return mutterList;
	}
}