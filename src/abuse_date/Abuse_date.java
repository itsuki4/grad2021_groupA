package abuse_date;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_date_dao.Abuse_dao;
import abuse_date_model.Abuse_model;

@WebServlet("/Abuse_date")
public class Abuse_date extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		Abuse_dao dao = new Abuse_dao();
		List<Abuse_model> list = dao.findAll();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/abuse_date.jsp");
		dispatcher.forward(request,response);
	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//	}
}