package login_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_dao.AccountDAO;
import login_model.AccountSerch;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/admin_login.jsp");
	        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");
    	int staff_id = Integer.parseInt(request.getParameter("staff_id"));
        String staff_pass = request.getParameter("staff_pass");

        // login.jspから受け取ったログインIDとpassをビーンズにセット
        AccountSerch ab = new AccountSerch();
        ab.setStaff_id(staff_id);
        ab.setStaff_pass(staff_pass);

        // アカウントの有無を検索
        // 検索したアカウント情報を取得
        AccountDAO ad = new AccountDAO();
        AccountSerch returnAb = ad.findAccount(ab);
        
//        PrintWriter out = response.getWriter();
//        out.println(staff_id);

        if(returnAb != null) {
            // セッションにアカウント情報＆ロールを登録
            HttpSession session = request.getSession();
            session.setAttribute("account", returnAb);

            RequestDispatcher rd = request.getRequestDispatcher("/AdminCheck");
            rd.forward(request, response);

        } else {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/error.jsp");
            rd.forward(request, response);
        }
	}

}
