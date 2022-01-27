package model;

public class Shelter_update {
	private int shelter_id;
	  private int capacity;
	  private String shelter_conditions;
	  private int shelter_vacancy;
	  public Shelter_update() {};

	  public Shelter_update (int shelter_id,int capacity,String shelter_conditions, int shelter_vacancy) {
	    this.shelter_id = shelter_id;
	    this.capacity = capacity;
	    this.shelter_conditions = shelter_conditions;
	    this.shelter_vacancy= shelter_vacancy;
	  }

	  public int getShelter_id() {
		    return shelter_id;
		  }


	  public int getCapacity() {
		    return capacity;
		  }

	  public String getShelter_conditions() {
		    return shelter_conditions;
		  }

		  public int getShelter_vacancy() {
			    return shelter_vacancy;
			  }

	  public void setShelter_id(int shelter_id) {
		  this.shelter_id = shelter_id;
	  }


	  public void setCapacity(int capacity) {
		  this.capacity = capacity;
	  }

	  public void setShelter_conditions(String shelter_conditions) {
		  this.shelter_conditions = shelter_conditions;
	  }

	  public void setShelter_vacancy(int shelter_vacancy) {
		  this.shelter_vacancy = shelter_vacancy;
	  }

}
