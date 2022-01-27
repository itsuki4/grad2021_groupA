package person_date_model;

import java.io.Serializable;

public class Person_Date_Mutter implements Serializable{
	private int person_id;
	private String person_name1;
	private String person_name2;
	private String person_birthday;
	private String person_address1;
	private String person_address2;
	private String person_address3;
	private String person_address4;
	private String acceptance;
	private int person_status;
	private int person_protect;
	private String person_parent1;
	private String person_parent2;
	private String parent_job;
	private String parent_phone;
	private String brother1;
	private String brother2;
	private int parent_ok;
	private String person_remarks;
	private int person_gender;


	public Person_Date_Mutter(String string) {}
	public Person_Date_Mutter(int person_id,String person_name1,String person_name2,String person_birthday,String person_address1,
			String person_address2,String person_address3,String person_address4,String acceptance,int person_status,
			int person_protect,String person_parent1, String person_parent2,String parent_job,String parent_phone,
			String brother1,String brother2,int parent_ok,String person_remarks,int person_gender) {
		this.person_id = person_id;
		this.person_name1 = person_name1;
		this.person_name2 = person_name2;
		this.person_birthday = person_birthday;
		this.person_address1 = person_address1;
		this.person_address2 = person_address2;
		this.person_address3 = person_address3;
		this.person_address4 = person_address4;
		this.acceptance = acceptance;
		this.person_status = person_status;
		this.person_protect = person_protect;
		this.person_parent1 = person_parent1;
		this.person_parent2 = person_parent2;
		this.parent_job = parent_job;
		this.parent_phone = parent_phone;
		this.brother1 = brother1;
		this.brother2 = brother2;
		this.parent_ok = parent_ok;
		this.person_remarks = person_remarks;
		this.person_gender = person_gender;

	}
	public int getperson_id(){ return person_id;}
	public String getperson_name1() {return person_name1;}
	public String getperson_name2() {return person_name2;}
	public String getperson_birthday() {return person_birthday;}
	public String getperson_address1() {return person_address1;}
	public String getperson_address2() {return person_address2;}
	public String getperson_address3() {return person_address3;}
	public String getperson_address4() {return person_address4;}
	public String getacceptance() {return acceptance;}
	public int getperson_status() {return person_status;}
	public int getperson_protect() {return person_protect;}
	public String getperson_parent1() {return person_parent1;}
	public String getperson_parent2() {return person_parent2;}
	public String getparent_job() {return parent_job;}
	public String getparent_phone() {return parent_phone;}
	public String getbrother1() {return brother1;}
	public String getbrother2() {return brother2;}
	public int getparent_ok() {return parent_ok;}
	public String getperson_remarks() {return person_remarks;}
	public int getperson_gender() {return person_gender;}
	}