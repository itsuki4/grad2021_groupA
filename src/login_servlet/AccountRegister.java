package login_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login_dao.AccountRegisterDAO;
import login_model.AccountSerch;

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
//    	request.setCharacterEncoding("UTF-8");
//		request.setCharacterEncoding("Shift_JIS");
//		response.setContentType("text/html; charset=Windows-31J");
//		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
//		String staff_pass = request.getParameter("staff_pass");
//        String staff_name1 = request.getParameter("staff_name1");
//        String staff_name2 = request.getParameter("staff_name2");
//        int staff_role = Integer.parseInt(request.getParameter("staff_role"));
//        int admin_role = Integer.parseInt(request.getParameter("admin_role"));
//        
//        // register.jspから受け取った値をビーンズにセット
//        AccountSerch ab = new AccountSerch();
//        ab.setShelter_id(shelter_id);
//        ab.setStaff_pass(staff_pass);
//        ab.setStaff_name1(staff_name1);
//        ab.setStaff_name2(staff_name2);
//        ab.setStaff_role(staff_role);
//        ab.setAdmin_role(admin_role);
//        
//        
//
////        PrintWriter out = response.getWriter();
////        out.println(shelter_id);
////        out.println(staff_pass);
////        out.println(staff_name1);
////        out.println(staff_name2);
//
//        // アカウントをDBに登録
//        AccountRegisterDAO ard = new AccountRegisterDAO(ab);
//
//        // セッションにアカウント情報を保存
//        HttpSession session = request.getSession();
//        session.setAttribute("account", ab);
//
//        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/registerSuccess.jsp");
//        rd.forward(request, response);
    	
    	request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
        HttpSession session = request.getSession();
        AccountSerch ab = (AccountSerch) session.getAttribute("account");
        AccountRegisterDAO ard = new AccountRegisterDAO(ab);
        
        PrintWriter out = response.getWriter();
        out.println("新規登録完了");

    }

}
