package model;

import java.io.Serializable;

public class Shelter_chat implements Serializable{
	 private static final long serialVersionUID = 1L;
	  private int shelter_id;
	  private String shelter_comment;




	public int getShelter_id() {
		    return shelter_id;
		  }

	  public String getShelter_comment() {
	    return shelter_comment;
	  }



	  public void setShelter_id(int shelter_id) {
		  this.shelter_id = shelter_id;
	  }

	  public void setShelter_comment(String shelter_comment) {
		  this.shelter_comment = shelter_comment;
	  }
}
