package abuse_except;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_dao.Abuse_Except_MutterDAO;
import abuse_except_model.Abuse_Except_Mutter;
import abuse_except_model.GetAbuse_ExceptMutterLogic;
import abuse_except_model.PostAbuse_ExceptMutterLogic;

@WebServlet("/Abuse_Except_Create")
public class Abuse_Except_Create extends HttpServlet {
	private int person_protect;
	private int person_id;
	private int except_reason;
	private int except_direction;
	private int except_status;
	private int except_task;
	private String except_remarks;
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		       Abuse_Except_Mutter mutter =new Abuse_Except_Mutter( person_protect, person_id, except_reason, except_direction, except_status, except_task, except_remarks);
				PostAbuse_ExceptMutterLogic postAbuse_ExceptMutterLogic = new PostAbuse_ExceptMutterLogic();
				postAbuse_ExceptMutterLogic.execute(mutter);
				Abuse_Except_MutterDAO dao=new Abuse_Except_MutterDAO();
				dao.create(mutter);
			}

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		GetAbuse_ExceptMutterLogic getAbuse_ExceptMutterLogic = new GetAbuse_ExceptMutterLogic();
		List<Abuse_Except_Mutter> abuse_except_mutterList = getAbuse_ExceptMutterLogic.execute();
		request.setAttribute("abuse_except_mutterList", abuse_except_mutterList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/person_date_create.jsp");
		dispatcher.forward(request,response);
	}
}
