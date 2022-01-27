package model;

import java.io.Serializable;

public class Abuse implements Serializable{
	private int person_protect;
	private int person_id;
	private String family_structure;
	private int abuse_kinds;
	private int abuse_degree;
	private String  abuse_continuation;
	private String physical_condition;
    private String mental_condition;
    private int daily_lack;
    private String consciousness;
    private int problem_behavior;
    private int family_problems;
    private int economy_problem;
    private int living_environment;
    private int caregiver_personality;
    private int caregiver_mental;
    private int caregiver_childcare;
    private int children_emotions;
    private int abuse_awareness;
    private int neglect;
    private String childcare_knowledge;
    private int social_support;
    private int cooperation_attitude;
    private int aid_effect;
    private String childrens_opinion;
    private String parental_opinion;
    private String immediate_issues;
    private String direction_support;
    private String create_data;
    private String remarks;
    public Abuse() {};


	public Abuse(int person_protect, int person_id,String family_structure, int abuse_kinds, int abuse_degree, String abuse_continuation, String physical_condition, String mental_condition, int daily_lack, String consciousness, int problem_behavior, int family_problems, int economy_problem, int living_environment, int caregiver_personality, int caregiver_mental, int caregiver_childcare, int children_emotions, int abuse_awareness, int neglect, String childcare_knowledge, int social_support, int cooperation_attitude, int aid_effect, String childrens_opinion, String parental_opinion, String immediate_issues, String direction_support,String create_data, String remarks) {

		this.person_protect = person_protect;
		this.person_id = person_id;
		this.family_structure = family_structure;
		this.abuse_kinds = abuse_kinds;
		this.abuse_degree = abuse_degree;
		this.abuse_continuation = abuse_continuation;
		this.physical_condition = physical_condition;
		this.mental_condition = mental_condition;
		this.daily_lack = daily_lack;
		this.consciousness = consciousness;
	    this.problem_behavior = problem_behavior;
	    this.family_problems = family_problems;
	    this.economy_problem = economy_problem;
	    this.living_environment = living_environment;
	    this.caregiver_personality = caregiver_personality;
	    this.caregiver_mental = caregiver_mental;
	    this.caregiver_childcare = caregiver_childcare;
	    this.children_emotions = children_emotions;
	    this.abuse_awareness = abuse_awareness;
	    this.neglect = neglect;
	    this.childcare_knowledge = childcare_knowledge;
	    this.social_support = social_support;
	    this.cooperation_attitude = cooperation_attitude;
	    this.aid_effect = aid_effect;
	    this.childrens_opinion = childrens_opinion;
	    this.parental_opinion = parental_opinion;
	    this.immediate_issues = immediate_issues;
	    this.direction_support = direction_support;
	    this.create_data = create_data;
	    this.remarks = remarks;
	 }

	public Abuse(int person_protect, int person_id,String family_structure, int abuse_kinds, int abuse_degree, String abuse_continuation, String physical_condition, String mental_condition, int daily_lack, String consciousness, int problem_behavior, int family_problems, int economy_problem, int living_environment, int caregiver_personality, int caregiver_mental, int caregiver_childcare, int children_emotions, int abuse_awareness, int neglect, String childcare_knowledge, int social_support, int cooperation_attitude, int aid_effect, String childrens_opinion, String parental_opinion, String immediate_issues, String direction_support, String remarks) {

		this.person_protect = person_protect;
		this.person_id = person_id;
		this.family_structure = family_structure;
		this.abuse_kinds = abuse_kinds;
		this.abuse_degree = abuse_degree;
		this.abuse_continuation = abuse_continuation;
		this.physical_condition = physical_condition;
		this.mental_condition = mental_condition;
		this.daily_lack = daily_lack;
		this.consciousness = consciousness;
	    this.problem_behavior = problem_behavior;
	    this.family_problems = family_problems;
	    this.economy_problem = economy_problem;
	    this.living_environment = living_environment;
	    this.caregiver_personality = caregiver_personality;
	    this.caregiver_mental = caregiver_mental;
	    this.caregiver_childcare = caregiver_childcare;
	    this.children_emotions = children_emotions;
	    this.abuse_awareness = abuse_awareness;
	    this.neglect = neglect;
	    this.childcare_knowledge = childcare_knowledge;
	    this.social_support = social_support;
	    this.cooperation_attitude = cooperation_attitude;
	    this.aid_effect = aid_effect;
	    this.childrens_opinion = childrens_opinion;
	    this.parental_opinion = parental_opinion;
	    this.immediate_issues = immediate_issues;
	    this.direction_support = direction_support;

	    this.remarks = remarks;
	 }

	public int getPerson_protect(){ return person_protect;}
	public int getPerson_id() {return person_id;}
	public String getFamily_structure(){return family_structure;}
	public int getAbuse_kinds(){return abuse_kinds;}
	public int getAbuse_degree(){return abuse_degree;}
	public String getAbuse_continuation(){return abuse_continuation;}
	public String getPhysical_condition(){return physical_condition;}
	public String getMental_condition(){return mental_condition;}
	public int getDaily_lack(){return daily_lack;}
	public String getConsciousness(){return consciousness;}
	public int getProblem_behavior(){return problem_behavior;}
	public int getFamily_problems(){return family_problems;}
	public int getEconomy_problem(){return economy_problem;}
	public int getLiving_environment(){return living_environment;}
	public int getCaregiver_personality(){return caregiver_personality;}
	public int getCaregiver_mental(){return caregiver_mental;}
	public int getCaregiver_childcare(){return caregiver_childcare;}
	public int getChildren_emotions(){return children_emotions;}
	public	int getAbuse_awareness(){return abuse_awareness;}
	public int getNeglect(){return neglect;}
	public String getChildcare_knowledge(){return childcare_knowledge;}
	public int getSocial_support(){return social_support;}
	public int getCooperation_attitude(){return cooperation_attitude;}
	public int getAid_effect(){return aid_effect;}
	public String getChildrens_opinion(){return childrens_opinion;}
	public String getParental_opinion(){return parental_opinion;}
	public String getImmediate_issues(){return immediate_issues;}
	public String getDirection_support(){return direction_support;}
	public String getCreate_data() {return create_data;}
	public String getRemarks(){return remarks;}
}
