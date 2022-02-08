package person_date;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_dao.PersonDAO;
import person_date_model.Person;
@WebServlet("/Person_Date_Main")
public class Person_Date_Main extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String person_id=request.getParameter("id");
	    if(person_id == null){
	    	response.sendRedirect("/grad2021_groupA/PersonRead");
	    }else{
	    	PersonDAO dao=new PersonDAO();
	        List<Person> List=dao.findAll();
	        request.setAttribute("List", List);
	        RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/person_date.jsp");
	        rd.forward(request, response);
	    }
	    }
}