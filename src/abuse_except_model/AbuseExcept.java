package abuse_except_model;

import java.io.Serializable;

public class AbuseExcept implements Serializable{
	private String person_protect;
	private int person_id;
	private String except_reason;
	private String except_direction;
	private String except_status;
	private String except_task;
	private String except_remarks;

	public AbuseExcept() {}
	public AbuseExcept(String person_protect,int person_id,String except_reason,String except_direction,String except_status,String except_task,String except_remarks) {
		this.person_protect =person_protect;
		this.person_id = person_id;
		this.except_reason = except_reason;
		this.except_direction = except_direction;
		this.except_status = except_status;
		this.except_task = except_task;
		this.except_remarks = except_remarks;
	}

	public String getperson_protect()
	{ return person_protect;}

	public int getperson_id()
	{return person_id;}

	public String getexcept_reason()
	{return except_reason;}

	public String getexcept_direction()
	{return except_direction;}

	public String getexcept_status()
	{return except_status;}

	public String getexcept_task()
	{return except_task;}

	public String getexcept_remarks()
	{return except_remarks;}

    public void setperson_protect(String person_protect)
    {this.person_protect=person_protect;}

    public void setperson_id(int person_id)
    {this.person_id=person_id;}

    public void setexcept_reason(String except_reason)
    {this.except_reason=except_reason;}

    public void setexcept_direction(String except_direction)
    {this.except_direction=except_direction;}

    public void setexcept_status(String except_status)
    {this.except_status=except_status;}

    public void setexcept_task(String except_task)
    {this.except_task=except_task;}

    public void setexcept_remarks(String except_remarks)
    {this.except_remarks=except_remarks;}
}