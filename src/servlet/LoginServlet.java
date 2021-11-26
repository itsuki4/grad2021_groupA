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
import model.Shelter_Date;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShelterDAO dao=new ShelterDAO();
	    List<Shelter_Date> list=dao.findAll();
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
