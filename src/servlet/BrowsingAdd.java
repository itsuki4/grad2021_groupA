
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Health_dateDAO;
import dao.Healthdate_AddDAO;
import model.Health_date;
import model.Healthdate_add;


@WebServlet("/BrowsingAdd")
public class BrowsingAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");

		request.setCharacterEncoding("Shift_JIS");

		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> healthList = dao.findAll();

	 	request.setAttribute("healthList", healthList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browsing_add.jsp");
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");

		request.setCharacterEncoding("Shift_JIS");

		int person_id =Integer.parseInt(request.getParameter("person_id"));
		int person_body = Integer.parseInt(request.getParameter("person_body"));
		int person_check =Integer.parseInt(request.getParameter("person_check"));
		int person_datail= Integer.parseInt(request.getParameter("person_datail"));
		String allergies = request.getParameter("allergies");

		int allergies_degree =Integer.parseInt(request.getParameter("allergies_degree"));
		String allergies_remarks = request.getParameter("allergies_remarks");
		String chronic_condition = request.getParameter("chronic_condition");
		String chronic_correspondence = request.getParameter("chronic_correspondence");
		int insomnia =Integer.parseInt(request.getParameter("insomnia"));

		int frightened =Integer.parseInt(request.getParameter("frightened")) ;
		int depression =Integer.parseInt(request.getParameter("depression")) ;
		String mental_remarks = request.getParameter("mental_remarks");
		int suicide =Integer.parseInt(request.getParameter("suicide"));
		int dehydration =Integer.parseInt(request.getParameter("dehydration"));

		int malnutrition =Integer.parseInt(request.getParameter("malnutrition"));
		int unbalanced_diet =Integer.parseInt(request.getParameter("unbalanced_diet"));
		String unbalanced_remarks = request.getParameter("unbalanced_remarks");
		String 	scratch_point = request.getParameter("scratch_point");
		int scratch_number =Integer.parseInt(request.getParameter("scratch_number"));

		int scratch_size =Integer.parseInt(request.getParameter("scratch_size"));
		int scratch_colour =Integer.parseInt(request.getParameter("scratch_colour"));
		String scratch_remarks = request.getParameter("scratch_remarks");
		int hindrance =Integer.parseInt(request.getParameter("hindrance"));
		String person_remarks = request.getParameter("person_remarks");



		PrintWriter out = response.getWriter();
		out.println("追加に成功しました");

		Healthdate_add ab = new Healthdate_add();

		ab.setPerson_id(person_id);
		ab.setPerson_body(person_body);
		ab.setPerson_check(person_check);
		ab.setPerson_datail(person_datail);
		ab.setAllergies(allergies);
		ab.setAllergies_degree(allergies_degree);
		ab.setAllergies_remarks(allergies_remarks);
		ab.setChronic_condition(chronic_condition);
		ab.setChronic_correspondence(chronic_correspondence);
		ab.setInsomnia(insomnia);
		ab.setFrightened(frightened);
		ab.setDepression(depression);
		ab.setMental_remarks(mental_remarks);
		ab.setSuicide(suicide);
		ab.setDehydration(dehydration);
		ab.setMalnutrition(malnutrition);
		ab.setUnbalanced_diet(unbalanced_diet);
		ab.setUnbalanced_remarks(unbalanced_remarks);
		ab.setScratch_point(scratch_point);
		ab.setScratch_number(scratch_number);
		ab.setScratch_size(scratch_size);
		ab.setScratch_colour(scratch_colour);
		ab.setScratch_remarks(scratch_remarks);
		ab.setHindrance(hindrance);
		ab.setPerson_remarks(person_remarks);


		Healthdate_AddDAO ard = new Healthdate_AddDAO(ab);



		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> List = dao.findAll();

		for (Health_date date : List) {
			date.setPerson_id(person_id);
			date.setPerson_body(person_body);
			date.setPerson_check(person_check);
			date.setPerson_datail(person_datail);
			date.setAllergies(allergies);
			date.setAllergies_degree(allergies_degree);
			date.setAllergies_remarks(allergies_remarks);
			date.setChronic_condition(chronic_condition);
			date.setChronic_correspondence(chronic_correspondence);
			date.setInsomnia(insomnia);
			date.setFrightened(frightened);
			date.setDepression(depression);
			date.setMental_remarks(mental_remarks);
			date.setSuicide(suicide);
			date.setDehydration(dehydration);
			date.setMalnutrition(malnutrition);
			date.setUnbalanced_diet(unbalanced_diet);
			date.setUnbalanced_remarks(unbalanced_remarks);
			date.setScratch_point(scratch_point);
			date.setScratch_number(scratch_number);
			date.setScratch_size(scratch_size);
			date.setScratch_colour(scratch_colour);
			date.setScratch_remarks(scratch_remarks);
			date.setHindrance(hindrance);
			date.setPerson_remarks(person_remarks);
			date.getCreate_data();
			request.setAttribute("date", date);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/browsing_register.jsp");
		dispatcher.forward(request, response);


	}

}
