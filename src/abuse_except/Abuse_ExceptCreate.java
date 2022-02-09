package abuse_except;

import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abuse_except_dao.AbuseExceptDAO;
import abuse_except_model.AbuseExcept;

/**
 * Servlet implementation class Abuse_ExceptCreate
 */
@WebServlet("/Abuse_ExceptCreate")
public class Abuse_ExceptCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		       RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/abuse_exceptcreate.jsp");
		       rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");


		String person_protect =request.getParameter("person_protect");
		int person_id = Integer.parseInt(request.getParameter("person_id"));
		String except_reason = request.getParameter("except_reason");
		String except_direction =request.getParameter("except_direction");
		String except_status = request.getParameter("except_status");

	    String except_task = request.getParameter("except_task");
		String except_remarks =request.getParameter("except_remarks");

		PrintWriter out = response.getWriter();


		 out.println("登録しました");


		 out.println("person_protect="+person_protect);
		 out.println("except_reason="+except_reason);
		 out.println("except_direction="+except_direction);
		 out.println("except_status="+except_status);
		 out.println("except_task="+except_task);
		 out.println("except_remarks="+except_remarks);
		 out.println("person_id="+person_id);


			 AbuseExcept ac = new AbuseExcept();

			    ac.setperson_protect(person_protect);
			    ac.setperson_id(person_id);
				ac.setexcept_reason(except_reason);
				ac.setexcept_direction(except_direction);
				ac.setexcept_status(except_status);
				ac.setexcept_task(except_task);
			    ac.setexcept_remarks(except_remarks);

				AbuseExceptDAO dao = new AbuseExceptDAO();
				dao.insertOne(ac);


		response.sendRedirect("/grad2021_groupA/Abuse_exceptRead");
	}
}