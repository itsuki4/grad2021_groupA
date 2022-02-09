package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountLoginDAO;
import model.AccountLogin;


@WebServlet("/AccountLoginServlet")
public class AccountLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AccountLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
        String staff_name1 = request.getParameter("staff_name1");
        String staff_name2 = request.getParameter("staff_name2");
        String staff_pass = request.getParameter("staff_pass");
        int staff_role = Integer.parseInt(request.getParameter("staff_role"));



        // register.jspから受け取った値をビーンズにセット
        AccountLogin ab = new AccountLogin();
        ab.setShelter_id(shelter_id);
        ab.setStaff_name1(staff_name1);
        ab.setStaff_name2(staff_name2);
        ab.setStaff_pass(staff_pass);
        ab.setStaff_role(staff_role);

        // アカウントをDBに登録
        AccountLoginDAO ard = new AccountLoginDAO(ab);
	        
	        
	        request.setCharacterEncoding("Shift_JIS");
	        PrintWriter out = response.getWriter();
	        response.setContentType("text/html; charset=UTF-8");
	        
	        out.println(staff_name1);

//	        // セッションにアカウント情報を保存
//	        HttpSession session = request.getSession();
//	        session.setAttribute("account", ab);
//
//	        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/registerSuccess.jsp");
//	        rd.forward(request, response);
	}

}
