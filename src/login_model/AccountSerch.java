package login_model;

import java.io.Serializable;

public class AccountSerch implements Serializable{
	private static final long serialVersionUID = 1L;
	private int staff_id;
	private int shelter_id;
	  private String staff_name1;
	  private String staff_name2;
	  private String staff_pass;
	  private int staff_role;
	  private int admin_role;
	  private String staff_start;

	  
	

	public int getStaff_id() {
		    return staff_id;
		  }
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
	  public int getAdmin_role() {
		    return admin_role;
		  }

	  public String getStaff_start() {
		    return staff_start;
		  }


	  public void setStaff_id(int staff_id) {
		  this.staff_id = staff_id;
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
	  public void setAdmin_role(int admin_role) {
		  this.admin_role = admin_role;
	  }
	  public void setStaff_start(String staff_start) {
		  this.staff_start = staff_start;
	  }
}
