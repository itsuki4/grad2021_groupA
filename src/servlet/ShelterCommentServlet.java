package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ShelterDAO;
import model.Shelter_Date;
import model.Shelter_chatList;


@WebServlet("/ShelterCommentServlet")
public class ShelterCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ShelterCommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html; charset=Windows-31J");
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head><link rel=\"stylesheet\" href=\"/grad2021_groupA/shelter_css/css/chat.css\"><title>検索結果の一覧</title></head><body>");

        try {
			ShelterDAO dao =new ShelterDAO();
			List<Shelter_Date> list=dao.ShelterDetail(id);



			if(list == null) {
				out.println("情報がありませんでした。");
			}else {
			for (Shelter_Date emp : list) {


		ShelterDAO Sdao =new ShelterDAO();
		List<Shelter_chatList> Slist=Sdao.Shelter_chat(id);

		out.println("<h2>chat</h2>");
    	out.println("<p><font color=\"red\">※緊急の場合は電話でのご連絡をお願い致します。お返事にお時間がかかる場合がございます。</p></font>");
		for (Shelter_chatList semp : Slist) {
	    	out.println(" <br><br><div class=\"line-bc\">");

	    	if(semp.getShelter_send() == semp.getShelter_id()) {
		    	out.println("<p class=\"balloon1-left\">");
//		      out.println("ID:" + semp.getShelter_id() + "<br>");
		      out.println(semp.getShelter_comment() + "<br>");
		      out.println(semp.getInterview_date()+ "<br>");
		      out.println("</p>");
		    	}else {
		    		out.println("<p class=\"balloon1-right\">");
//				      out.println("ID:" + semp.getShelter_id() + "<br>");
				      out.println(semp.getShelter_comment() + "<br>");
				      out.println(semp.getInterview_date());
//				      out.println( semp.getShelter_send() + "<br>");
				      out.println("</p>");
				      
		    	}
	    	out.println("</div>");

		}
      out.println("<form action=\"/grad2021_groupA/Shelter_chatServlet\" method=\"post\">" +
      		"<h3>入力してください</h3>" +
      		"<input type=\"hidden\" name=\"shelter_id\" value=\""+ emp.getId() +"\"><br>"+
      		"コメント：<input type=\"text\" name=\"shelter_comment\"><br>\r\n" +
      		"<input type=\"hidden\" name=\"shelter_send\" value=\"1000\"><br> "+
      		"<input type=\"submit\" value=\"送信\"><br>" +
      		"</form>");
			}

			}



			out.println("</body></html>");
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();

		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
