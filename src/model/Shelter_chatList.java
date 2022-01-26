package model;

public class Shelter_chatList {
	  private int shelter_id;
	  private String shelter_comment;
	  private String interview_date;

	  public Shelter_chatList(int shelter_id, String shelter_comment, String interview_date) {
	    this.shelter_id = shelter_id;
	    this.shelter_comment = shelter_comment;
	    this.interview_date = interview_date;
	  }




	  public int getShelter_id() {
		    return shelter_id;
		  }

	  public String getShelter_comment() {
	    return shelter_comment;
	  }

	  public String getInterview_date() {
	    return interview_date;
	  }

	  public void setShelter_id(int shelter_id) {
		  this.shelter_id = shelter_id;
	  }

	  public void setShelter_comment(String shelter_comment) {
		  this.shelter_comment = shelter_comment;
	  }
}
