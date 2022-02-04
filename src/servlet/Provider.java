package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Others_dateDAO;
import model.Others;
import model.Others_date;


@WebServlet("/Provider")
public class Provider extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Others_dateDAO dao = new Others_dateDAO();
		List<Others> List = dao.OthersAll();

		request.setAttribute("List", List);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/provider.jsp");
		dispatcher.forward(request, response);
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Others_dateDAO dao = new Others_dateDAO();
		List<Others_date> othersList = dao.findAll();
		for(Others_date date : othersList) {
			date.getPerson_id();
			date.getProvider_name();
			date.getProvider_name2();
			date.getShelter_address1();
			date.getShelter_address2();
			date.getShelter_address3();
			date.getShelter_address4();
			date.getSource();
			date.getProvider_relationship();
			date.getNotification();
			date. getCooperation();
			date.getContact();
			date.getContents();
			date.getProvider_remarks();
			date.getPage_no();
			request.setAttribute("date", date);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/provider_date.jsp");
		dispatcher.forward(request, response);
	}

}