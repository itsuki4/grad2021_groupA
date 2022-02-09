package interview;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interview_dao.InterviewUpdateDAO;
import interview_model.Interview;


@WebServlet("/Interview_Main")
public class Interview_Main extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
      response.sendRedirect("/grad2021_groupA/InterviewRead");
    }else{
      InterviewUpdateDAO dao=new InterviewUpdateDAO();
      Interview interview=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("interview", interview);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/interview.jsp");
      rd.forward(request, response);
    }
  }
}