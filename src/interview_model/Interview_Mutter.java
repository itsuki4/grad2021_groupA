package interview_model;

import java.io.Serializable;

public class Interview_Mutter implements Serializable{
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

	public Interview_Mutter(String string) {}
	public Interview_Mutter(int person_id,String person_name1,String interview_date,int staff_id,String staff_name1,
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
	public int getperson_id(){ return person_id;}
	public String getperson_name1() {return person_name1;}
	public String geinterview_date() {return interview_date;}
	public int getstaff_id() {return staff_id;}
	public String getstaff_name1() {return staff_name1;}
	public String getcooperation_attitude() {return cooperation_attitude;}
	public String getpersonality_progress() {return personality_progress;}
	public String getmental_progress() {return mental_progress;}
	public String getemotional_changes() {return emotional_changes;}
	public String getparental_opinion() {return parental_opinion;}
	public String getimmediate_issues() {return immediate_issues;}
	public String getfuture_tasks() {return future_tasks;}
	public String getpersonality_remarks() {return personality_remarks;}
	}