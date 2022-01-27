package abuse_except;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_model.Abuse_Except_Mutter;
import abuse_except_model.GetAbuse_ExceptMutterLogic;

@WebServlet("/Abuse_Except_All")
public class Abuse_Except_All extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		GetAbuse_ExceptMutterLogic getAbuse_ExceptMutterLogic = new GetAbuse_ExceptMutterLogic();
		List<Abuse_Except_Mutter> Abuse_Except_mutterList = getAbuse_ExceptMutterLogic.execute();
		request.setAttribute("abuse_except_mutterList", Abuse_Except_mutterList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/abuse_except_all.jsp");
		dispatcher.forward(request,response);
	}
}