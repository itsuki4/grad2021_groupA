package interview;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_dao.InterviewDAO;
import interview_model.Interview;
@WebServlet("/InterviewRead")
public class InterviewRead extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    InterviewDAO dao=new InterviewDAO();
    List<Interview> List=dao.findAll();
    request.setAttribute("List", List);
    RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/interview_read.jsp");
    rd.forward(request, response);
  }
}