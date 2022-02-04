package model;

public class Admin_Account {
	private String admin_id;
	private String admin_name1;
	private String admin_name2;
	private String admin_pass;


	public  Admin_Account (String admin_id, String admin_name1, String admin_name2, String admin_pass) {
		this.admin_id = admin_id;
		this.admin_name1 = admin_name1;
		this.admin_name2 = admin_name2;
		this.admin_pass = admin_pass;


	}

	public String getAdmin_id() {
		return admin_id;
	}

	public String getAdmin_name1() {
		return admin_name1;
	}

	public String getAdmin_name2() {
		return admin_name2;
	}

	public String getAdmin_pass() {
		return admin_pass;
	}


}