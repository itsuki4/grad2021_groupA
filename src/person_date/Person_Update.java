package person_date;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_dao.PersonUpdateDAO;
import person_date_model.Person;


@WebServlet("/Person_Update")
public class Person_Update extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
      response.sendRedirect("/grad2021_groupA/PersonRead");
    }else{
      PersonUpdateDAO dao=new PersonUpdateDAO();
      Person person=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("person", person);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/person_update.jsp");
      rd.forward(request, response);
    }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //以下を追記
    request.setCharacterEncoding("UTF-8");
    int person_id = Integer.parseInt(request.getParameter("person_id"));
    String person_name1 = request.getParameter("person_name1");
	String person_name2 = request.getParameter("person_name2");
	String person_birthday =request.getParameter("person_birthday");
	String person_address1=request.getParameter("person_address1");
	String person_address2=request.getParameter("person_address2");
	String person_address3=request.getParameter("person_address3");
	String person_address4=request.getParameter("person_address4");
	String acceptance=request.getParameter("acceptance");
	String person_status=request.getParameter("person_status");
	String person_protect=request.getParameter("person_protect");
	String person_parent1=request.getParameter("person_parent1");
	String person_parent2=request.getParameter("person_parent2");
	String parent_job = request.getParameter("parent_job");
	String parent_phone =request.getParameter("parent_phone");
	String brother1=request.getParameter("brother1");
	String brother2=request.getParameter("brother2");
	String parent_ok=request.getParameter("parent_ok");
	String person_remarks=request.getParameter("person_remarks");
	String person_gender=request.getParameter("person_gender");
	Person person=new Person(person_id,person_name1,person_name2,person_birthday,person_address1,
				person_address2,person_address3,person_address4,acceptance,person_status, person_protect,
				person_parent1,person_parent2,parent_job,parent_phone, brother1,brother2,parent_ok,person_remarks,person_gender);
    PersonUpdateDAO dao=new PersonUpdateDAO();
    dao.updateOne(person);

    response.sendRedirect("/grad2021_groupA/PersonRead");
  }

}


