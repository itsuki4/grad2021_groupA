package person_date;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_dao.PersonUpdateDAO;
import person_date_model.Person;


@WebServlet("/Person_Date_Main")
public class Person_Date_Main extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
      response.sendRedirect("/grad2021_groupA/PersonRead");
    }else{
      PersonUpdateDAO dao=new PersonUpdateDAO();
      Person person=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("person", person);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/person_date.jsp");
      rd.forward(request, response);
    }
  }
}