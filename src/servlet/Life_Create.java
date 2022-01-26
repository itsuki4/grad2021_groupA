package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LifeDAO;
import model.Life;

@WebServlet("/Life_Create")
public class Life_Create extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/life_create.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String page_no=request.getParameter("page_no");
		String person_id=request.getParameter("person_id");
		String detachable=request.getParameter("detachable");
		String detachable_remarks=request.getParameter("detachable_remarks");
		String meal=request.getParameter("meal");
		String meal_form=request.getParameter("meal_form");
		String meal_form_remarks=request.getParameter("meal_form_remarks");
		String excretion=request.getParameter("excretion");
		String excretion_remarks=request.getParameter("excretion_remarks");
		String interpersonal=request.getParameter("interpersonal");
		String interpersonal_remarks=request.getParameter("interpersonal_remarks");
		String collective=request.getParameter("collective");
		String collective_remarks=request.getParameter("collective_remarks");
		String management=request.getParameter("management");
		String management_remarks=request.getParameter("management_remarks");
		String understanding=request.getParameter("understanding");
		String understanding_remarks=request.getParameter("understanding_remarks");
		String phonation=request.getParameter("phonation");
		String phonation_remarks=request.getParameter("phonation_remarks");
		String reading=request.getParameter("reading");
		String reading_remarks=request.getParameter("reading_remarks");
		String writing=request.getParameter("writing");
		String writing_remarks=request.getParameter("writing_remarks");
		String number_concept=request.getParameter("number_concept");
		String calculation=request.getParameter("calculation");
		String other_concept=request.getParameter("other_concept");
		String number_remarks=request.getParameter("number_remarks");
		String action=request.getParameter("action");
		String remarks=request.getParameter("remarks");
		Life life=new Life(Integer.parseInt(page_no),
							Integer.parseInt(person_id),
							Integer.parseInt(detachable),
							detachable_remarks,
							Integer.parseInt(meal),
							Integer.parseInt(meal_form),
							meal_form_remarks,
							Integer.parseInt(excretion),
							excretion_remarks,
							Integer.parseInt(interpersonal),
							interpersonal_remarks,
							Integer.parseInt(collective),
							collective_remarks,
							Integer.parseInt(management),
							management_remarks,
							Integer.parseInt(understanding),
							understanding_remarks,
							Integer.parseInt(phonation),
							phonation_remarks,
							Integer.parseInt(reading),
							reading_remarks,
							Integer.parseInt(writing),
							writing_remarks,
							Integer.parseInt(number_concept),
							Integer.parseInt(calculation),
							other_concept,
							number_remarks,
							action,
							remarks
							);
		LifeDAO dao=new LifeDAO();
		dao.insertOne(life);

		response.sendRedirect("/grad2021_groupA/Life_Read");
	}

}
