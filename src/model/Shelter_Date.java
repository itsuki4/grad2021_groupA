package model;
import java.io.Serializable;


public class Shelter_Date implements Serializable{
	private int id;
	  private String shelter_name1;
	  private String shelter_name2;
	  private String shelter_address1;
	  private String shelter_address2;
	  private String shelter_address3;
	  private String shelter_address4;
	  private String tel;
	  private int capacity;
	  public Shelter_Date() {};

	  public Shelter_Date (int id, String shelter_name1, String shelter_name2, String shelter_address1,String shelter_address2,String shelter_address3,String shelter_address4,String tel,int capacity) {
	    this.id = id;
	    this.shelter_name1 = shelter_name1;
	    this.shelter_name2 = shelter_name2;
	    this.shelter_address1= shelter_address1;
	    this.shelter_address2= shelter_address2;
	    this.shelter_address3= shelter_address3;
	    this.shelter_address4= shelter_address4;
	    this.tel= tel;
	    this.capacity = capacity;
	  }

	  public int getId() {
	    return id;
	  }

	  public String getShelter_name1() {
	    return shelter_name1;
	  }

	  public String getShelter_name2() {
		    return shelter_name2;
		  }

	  public String getShelter_address1() {
		    return shelter_address1;
		  }

	  public String getShelter_address2() {
		    return shelter_address2;
		  }
	  public String getShelter_address3() {
		    return shelter_address3;
		  }
	  public String getShelter_address4() {
		    return shelter_address4;
		  }
	  public String getTel() {
		    return tel;
		  }
	  public int getCapacity() {
		    return capacity;
		  }

	  public void setId(int id) {
		  this.id = id;
	  }
}
