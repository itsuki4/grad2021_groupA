package login_model;

import java.io.Serializable;

public class AccountLogin implements Serializable{
	private static final long serialVersionUID = 1L;
	  private int shelter_id;
	  private String staff_name1;
	  private String staff_name2;
	  private String staff_pass;
	  private int staff_role;




	public int getShelter_id() {
		    return shelter_id;
		  }

	  public String getStaff_name1() {
	    return staff_name1;
	  }

	  public String getStaff_name2() {
		    return staff_name2;
		  }

	  public String getStaff_pass() {
		    return staff_pass;
		  }

	  public int getStaff_role() {
		    return staff_role;
		  }



	  public void setShelter_id(int shelter_id) {
		  this.shelter_id = shelter_id;
	  }

	  public void setStaff_name1(String staff_name1) {
		  this.staff_name1 = staff_name1;
	  }
	  public void setStaff_name2(String staff_name2) {
		  this.staff_name2 = staff_name2;
	  }
	  public void setStaff_pass(String staff_pass) {
		  this.staff_pass = staff_pass;
	  }
	  public void setStaff_role(int staff_role) {
		  this.staff_role = staff_role;
	  }
}

