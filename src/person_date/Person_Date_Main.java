package person_date;

import java.io.IOException;

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

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		 String s_id=request.getParameter("id");
		    if(s_id == null){
		      response.sendRedirect("/grad2021_groupA/Read");
		    }else{
		      PersonDAO dao=new PersonDAO();
		      Person person=dao.findOne(Integer.parseInt(s_id));
	    request.setAttribute("person", person);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/person_date.jsp");
		dispatcher.forward(request,response);
		    }
	}
}