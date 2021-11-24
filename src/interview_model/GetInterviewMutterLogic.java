package interview_model;

import java.util.List;

import interview_dao.Interview_MutterDAO;

public class GetInterviewMutterLogic{
	public List<Interview_Mutter> execute(){
		Interview_MutterDAO dao = new Interview_MutterDAO();
		List<Interview_Mutter> mutterList = dao.findAll();
		return mutterList;
	}
}