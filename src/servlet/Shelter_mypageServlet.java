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


@WebServlet("/Shelter_mypageServlet")
public class Shelter_mypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Shelter_mypageServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=Windows-31J");

		int id = Integer.parseInt(request.getParameter("id"));
		
		
		ShelterDAO dao=new ShelterDAO();
	    
	    
	    
	    List<Shelter_Date> list=dao.ShelterDetail(id);
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
	    
	    
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/shelter_mypage.jsp");
		dispatcher.forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
