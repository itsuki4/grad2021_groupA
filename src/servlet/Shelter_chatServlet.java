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
import dao.Shelter_chatDAO;
import model.Shelter_Date;
import model.Shelter_chat;
import model.Shelter_chatList;


@WebServlet("/Shelter_chatServlet")
public class Shelter_chatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Shelter_chatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
        String shelter_comment = request.getParameter("shelter_comment");



        // register.jspから受け取った値をビーンズにセット
        Shelter_chat ab = new Shelter_chat();
        ab.setShelter_id(shelter_id);
        ab.setShelter_comment(shelter_comment);

        // アカウントをDBに登録
        Shelter_chatDAO ard = new Shelter_chatDAO(ab);


        request.setCharacterEncoding("Shift_JIS");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=UTF-8");


        out.println("<!DOCTYPE html><html><head><title>検索結果の一覧</title></head><body>");//[7]
        out.println("詳細情報");


        try {
			ShelterDAO dao =new ShelterDAO();
			List<Shelter_Date> list=dao.ShelterDetail(shelter_id);



			if(list == null) {
				out.println("情報がありませんでした。");
			}else {
			for (Shelter_Date emp : list) {
//		    	out.println(" <br><br>");
//		      out.println("ID:" + emp.getId() + "<br>");
//		      out.println("<h1>施設名:" + emp.getShelter_name1() + "<br></h1>");
//		      out.println("施設名（カタカナ）：" + emp.getShelter_name2()+ "<br>");
//		      out.println("郵便番号：" + emp.getShelter_address1()+ "<br>");
//		      out.print("住所：" + emp.getShelter_address2()+ "<br>");
//		      out.print(emp.getShelter_address3()+ "<br>");
//		      out.println(emp.getShelter_address4()+ "<br>");
//
//		      out.println("電話番号:" + emp.getTel()+ "<br>");
//		      out.println( "入所条件：" + emp.getShelter_conditions() + "</td><br>");
//		      out.println("空き人数：" + emp.getShelter_vacancy() + "<br>" );
//		      out.println("定員数:" + emp.getCapacity()+ "<br><br>");

//		      out.println("<h2>chat</h2>");
		    	out.println("<p><font color=\"red\">※緊急の場合は電話でのご連絡をお願い致します。お返事にお時間がかかる場合がございます。</p></font>");
		      ShelterDAO Sdao =new ShelterDAO();
				List<Shelter_chatList> Slist=Sdao.Shelter_chat(shelter_id);

				for (Shelter_chatList semp : Slist) {
			    	out.println(" <br><br>");

			      out.println("ID:" + semp.getShelter_id() + "<br>");
			      out.println("コメント" + semp.getShelter_comment() + "<br>");
			      out.println("投稿時間：" + semp.getInterview_date()+ "<br>");

				}
		      out.println("<form action=\"/grad2021_groupA/Shelter_chatServlet\" method=\"post\">" +
		      		"<h3>入力してください</h3>" +
		      		"　　　送りたい施設のID："+ emp.getId() +"<input type=\"hidden\" name=\"shelter_id\" value=\""+ emp.getId() +"\"><br>"+
		      		"コメント：<input type=\"text\" name=\"shelter_comment\"><br>\r\n" +
		      		"<input type=\"submit\" value=\"送信\"><br>" +
		      		"</form>");

			}

			}



			out.println("</body></html>");
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

        out.println("</body></html>");

	}


}
