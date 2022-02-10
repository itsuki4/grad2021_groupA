package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChildrenDAO;

@WebServlet("/PersonDelete")
public class PersonDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String person_id=request.getParameter("id");
		if(person_id != null){
			ChildrenDAO dao=new ChildrenDAO();
			dao.deleteOne(Integer.parseInt(person_id));
		}
		response.sendRedirect("/grad2021_groupA/Person_Read");
	}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	 }
}