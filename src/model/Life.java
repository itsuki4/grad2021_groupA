package model;
import java.io.Serializable;


public class Life implements Serializable{
	  private int page_no;
	  private int person_id;
	  private String create_data;
	  private int detachable;
	  private String detachable_remarks;
	  private int meal;
	  private int meal_form;
	  private String meal_form_remarks;
	  private int excretion;
	  private String excretion_remarks;
	  private int interpersonal;
	  private String interpersonal_remarks ;
	  private int collective;
	  private String collective_remarks ;
	  private int management;
	  private String management_remarks;
	  private int understanding;
	  private String understanding_remarks;
	  private int phonation;
	  private String phonation_remarks;
	  private int reading;
	  private String reading_remarks;
	  private int writing;
	  private String writing_remarks ;
	  private int number_concept;
	  private int calculation;
	  private String other_concept;
	  private String number_remarks;
	  private String action;
	  private String remarks;
	  public Life() {};

	  public Life (
			  int page_no,
			  int person_id,
			  String create_data,
			  int detachable,
			  String detachable_remarks,
			  int meal,
			  int meal_form,
			  String meal_form_remarks,
			  int excretion,
			  String excretion_remarks,
			  int interpersonal,
			  String interpersonal_remarks,
			  int collective,
			  String collective_remarks,
			  int management,
			  String management_remarks,
			  int understanding,
			  String understanding_remarks,
			  int phonation,
			  String phonation_remarks,
			  int reading,
			  String reading_remarks,
			  int writing,
			  String writing_remarks,
			  int number_concept,
			  int calculation,
			  String other_concept,
			  String number_remarks,
			  String action,
			  String remarks
			  )
	  {
	    this.page_no = page_no;
		this.person_id = person_id;
	    this.create_data = create_data;
	    this.detachable = detachable;
	    this.detachable_remarks= detachable_remarks;
	    this.meal= meal;
	    this.meal_form= meal_form;
	    this.meal_form_remarks= meal_form_remarks;
	    this.excretion= excretion;
	    this.excretion_remarks = excretion_remarks;
	    this.interpersonal = interpersonal;
	    this.interpersonal_remarks= interpersonal_remarks;
	    this.collective = collective;
	    this.collective_remarks = collective_remarks;
	    this.management = management;
	    this.management_remarks = management_remarks;
	    this.understanding = understanding;
	    this.understanding_remarks = understanding_remarks;
	    this.phonation = phonation;
	    this.phonation_remarks = phonation_remarks;
	    this.reading = reading;
	    this.reading_remarks = reading_remarks;
	    this.writing = writing;
	    this.writing_remarks = writing_remarks;
	    this.number_concept = number_concept;
	    this.calculation = calculation;
	    this.other_concept = other_concept;
	    this.number_remarks = number_remarks;
	    this.action = action;
	    this.remarks = remarks;
	  }

	  //DBへ追加
	  public Life(int page_no,int person_id,int detachable,String detachable_remarks,int meal,int meal_form,String meal_form_remarks,int excretion,String excretion_remarks,int interpersonal,String interpersonal_remarks,int collective,String collective_remarks,int management,String management_remarks,int understanding,String understanding_remarks,int phonation,String phonation_remarks,int reading,String reading_remarks,int writing,String writing_remarks,int number_concept,int calculation,String other_concept,String number_remarks,String action,String remarks) {
		  	this.page_no = page_no;
			this.person_id = person_id;
		    this.detachable = detachable;
		    this.detachable_remarks= detachable_remarks;
		    this.meal= meal;
		    this.meal_form= meal_form;
		    this.meal_form_remarks= meal_form_remarks;
		    this.excretion= excretion;
		    this.excretion_remarks = excretion_remarks;
		    this.interpersonal = interpersonal;
		    this.interpersonal_remarks= interpersonal_remarks;
		    this.collective = collective;
		    this.collective_remarks = collective_remarks;
		    this.management = management;
		    this.management_remarks = management_remarks;
		    this.understanding = understanding;
		    this.understanding_remarks = understanding_remarks;
		    this.phonation = phonation;
		    this.phonation_remarks = phonation_remarks;
		    this.reading = reading;
		    this.reading_remarks = reading_remarks;
		    this.writing = writing;
		    this.writing_remarks = writing_remarks;
		    this.number_concept = number_concept;
		    this.calculation = calculation;
		    this.other_concept = other_concept;
		    this.number_remarks = number_remarks;
		    this.action = action;
		    this.remarks = remarks;
	  }

	  public int getPage_no(){ return page_no;}
	  public int getPerson_id(){ return person_id;}
	  public String getCreate_data(){ return create_data;}
	  public int getDetachable(){ return detachable;}
	  public String getDetachable_remarks() {return detachable_remarks;}
	  public int getMeal(){ return meal;}
	  public int getMeal_form(){ return meal_form;}
	  public String getMeal_form_remarks() {return meal_form_remarks;}
	  public int getExcretion(){ return excretion;}
	  public String getExcretion_remarks() {return excretion_remarks;}
	  public int getInterpersonal(){ return interpersonal;}
	  public String getInterpersonal_remarks() {return interpersonal_remarks;}
	  public int getCollective(){ return collective;}
	  public String getCollective_remarks() {return collective_remarks;}
	  public int getManagement(){ return management;}
	  public String getManagement_remarks() {return management_remarks;}
	  public int getUnderstanding(){ return understanding;}
	  public String getUnderstanding_remarks() {return understanding_remarks;}
	  public int getPhonation(){ return phonation;}
	  public String getPhonation_remarks() {return phonation_remarks;}
	  public int getReading(){ return reading;}
	  public String getReading_remarks() {return reading_remarks;}
	  public int getWriting(){ return writing;}
	  public String getWriting_remarks() {return writing_remarks;}
	  public int getNumber_concept(){ return number_concept;}
	  public int getCalculation(){ return calculation;}
	  public String getOther_concept() {return other_concept;}
	  public String getNumber_remarks() {return number_remarks;}
	  public String getAction() {return action;}
	  public String getRemarks() {return remarks;}
}