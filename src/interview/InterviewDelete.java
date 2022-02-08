package interview;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_dao.InterviewDAO;
@WebServlet("/InterviewDelete")
public class InterviewDelete extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id != null){
      InterviewDAO dao=new InterviewDAO();
      dao.deleteOne(Integer.parseInt(person_id));
    }
    response.sendRedirect("InterviewRead");
  }
}