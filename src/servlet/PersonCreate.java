
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChildrenDAO;
import model.Children;

/**
 * Servlet implementation class PersonCreate
 */
@WebServlet("/PersonCreate")
public class PersonCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/childrenCreate.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String shelter_name1=request.getParameter("shelter_name1");
		String shelter_name2=request.getParameter("shelter_name2");
		String person_name1=request.getParameter("person_name1");
		String person_name2=request.getParameter("person_name2");
		String person_start=request.getParameter("person_start");
		String person_end=request.getParameter("person_end");
		String shelter_id=request.getParameter("shelter_id");
		String person_parent1=request.getParameter("person_parent1");
		String person_parent2=request.getParameter("person_parent2");
//		String person_brother=request.getParameter("person_brother");

		Children children=new Children(shelter_name1,shelter_name2,person_name1,person_name2,person_start,person_end,Integer.parseInt(shelter_id),person_parent1,person_parent2);
		ChildrenDAO dao=new ChildrenDAO();
		dao.insertOne(children);

		response.sendRedirect("/grad2021_groupA/Person_Read");
	}

}
