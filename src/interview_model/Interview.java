package interview_model;
import java.io.Serializable;


public class Interview implements Serializable{

	private int person_id;
	private String person_name1;
	private String interview_date;
	private int staff_id;
	private String staff_name1;

	private String cooperation_attitude;
	private String personality_progress;
	private String mental_progress;
	private String emotional_changes;
	private String parental_opinion;

	private String immediate_issues;
	private String future_tasks;
	private String personality_remarks;

	public Interview() {}
	public Interview(int person_id,String person_name1,String interview_date,int staff_id,String staff_name1,
			String cooperation_attitude,String personality_progress,String mental_progress,String emotional_changes,String parental_opinion,
			String immediate_issues,String future_tasks, String personality_remarks) {

		this.person_id = person_id;
		this.person_name1 = person_name1;
		this.interview_date = interview_date;
		this.staff_id = staff_id;
		this.staff_name1 = staff_name1;

		this.cooperation_attitude = cooperation_attitude;
		this.personality_progress = personality_progress;
		this.mental_progress = mental_progress;
		this.emotional_changes = emotional_changes;
		this.parental_opinion = parental_opinion;

		this.immediate_issues = immediate_issues;
		this.future_tasks = future_tasks;
		this.personality_remarks = personality_remarks;
	}

	public int getperson_id()
	{ return person_id;}

	public String getperson_name1()
	{return person_name1;}

	public String getinterview_date()
	{return interview_date;}

	public int getstaff_id()
	{return staff_id;}

	public String getstaff_name1()
	{return staff_name1;}

	public String getcooperation_attitude()
	{return cooperation_attitude;}

	public String getpersonality_progress()
	{return personality_progress;}

	public String getmental_progress()
	{return mental_progress;}

	public String getemotional_changes()
	{return emotional_changes;}

	public String getparental_opinion()
	{return parental_opinion;}

	public String getimmediate_issues()
	{return immediate_issues;}

	public String getfuture_tasks()
	{return future_tasks;}

	public String getpersonality_remarks()
	{return personality_remarks;}

	public void setperson_id(int person_id)
	{ this.person_id=person_id;}

	public void setperson_name1(String person_name1)
	{this.person_name1=person_name1;}

	public void setinterview_date(String interview_date)
	{this.interview_date=interview_date;}

	public void setstaff_id(int staff_id)
	{this.staff_id=staff_id;}

	public void setstaff_name1(String staff_name1)
	{this.staff_name1=staff_name1;}

	public void setcooperation_attitude(String cooperation_attitude)
	{this.cooperation_attitude=cooperation_attitude;}

	public void setpersonality_progress(String personality_progress)
	{this.personality_progress= personality_progress;}

	public void setmental_progress(String mental_progress)
	{this.mental_progress= mental_progress;}

	public void setemotional_changes(String emotional_changes)
	{this.emotional_changes= emotional_changes;}

	public void setparental_opinion(String parental_opinion)
	{this.parental_opinion= parental_opinion;}

	public void setimmediate_issues(String immediate_issues)
	{this.immediate_issues= immediate_issues;}

	public void setfuture_tasks(String future_tasks)
	{this.future_tasks= future_tasks;}

	public void setpersonality_remarks(String personality_remarks)
	{this.personality_remarks= personality_remarks;}

	}