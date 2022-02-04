package login_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_dao.AccountRegisterDAO;
import login_model.AccountBeans;

/**
 * Servlet implementation class AccountRegister
 */
@WebServlet("/AccountRegister")
public class AccountRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/register.jsp");
//        rd.forward(request, response);
//
//    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
    	String name = request.getParameter("name");
        String loginId = request.getParameter("loginId");
        String pass = request.getParameter("pass");
        int role = Integer.parseInt(request.getParameter("role"));

        // register.jspから受け取った値をビーンズにセット
        AccountBeans ab = new AccountBeans();
        ab.setName(name);
        ab.setLoginId(loginId);
        ab.setPass(pass);
        ab.setRole(role);

//        PrintWriter out = response.getWriter();
//        out.println(name);

        // アカウントをDBに登録
//        AccountRegisterDAO ard = new AccountRegisterDAO(ab);
        AccountRegisterDAO ard = new AccountRegisterDAO(ab);

        // セッションにアカウント情報を保存
        HttpSession session = request.getSession();
        session.setAttribute("account", ab);

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/registerSuccess.jsp");
        rd.forward(request, response);

    }

}
