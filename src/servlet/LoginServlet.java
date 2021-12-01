package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import model.Admin_Login;
//import model.Admin_LoginLogic;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

	  //フォワード
    RequestDispatcher dispatcher = request.getRequestDispatcher(
        "/WEB-INF/jsp/login.jsp");
    dispatcher.forward(request, response);
  	}

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

	  //リクエストパラメータの取得
	  //request.setCharacterEncoding("UTF-8");
	  //String admin_id = request.getParameter("admin_id");
	  //String admin_pass = request.getParameter("admin_pass");

	  //ログイン処理
	  //Admin_Login login = new Admin_Login(admin_id, admin_pass);
	  //Admin_LoginLogic bo = new Admin_LoginLogic();
	  //boolean result = bo.execute(login);

	  //if(result) { //ログイン成功
		  //セッションスコープに管理者IDを保存
		  //HttpSession session = request.getSession();
		  //session.setAttribute("admin_id", admin_id);

	//フォワード
		  RequestDispatcher dispatcher =
			request.getRequestDispatcher("/WEB-INF/menu.jsp");
		  	dispatcher.forward(request, response);
	  	//} else { //ログイン失敗
	  //リダイレクト
	  //response.sendRedirect("/grad2021_groupA/LoginServlet");
	  	//}
  	}
}