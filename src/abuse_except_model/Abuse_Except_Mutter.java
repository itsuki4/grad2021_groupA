package abuse_except_model;

import java.io.Serializable;

public class Abuse_Except_Mutter implements Serializable{
	private int person_protect;
	private int person_id;
	private int except_reason;
	private int except_direction;
	private int except_status;
	private int except_task;
	private String except_remarks;

	public Abuse_Except_Mutter(String string) {}
	public Abuse_Except_Mutter(int person_protect,int person_id,int except_reason,int except_direction,int except_status,int except_task,String except_remarks) {
		this.person_protect = person_protect;
		this.person_id = person_id;
		this.except_reason = except_reason;
		this.except_direction = except_direction;
		this.except_status = except_status;
		this.except_task = except_task;
		this.except_remarks = except_remarks;
	}
	public int getperson_protect(){ return person_protect;}
	public int getperson_id() {return person_id;}
	public int getexcept_reason() {return except_reason;}
	public int getexcept_direction() {return except_direction;}
	public int getexcept_status() {return except_status;}
	public int getexcept_task() {return except_task;}
	public String getexcept_remarks() {return except_remarks;}
	}