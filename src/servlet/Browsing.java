package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetHealthListLogic;
import model.Health_date;


@WebServlet("/Browsing")
public class Browsing extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		GetHealthListLogic getHealthListLogic = new GetHealthListLogic();
		List<Health_date> healthList = getHealthListLogic.execute();
		request.setAttribute("healthList", healthList);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browsing.jsp");
		dispatcher.forward(request, response);
		}
}