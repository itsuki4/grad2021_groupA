package interview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_dao.InterviewDAO;
import interview_model.Interview;

/**
 * Servlet implementation class InterviewCreate
 */
@WebServlet("/InterviewCreate")
public class InterviewCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		       RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/interview_create.jsp");
		       rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int person_id = Integer.parseInt(request.getParameter("person_id"));
		String person_name1 = request.getParameter("person_name1");
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

			PrintWriter out = response.getWriter();


			 out.println("登録しました");

			 out.println("person_name1="+person_name1);
			 out.println("staff_id="+staff_id);
			 out.println("staff_name1="+staff_name1);
			 out.println("cooperation_attitude="+cooperation_attitude);
			 out.println("personality_progress="+personality_progress);
			 out.println("mental_progress="+mental_progress);
			 out.println("emotional_changes="+emotional_changes);
			 out.println("parental_opinion="+parental_opinion);
			 out.println("immediate_issues="+immediate_issues);
			 out.println("future_tasks="+future_tasks);
			 out.println("personality_remarks="+personality_remarks);
			 out.println("person_id="+person_id);


			 Interview ab = new Interview();


			    ab.setperson_id(person_id);
				ab.setperson_name1(person_name1);
				ab.setstaff_id(staff_id);
				ab.setstaff_name1(staff_name1);
				ab.setcooperation_attitude(cooperation_attitude);
				ab.setpersonality_progress(personality_progress);
				ab.setmental_progress(mental_progress);
				ab.setparental_opinion(parental_opinion);
				ab.setimmediate_issues(immediate_issues);
				ab.setfuture_tasks(future_tasks);
			    ab.setpersonality_remarks(personality_remarks);

				InterviewDAO dao = new InterviewDAO();
				dao.insertOne(ab);


		response.sendRedirect("/grad2021_groupA/InterviewRead");
	}
}