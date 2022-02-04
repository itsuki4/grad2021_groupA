package servlet;

//詳細画面（ID検索してる）サーブレット
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Health_dateDAO;
import model.Health_date;


@WebServlet("/BrowsingDetailServlet")
public class BrowsingDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");

		request.setCharacterEncoding("Shift_JIS");

		int id =Integer.parseInt(request.getParameter("id"));

		Health_dateDAO dao = new Health_dateDAO();
		List<Health_date> healthList = dao.HealthDetail(id);

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


//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//
//		}
	}


