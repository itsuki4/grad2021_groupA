package login_servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_dao.AdminDAO;
import login_model.Account;
import login_model.AccountSerch;

/**
 * Servlet implementation class AdminCheck
 */
@WebServlet("/AdminCheck")
public class AdminCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
        HttpSession session = request.getSession();
        AccountSerch ab = (AccountSerch) session.getAttribute("account");

        // ロールでフォワード先を振り分ける
        if(ab.getAdmin_role() == 1) {

//        	int role = 1;
        	 AdminDAO dao=new AdminDAO();
     	    List<Account> list=dao.StaffAll();
     	   request.setAttribute("List", list);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/admin_success.jsp");
            rd.forward(request, response);
        } else if(ab.getAdmin_role() == 2) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/admin_error.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/error.jsp");
            rd.forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
