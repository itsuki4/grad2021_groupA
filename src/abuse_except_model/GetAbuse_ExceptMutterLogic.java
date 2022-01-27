package abuse_except_model;

import java.util.List;

import abuse_except_dao.Abuse_Except_MutterDAO;

public class GetAbuse_ExceptMutterLogic{
	public List<Abuse_Except_Mutter> execute(){
		Abuse_Except_MutterDAO dao = new Abuse_Except_MutterDAO();
		List<Abuse_Except_Mutter> mutterList = dao.findAll();
		return mutterList;
	}
}