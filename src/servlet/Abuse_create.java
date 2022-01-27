package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AbuseDAO;
import model.Abuse;

@WebServlet("/Abuse_Create")
public class Abuse_create extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/abuse_create.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String preson_protect=request.getParameter("preson_protect");
		String person_id=request.getParameter("person_id");
		String family_structure=request.getParameter("family_structure");
		String abuse_kinds=request.getParameter("abuse_kinds");
		String abuse_degree=request.getParameter("abuse_degree");
		String abuse_continuation=request.getParameter("abuse_continuation");
		String physical_condition=request.getParameter("physical_condition");
		String mental_condition=request.getParameter("mental_condition");
		String daily_lack=request.getParameter("daily_lack");
		String consciousness=request.getParameter("consciousness");
		String problem_behavior=request.getParameter("problem_behavior");
		String family_problems=request.getParameter("family_problems");
		String economy_problem=request.getParameter("economy_problem");
		String living_environment=request.getParameter("living_environment");
		String caregiver_personality=request.getParameter("caregiver_personality");
		String caregiver_mental=request.getParameter("caregiver_mental");
		String caregiver_childcare=request.getParameter("caregiver_childcare");
		String children_emotions=request.getParameter("children_emotions");
		String abuse_awareness=request.getParameter("abuse_awareness");
		String neglect=request.getParameter("neglect");
		String childcare_knowledge=request.getParameter("childcare_knowledge");
		String social_support=request.getParameter("social_support");
		String cooperation_attitude=request.getParameter("cooperation_attitude");
		String aid_effect=request.getParameter("aid_effect");
		String childrens_opinion=request.getParameter("childrens_opinion");
		String parental_opinion=request.getParameter("parental_opinion");
		String immediate_issues=request.getParameter("immediate_issues");
		String direction_support=request.getParameter("direction_support");
//		String create_data=request.getParameter("create_data");
		String remarks = request.getParameter("remarks");
		Abuse abuse=new Abuse(Integer.parseInt(preson_protect),
							Integer.parseInt(person_id),
							family_structure,
							Integer.parseInt(abuse_kinds),
							Integer.parseInt(abuse_degree),
							abuse_continuation,
							physical_condition,
							mental_condition,
							Integer.parseInt(daily_lack),
							consciousness,
							Integer.parseInt(problem_behavior),
							Integer.parseInt(family_problems),
							Integer.parseInt(economy_problem),
							Integer.parseInt(living_environment),
							Integer.parseInt(caregiver_personality),
							Integer.parseInt(caregiver_mental),
							Integer.parseInt(caregiver_childcare),
							Integer.parseInt(children_emotions),
							Integer.parseInt(abuse_awareness),
							Integer.parseInt(neglect),
							childcare_knowledge,
							Integer.parseInt(social_support),
							Integer.parseInt(cooperation_attitude),
							Integer.parseInt(aid_effect),
							childrens_opinion,
							parental_opinion,
							immediate_issues,
							direction_support,
//							create_data,
							remarks
							);
							AbuseDAO dao=new AbuseDAO();
							dao.insertOne(abuse);

		response.sendRedirect("/grad2021_groupA/Abuse_Read");
	}

}

