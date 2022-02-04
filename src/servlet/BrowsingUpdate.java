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
import dao.Healthdate_UpdateDAO;
import model.Health_date;
import model.Healthdate_update;

@WebServlet("/BrowsingUpdate")
public class BrowsingUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");

		request.setCharacterEncoding("Shift_JIS");


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

		int person_id =Integer.parseInt(request.getParameter("person_id"));

		PrintWriter out = response.getWriter();
		out.println("変更に成功しました");

		Healthdate_update ab = new Healthdate_update();

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
		ab.setPerson_id(person_id);

		Healthdate_UpdateDAO ard = new Healthdate_UpdateDAO(ab);



		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> List = dao.findAll();

		for (Health_date date : List) {
			date.getPerson_body();
			date.getPerson_check();
			date.getPerson_datail();
			date.getAllergies();
			date.getAllergies_degree();
			date.getAllergies_remarks();
			date.getChronic_condition();
			date.getChronic_correspondence();
			date.getInsomnia();
			date.getFrightened();
			date.getDepression();
			date.getMental_remarks();
			date.getSuicide();
			date.getDehydration();
			date.getMalnutrition();
			date.getUnbalanced_diet();
			date.getUnbalanced_remarks();
			date.getScratch_point();
			date.getScratch_number();
			date.getScratch_size();
			date.getScratch_colour();
			date.getScratch_remarks();
			date.getHindrance();
			date.getPerson_remarks();
			date.getCreate_data();
			request.setAttribute("date", date);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/browsing_update.jsp");
		dispatcher.forward(request, response);
		}

}
