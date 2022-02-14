package login_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login_dao.AccountDeleteDAO;
import login_model.Account;

/**
 * Servlet implementation class AccountDeleteServlet
 */
@WebServlet("/AccountDeleteServlet")
public class AccountDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountDeleteServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));

		PrintWriter out = response.getWriter();
        out.println("変更しました");
        out.println(id);


        

        
        if(id !=0){
        	Account ab = new Account();
            ab.setShelter_id(id);
        	AccountDeleteDAO dao = new AccountDeleteDAO(id);
          }
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/account_delete.jsp");
//	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
