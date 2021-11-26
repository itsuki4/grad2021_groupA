package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Health_dateDAO;
import model.Health;
import model.Health_date;


@WebServlet("/Browsing")
public class Browsing extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Health_dateDAO dao = new Health_dateDAO();
		List<Health> List = dao.HealthAll();

	 	request.setAttribute("List", List);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browsing.jsp");
		dispatcher.forward(request, response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> healthList = dao.findAll();
		for (Health_date date : healthList) {
			date.getPerson_id();
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/browsing_date.jsp");
		dispatcher.forward(request, response);
		}
	}