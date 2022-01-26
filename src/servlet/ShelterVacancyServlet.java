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

/**
 * Servlet implementation class ShelterVacancyServlet
 */
@WebServlet("/ShelterVacancyServlet")
public class ShelterVacancyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ShelterVacancyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		String v = request.getParameter("vacancy");
		int tax =0;
		PrintWriter out = response.getWriter();
		out.println(v);
		out.println("<!DOCTYPE html><html><head><title>検索結果の一覧</title>"
        		+ "<link rel=\"stylesheet\" href=\"/grad2021_groupA/shelter_css/css/style.css\">\r\n" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/openclose.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/fixmenu.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/fixmenu_pagetop.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/ddmenu_min.js\"></script>\r\n" +
        		"<!--[if lt IE 9]>\r\n" +
        		"<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n" +
        		"<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n" +
        		"<![endif]-->"
        		+ "</head><body>");//[7]
        out.println(
        		"<div id=\"contents\">" +
        		"\r\n" +
//        		"<div class=\"inner\">\r\n" +
        		"\r\n" +
        		"<div id=\"main\">" +
        		"\r\n" +
        		"<section>\r\n" +
        		"\r\n" +
        		"<h2>施設一覧ページ</h2>" +
        		"\r\n" +
        		"<h3>" +v+"</h3>"
        		);
		
		try {
		ShelterDAO dao =new ShelterDAO();
			List<Shelter_Date> list=dao.vacancySearch(v);

			for (Shelter_Date emp : list) {

				tax =tax + emp.getShelter_vacancy();

				out.println("<div class=\"list\">" +
		    			"<a href=\"/grad2021_groupA/Shelter_detailServlet?id=" + emp.getId() + "\">");

				if(emp.getShelter_vacancy() == 0) {
					out.println("<span class=\"option2\">満員</span>");
				}else if(emp.getShelter_vacancy() > 2) {
					out.println("<span class=\"option1\">歓迎</span>");
				}
		    	out.println(
		    			"<h3 style=\"text-align: left\">" + emp.getShelter_name1() + "</h3>" +
		    			"<table>" +
		    			"<tr>" +
		    			"<th>住所</th>" +
		    			"<td>" + emp.getShelter_address2() + emp.getShelter_address3()+ "</td>" +
		    			"<th>空き人数</th>" +
		    			"<td>" + emp.getShelter_vacancy() + "人</td>" +
		    			"</tr>" +
		    			"<tr>" +
		    			"<th>電話番号</th>" +
		    			"<td>" + emp.getTel()+ "</td>" +
		    			"<th>入所条件</th>" +
		    			"<td>" + emp.getShelter_conditions() + "</td>" +
		    			"</tr>" +
		    			"</table>" +
		    			"<span class=\"date\">【登録日:20XX/XX/XX】【更新日:20XX/XX/XX】</span>" +
		    			"</a>" +
		    			"</div>");



			}



		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		out.println("<h1 style=\"text-align: right\">合計空き人数<font color=\"red\">" +tax + "</font>人</h1>");

		out.println("</div></div></div></div>");
      out.println("</body></html>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
