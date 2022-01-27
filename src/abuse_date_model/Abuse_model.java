package abuse_date_model;

import java.io.Serializable;

public class Abuse_model implements Serializable{
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
    private int childcare_knowledge;
    private int social_support;
    private int cooperation_attitude;
    private int aid_effect;
    private String childrens_opinion;
    private String parental_opinion;
    private String immediate_issues;
    private String direction_support;
    private String remarks;
    public Abuse_model() {};

public Abuse_model(int person_protect2, int person_id2, String string, int abuse_kinds2, int abuse_degree2, String abuse_continuation2, String physical_condition2, String mental_condition2, int daily_lack2, String consciousness2, int problem_behavior2, int family_problems2, int economy_problem2, int living_environment2, int caregiver_personality2, int caregiver_mental2, int caregiver_childcare2, int children_emotions2, int abuse_awareness2, int neglect2, int childcare_knowledge2, int social_support2, int cooperation_attitude2, int aid_effect2, String childrens_opinion2, String parental_opinion2, String immediate_issues2, String direction_support2, String remarks2) {}
	public Abuse_model(int person_protect,int person_id, String family_structure, int abuse_kinds, int abuse_degree, String abuse_continuation, String parental_opinion, String immediate_issues, String direction_support,String remarks, String physical_condition, String mental_condition, int daily_lack, String consciousness, int problem_behavior, int family_problems, int economy_problem, int living_environment, int caregiver_personality, int caregiver_mental, int caregiver_childcare, int children_emotions, int abuse_awareness, int neglect, int childcare_knowledge, int social_support, int cooperation_attitude, int aid_effect, String childrens_opinion) {

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

	public int preson_protect(){ return person_protect;}
	public int preson_id() {return person_id;}
	public String family_structure(){return family_structure;}
	public int abuse_kinds(){return abuse_kinds;}
	public int abuse_degree(){return abuse_degree;}
	public String abuse_continuation(){return abuse_continuation;}
	public String physical_condition(){return physical_condition;}
	public String mental_condition(){return mental_condition;}
	public int daily_lack(){return daily_lack;}
	public String consciousness(){return consciousness;}
	public int problem_behavior(){return problem_behavior;}
	public int family_problems(){return family_problems;}
	public int economy_problem(){return economy_problem;}
	public int living_environment(){return living_environment;}
	public int caregiver_personality(){return caregiver_personality;}
	public int caregiver_mental(){return caregiver_mental;}
	public int caregiver_childcare(){return caregiver_childcare;}
	public int children_emotions(){return children_emotions;}
	public	int abuse_awareness(){return abuse_awareness;}
	public int neglect(){return neglect;}
	public int childcare_knowledge(){return childcare_knowledge;}
	public int social_support(){return social_support;}
	public int cooperation_attitude(){return cooperation_attitude;}
	public int aid_effect(){return aid_effect;}
	public String childrens_opinion(){return childrens_opinion;}
	public String parental_opinion(){return parental_opinion;}
	public String immediate_issues(){return immediate_issues;}
	public String direction_support(){return direction_support;}
	public String remarks(){return remarks;}
}
