package person_date;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person_date_dao.PersonDAO;
import person_date_model.Person;
@WebServlet("/Person_Update")
public class Person_Update extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String person_id=request.getParameter("id");
    if(person_id == null){
    	response.sendRedirect("/grad2021_groupA/PersonRead");
    }else{
      PersonDAO dao=new PersonDAO();
      Person person=dao.findOne(Integer.parseInt(person_id));
      request.setAttribute("person", person);
      RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/person_update.jsp");
      rd.forward(request, response);
    }
    }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html; charset=Windows-31J");
		int person_id=Integer.parseInt(request.getParameter("person_id"));
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
			PrintWriter out=response.getWriter();


			 out.println("更新しました。");

			 out.println("person_name1="+person_name1);
			 out.println("name2="+person_name2);
			 out.println("bir="+person_birthday);
			 out.println("add1="+person_address1);
			 out.println("add2="+person_address2);
			 out.println("add3="+person_address3);
			 out.println("add4="+person_address4);
			 out.println("accep="+acceptance);
			 out.println("sta="+person_status);
			 out.println("pro="+person_protect);
			 out.println("par1="+person_parent1);
			 out.println("par2="+person_parent2);
			 out.println("par_job="+parent_job);
			 out.println("par_pho="+parent_phone);
			 out.println("bro1="+brother1);
			 out.println("bro2="+brother2);
			 out.println("par_ok="+parent_ok);
			 out.println("per_re="+person_remarks);
			 out.println("per_g"+person_gender);


			 Person ab = new Person();


			    ab.setperson_id(person_id);
				ab.setperson_name1(person_name1);
				ab.setperson_name2(person_name2);
				ab.setperson_birthday(person_birthday);
				ab.setperson_address1(person_address1);
				ab.setperson_address2(person_address2);
				ab.setperson_address3(person_address3);
				ab.setperson_address4(person_address4);
				ab.setacceptance(acceptance);
				ab.setperson_status(person_status);
			    ab.setperson_protect(person_protect);
				ab.setperson_parent1(person_parent1);
				ab.setperson_parent2(person_parent2);
				ab.setparent_job(parent_job);
				ab.setparent_phone(parent_phone);
				ab.setbrother1(brother1);
				ab.setbrother2(brother2);
				ab.setparent_ok(parent_ok);
				ab.setperson_remarks(person_remarks);
				ab.setperson_gender(person_gender);

				PersonDAO dao = new PersonDAO();
				dao.insertOne(ab);


		response.sendRedirect("/grad2021_groupA/PersonRead");
  }
}
