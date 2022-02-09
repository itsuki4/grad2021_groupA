package interview;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_dao.InterviewUpdateDAO;
import interview_model.Interview;


@WebServlet("/InterviewUpdate")
public class InterviewUpdate extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
      response.sendRedirect("/grad2021_groupA/IntewviewRead");
    }else{
      InterviewUpdateDAO dao=new InterviewUpdateDAO();
      Interview interview=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("interview", interview);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/abuse_exceptupdate.jsp");
      rd.forward(request, response);
    }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //以下を追記
    request.setCharacterEncoding("UTF-8");
    int person_id = Integer.parseInt(request.getParameter("person_id"));
	String person_name1 = request.getParameter("person_name1");
	String interview_date = request.getParameter("person_date");
	int staff_id = Integer.parseInt(request.getParameter("staff_id"));
	String staff_name1 = request.getParameter("staff_name1");
	String cooperation_attitude = request.getParameter("cooperation_attitude");
	String personality_progress = request.getParameter("personality_progress");
	String mental_progress = request.getParameter("mental_progress");
	String emotional_changes = request.getParameter("emotional_changes");
	String parental_opinion = request.getParameter("parental_opinion");
	String immediate_issues = request.getParameter("immediate_issues");
	String future_tasks = request.getParameter("future_tasks");
	String personality_remarks = request.getParameter("personality_remarks");

	Interview interview=new Interview(person_id,person_name1,interview_date,staff_id,
			staff_name1,cooperation_attitude,personality_progress,mental_progress,emotional_changes,
			parental_opinion,immediate_issues,future_tasks,personality_remarks);
    InterviewUpdateDAO dao=new InterviewUpdateDAO();
    dao.updateOne(interview);

    response.sendRedirect("/grad2021_groupA/InterviewRead");
}
}