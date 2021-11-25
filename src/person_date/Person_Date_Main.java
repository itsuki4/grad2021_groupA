package person_date;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_model.GetPerson_DateMutterLogic;
import person_date_model.Person_Date_Mutter;

@WebServlet("/Person_Date_Main")
public class Person_Date_Main extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		GetPerson_DateMutterLogic getPerson_DateMutterLogic = new GetPerson_DateMutterLogic();
		List<Person_Date_Mutter> person_date_mutterList = getPerson_DateMutterLogic.execute();
		request.setAttribute("person_date_mutterList", person_date_mutterList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/person_date.jsp");
		dispatcher.forward(request,response);
	}
}