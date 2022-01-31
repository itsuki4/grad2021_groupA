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


@WebServlet("/Shelter_checkboxServlet")
public class Shelter_checkboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("Shift_JIS");
		String tmps[] = request.getParameterValues("prefecture");
	    String prefecture = "";
	    int tax =0;
	    if (tmps != null){
	      for (int i = 0 ; i < tmps.length ; i++){
	    	  prefecture += tmps[i];
	    	  prefecture += " ";
	      }
	    }else{
	    	prefecture = "選択していません。";
	    }
        PrintWriter out = response.getWriter();//[6]
        out.println("<!DOCTYPE html><html><head><title>検索結果の一覧</title>"
        		+ "<link rel=\"stylesheet\" href=\"/grad2021_groupA/shelter_css/css/style.css\">\r\n" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/openclose.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/fixmenu.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/fixmenu_pagetop.js\"></script>" +
        		"<script src=\"/grad2021_groupA/shelter_css/js/ddmenu_min.js\"></script>\r\n" +
        		"<!--[if lt IE 9]>\r\n" +
        		"<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n" +
        		"<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n" +
        		"<![endif]-->");//[7]
//        out.print("　" + prefecture);//[9]
//        out.println("検索中</p>");//[11]

        Page.header(out);
        


        out.println("</head><body>");
        out.println("<div class=\"container-fluid px-4\">\r\n" +
        		"                        <h1 class=\"mt-4\">空き情報</h1>\r\n" +
        		"                        <ol class=\"breadcrumb mb-4\">\r\n" +
        		"                            <li class=\"breadcrumb-item active\">都道府県検索/空き情報</li>\r\n" +
        		"                        </ol>\r\n" +
        		"                        </div>");
        out.println(
        		"<div id=\"contents\">" +
        		"\r\n" +
//        		"<div class=\"inner\">\r\n" +
        		"\r\n" +
        		"<div id=\"main\">" +
        		"\r\n" +
        		"<section>\r\n" +
        		"\r\n" +
        		"<h2>施設一覧</h2>" +
        		"\r\n" +
        		"<h3>" +prefecture+"</h3>"
        		);
//        out.println("<table>");
//    	out.println("<tr><th>施設ID</th><th>施設名</th><th>住所</th><th>空き人数</th><th>電話番号</th><th>入所条件</th></tr>");




        for(int i=0; i< tmps.length; i++) {
        	prefecture = tmps[i];
//        	out.println(prefecture);


			try {
				ShelterDAO dao =new ShelterDAO();
 			List<Shelter_Date> list=dao.search(prefecture);




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


//			    	tax =tax + emp.getShelter_vacancy();
//			      out.println("<tr><td>" + emp.getId() + "<br></td>");
//			      out.println("<td>" + "<a href=\"/grad2021_groupA/Shelter_detailServlet?id=" + emp.getId() + "\">" + emp.getShelter_name1() + "</a></td>");
//			      out.print("<td>" + emp.getShelter_address2() + emp.getShelter_address3()+ "<br></td>");
//			      if(emp.getShelter_vacancy() > 2){
//			      out.println("<td><font color=\"red\">" + emp.getShelter_vacancy() + "</td></font>" );
//			      }else {
//			    	  out.println("<td>" + emp.getShelter_vacancy() + "</td>" );
//			      }
//			      out.println("<td>" + emp.getTel()+ "<br></td>");
//			      out.println("<td>" + emp.getShelter_conditions() + "</td>");

				}





			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}


        }

        out.println("<h3 style=\"text-align: right\">合計空き人数<font color=\"red\">" +tax + "</font>人</h3>");

        out.println("<a href=\"/grad2021_groupA/shelter_addServlet\">戻る</a><br>" +
        		"<a href=\"/grad2021_groupA/shelterConditionServlet\">条件検索へ</a>");
			out.println("</div></div></div></div>");
			Page.footer(out);
	      out.println("</body></html>");




	}


}
