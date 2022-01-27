package person_date;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_dao.PersonDAO;
@WebServlet("/Person_Delete")
public class Person_Delete extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String s_id=request.getParameter("id");
    if(s_id != null){
      PersonDAO dao=new PersonDAO();
      dao.deleteOne(Integer.parseInt(s_id));
    }
    response.sendRedirect("PersonRead");
  }
}
