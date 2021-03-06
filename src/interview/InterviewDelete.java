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
    String s_id=request.getParameter("id");
    if(s_id != null){
      InterviewDAO dao=new InterviewDAO();
      dao.deleteOne(Integer.parseInt(s_id));
    }
    response.sendRedirect("InterviewRead");
  }
}