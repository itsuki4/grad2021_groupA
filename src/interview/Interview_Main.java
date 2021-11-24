package interview;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_model.GetInterviewMutterLogic;
import interview_model.Interview_Mutter;

@WebServlet("/Interview_Main")
public class Interview_Main extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		GetInterviewMutterLogic getInterviewMutterLogic = new GetInterviewMutterLogic();
		List<Interview_Mutter> interview_mutterList = getInterviewMutterLogic.execute();
		request.setAttribute("interview_mutterList", interview_mutterList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/interview.jsp");
		dispatcher.forward(request,response);
	}
}