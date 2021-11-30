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
import model.Shelter;
import model.Shelter_Date;

@WebServlet("/Shelter_DateServlet")
public class Shelter_DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShelterDAO dao=new ShelterDAO();
	    List<Shelter> list=dao.ShelterAll();
	    request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/shelter.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ShelterDAO dao=new ShelterDAO();
//	    List<Shelter_Date> list=dao.findAll();
//	    for (Shelter_Date s : list) {
//	    	s.getId();
//	    	s.getShelter_name1();
//	    	s.getShelter_name2();
//	    	s.getShelter_address1();
//	    	s.getShelter_address2();
//	    	s.getShelter_address3();
//	    	s.getShelter_address4();
//	    	s.getTel();
//	    	s.getCapacity();
//	    	request.setAttribute("s", s);
//	    }
		
		ShelterDAO dao=new ShelterDAO();
	    List<Shelter_Date> list=dao.findAll();
	    request.setAttribute("list", list);
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/shelter_date.jsp");
	dispatcher.forward(request, response);
	}

}
