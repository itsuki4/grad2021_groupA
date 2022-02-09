package abuse_except;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_dao.AbuseUpdateDAO;
import abuse_except_model.AbuseExcept;


@WebServlet("/Abuse_ExceptUpdate")
public class Abuse_ExceptUpdate extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
      response.sendRedirect("/grad2021_groupA/Abuse_exceptRead");
    }else{
      AbuseUpdateDAO dao=new AbuseUpdateDAO();
      AbuseExcept abuse=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("abuse", abuse);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/abuse_exceptupdate.jsp");
      rd.forward(request, response);
    }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //以下を追記
    request.setCharacterEncoding("UTF-8");
    String person_protect =request.getParameter("person_protect");
	int person_id = Integer.parseInt(request.getParameter("person_id"));
	String except_reason = request.getParameter("except_reason");
	String except_direction =request.getParameter("except_direction");
	String except_status = request.getParameter("except_status");

    String except_task = request.getParameter("except_task");
	String except_remarks =request.getParameter("except_remarks");
	AbuseExcept abuse=new AbuseExcept(person_protect,person_id,except_reason,except_direction,except_status,except_task,except_remarks);
    AbuseUpdateDAO dao=new AbuseUpdateDAO();
    dao.updateOne(abuse);

    response.sendRedirect("/grad2021_groupA/Abuse_exceptRead");
  }

}