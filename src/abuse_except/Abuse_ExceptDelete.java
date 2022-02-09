package abuse_except;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_dao.AbuseExceptDAO;
@WebServlet("/Abuse_ExceptDelete")
public class Abuse_ExceptDelete extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id != null){
      AbuseExceptDAO dao=new AbuseExceptDAO();
      dao.deleteOne(Integer.parseInt(person_id));
    }
    response.sendRedirect("Abuse_exceptRead");
  }
}