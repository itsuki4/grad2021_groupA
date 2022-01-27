package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ShelterDAO;
import dao.Shelter_updateDAO;
import model.Shelter_Date;
import model.Shelter_update;

/**
 * Servlet implementation class Shelter_updateServlet
 */
@WebServlet("/Shelter_updateServlet")
public class Shelter_updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Shelter_updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int shelter_id = Integer.parseInt(request.getParameter("shelter_id"));
        String shelter_conditions = request.getParameter("shelter_conditions");
        int capacity = Integer.parseInt(request.getParameter("capacity"));
        int shelter_vacancy = Integer.parseInt(request.getParameter("shelter_vacancy"));

//        PrintWriter out = response.getWriter();
//
//
//        out.println("変更しました");
//
//        out.println(shelter_conditions);
//        out.println(capacity);
//        out.println(shelter_vacancy);
//        out.println(shelter_id);

        // register.jspから受け取った値をビーンズにセット
        Shelter_update ab = new Shelter_update();


        ab.setShelter_conditions(shelter_conditions);
        ab.setCapacity(capacity);
        ab.setShelter_vacancy(shelter_vacancy);
        ab.setShelter_id(shelter_id);

        // アカウントをDBに登録
        Shelter_updateDAO ard = new Shelter_updateDAO(ab);

        ShelterDAO dao=new ShelterDAO();



	    List<Shelter_Date> list=dao.ShelterDetail(shelter_id);
	    for (Shelter_Date s : list) {
	    	s.getId();
	    	s.getShelter_name1();
	    	s.getShelter_name2();
	    	s.getShelter_address1();
	    	s.getShelter_address2();
	    	s.getShelter_address3();
	    	s.getShelter_address4();
	    	s.getTel();
	    	s.getCapacity();
	    	request.setAttribute("s", s);
	    }
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/shelter_changed.jsp");
		dispatcher.forward(request, response);
	}

}

