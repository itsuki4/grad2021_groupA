package login_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login_dao.AdminDAO;
import login_dao.AdminUpDAO;
import login_model.Account;

/**
 * Servlet implementation class AccountChangeServlet
 */
@WebServlet("/AccountChangeServlet")
public class AccountChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountChangeServlet() {
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
//        HttpSession session = request.getSession();
//        AccountSerch ab = (AccountSerch) session.getAttribute("account");
        
        AdminDAO dao=new AdminDAO();
 	    List<Account> list=dao.StaffSerect(id);
 	    
 	   
	    for (Account s : list) {
	    	s.getStaff_id();
	    	s.getShelter_id();
	    	s.getStaff_name1();
	    	s.getStaff_name2();
	    	s.getStaff_role();
	    	s.getAdmin_role();
	    	s.getStaff_pass();
	    	
	    	
	    	request.setAttribute("s", s);
	    }
        
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/account_change.jsp");
	      rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int staff_id = Integer.parseInt(request.getParameter("staff_id"));
		String staff_name1 = request.getParameter("staff_name1");
		String staff_name2 = request.getParameter("staff_name2");
//		int staff_role = Integer.parseInt(request.getParameter("staff_role"));
//		int admin_role = Integer.parseInt(request.getParameter("admin_role"));
		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
		String staff_pass = request.getParameter("staff_pass");
		
		 PrintWriter out = response.getWriter();
		 
		 
		         out.println("変更しました");
		 
		         out.println(staff_name1);
		         out.println(shelter_id);
		         out.println(staff_id);
		         out.println(staff_name2);
		         out.println(staff_pass);
		
		Account ab = new Account();


        ab.setStaff_id(staff_id);
        ab.setStaff_name1(staff_name1);
        ab.setStaff_name2(staff_name2);
        ab.setShelter_id(shelter_id);
//        ab.setStaff_role(staff_role);
//        ab.setAdmin_role(admin_role);
        ab.setStaff_pass(staff_pass);
        
        AdminUpDAO dao = new AdminUpDAO(ab);
        
//        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login_jsp/admin_chenge.jsp");
//	      rd.forward(request, response);
	}

}
