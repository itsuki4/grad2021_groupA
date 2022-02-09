package abuse_except;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_dao.AbuseExceptDAO;
import abuse_except_model.AbuseExcept;
@WebServlet("/Abuse_exceptRead")
public class Abuse_exceptRead extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    AbuseExceptDAO dao=new AbuseExceptDAO();
    List<AbuseExcept> List=dao.findAll();
    request.setAttribute("List", List);
    RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/abuse_except_read.jsp");
    rd.forward(request, response);
  }
}