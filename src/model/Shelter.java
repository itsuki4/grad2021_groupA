package model;

public class Shelter {
	private int id;
	private String shelter_name1;
	  private String shelter_conditions;
	  private int shelter_vacancy;
	  public Shelter() {};

	  public Shelter(int id, String shelter_name1, String shelter_conditions, int shelter_vacancy) {
	    this.id = id;
	    this.shelter_name1 = shelter_name1;
	    this.shelter_conditions = shelter_conditions;
	    this.shelter_vacancy= shelter_vacancy;
	  }

	  public int getId() {
	    return id;
	  }

	  public String getShelter_name1() {
		  return shelter_name1;
	  }
	  public String getShelter_conditions() {
	    return shelter_conditions;
	  }

	  public int getShelter_vacancy() {
		    return shelter_vacancy;
		  }


	  public void setId(int id) {
		  this.id = id;
	  }
}
