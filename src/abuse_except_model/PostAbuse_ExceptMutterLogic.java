package abuse_except_model;

import abuse_except_dao.Abuse_Except_MutterDAO;

public class PostAbuse_ExceptMutterLogic{
	public void execute(Abuse_Except_Mutter mutter) {
		Abuse_Except_MutterDAO dao = new Abuse_Except_MutterDAO();
		dao.create(mutter);
	}
}