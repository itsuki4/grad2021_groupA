package model;

public class Admin_Login {

	private String admin_id;
	private String admin_pass;

	public Admin_Login (String admin_id,String admin_pass) {
		this.admin_id = admin_id;
		this.admin_pass = admin_pass;
	}


	public String getAdmin_id() {
		return admin_id;
	}

	public String getAdmin_pass() {
		return admin_pass;
	}



}
