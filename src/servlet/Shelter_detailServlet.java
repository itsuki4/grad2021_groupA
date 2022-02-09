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
import tool.Page;


@WebServlet("/Shelter_detailServlet")
public class Shelter_detailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html; charset=Windows-31J");

		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head><link rel=\"stylesheet\" href=\"/grad2021_groupA/shelter_css/css/style.css\"><title>検索結果の一覧</title></head><body>");

		Page.header(out);
		out.println("<div class=\"container-fluid px-4\">\r\n" + 
				"                        <h1 class=\"mt-4\">施設の詳細</h1>\r\n" + 
				"                        <ol class=\"breadcrumb mb-4\">\r\n" + 
				"                            <li class=\"breadcrumb-item active\">空き情報/施設の詳細</li>\r\n" + 
				"                        </ol>\r\n" + 
				"                        </div>");
        try {
			ShelterDAO dao =new ShelterDAO();
			List<Shelter_Date> list=dao.ShelterDetail(id);



			if(list == null) {
				out.println("情報がありませんでした。");
			}else {
			for (Shelter_Date emp : list) {
				
				
				out.println(
						"<div id=\"contents\">" + 
						"<div class=\"inner\">" +
						"<div id=\"main\">" + 
						"<h2>施設一覧</h2>"+
						"<article><table class=\"ta1\">" + 
						"<caption></caption>" + 
						"<tr>" + 
						"<th>施設名</th>" + 
						"<td>" + emp.getShelter_name1() + "</td>" + 
						"</tr>" + 
						"<tr>" + 
						"<th>住所</th>" + 
						"<td>〒" + emp.getShelter_address1()+ "<br>" + emp.getShelter_address2()+ emp.getShelter_address3() +""
								+ "<a href=\"https://goo.gl/maps/JEo4TFYjCxBF6dZh6\" rel=\"nofollow\">（GoogleMapで開く）</a></td>" + 
						"</tr>" + 
						"<tr>" + 
						"<th>電話番号</th>" + 
						"<td>" + emp.getTel()+ "</td>" + 
						"</tr>" + 
						"<tr>" + 
						"<th>入所条件</th>" + 
						"<td>" + emp.getShelter_conditions() + "</td>" + 
						"</tr>" + 
						"<tr>" + 
						"<th>空き人数</th>\r\n" + 
						"<td>" + emp.getShelter_vacancy() + "人</td>" + 
						"</tr>" + 
						"<tr>" + 
						"<th>定員数</th>" + 
						"<td>" + emp.getCapacity()+ "人</td>" + 
						"</tr>" + 
						"</table>" + 
						"<p class=\"c\">" +
						"<form action=\"/grad2021_groupA/ShelterCommentServlet?id="+ id +"\" method=\"post\">" +
						"<input type=\"submit\" value=\"問い合わせをする\" class=\"btn\">" +
						"</form>" );
						out.println("<a href=\"/grad2021_groupA/shelter_addServlet\">都道府県検索へ</a><br>" + 
				        		"<a href=\"/grad2021_groupA/shelterConditionServlet\">条件検索へ</a>" +
						"</p></div></div></div></article>");
				



			}

			}

			

			out.println("</body></html>");
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
        Page.footer(out);
        out.println("</body></html>");

//		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/shelter_date.jsp");
//		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
//        String shelter_comment = request.getParameter("shelter_comment");
//
//
//        // register.jspから受け取った値をビーンズにセット
//        Shelter_chat ab = new Shelter_chat(shelter_id, shelter_comment);
//        ab.setShelter_id(shelter_id);
//        ab.setShelter_comment(shelter_comment);
//
//        // アカウントをDBに登録
//        Shelter_chatDAO ard = new Shelter_chatDAO(ab);
//
//

	}

}
