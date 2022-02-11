
package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChildrenDAO;
import model.Children;

@WebServlet("/Person_Read")
public class Person_Read extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ChildrenDAO dao=new ChildrenDAO();
		List<Children> list=dao.findAll();
	    request.setAttribute("list", list);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/childrenRead.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
