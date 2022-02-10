package model;
import java.io.Serializable;


public class Children implements Serializable{
	  private int person_id;
	  private String shelter_name1;
	  private String shelter_name2;
	  private String person_name1;
	  private String person_name2;
	  private String person_start;
	  private String person_end;
	  private int shelter_id;
	  private String person_parent1;
	  private String person_parent2;
	  private int person_brother;
	  public Children() {};

	  public Children (int person_id, String shelter_name1, String shelter_name2, String person_name1,String person_name2,String person_start,String person_end,int shelter_id,String person_parent1, String person_parent2, int person_brother) {
	    this.person_id = person_id;
	    this.shelter_name1 = shelter_name1;
	    this.shelter_name2 = shelter_name2;
	    this.person_name1= person_name1;
	    this.person_name2= person_name2;
	    this.person_start= person_start;
	    this.person_end= person_end;
	    this.shelter_id= shelter_id;
	    this.person_parent1 = person_parent1;
	    this.person_parent2 = person_parent2;
	    this.person_brother= person_brother;
	  }

	  //追加
	  public Children( String shelter_name1, String shelter_name2, String person_name1,String person_name2,String person_start,String person_end,int shelter_id,String person_parent1, String person_parent2) {
		  this.shelter_name1 = shelter_name1;
		    this.shelter_name2 = shelter_name2;
		    this.person_name1= person_name1;
		    this.person_name2= person_name2;
		    this.person_start= person_start;
		    this.person_end= person_end;
		    this.shelter_id= shelter_id;
		    this.person_parent1 = person_parent1;
		    this.person_parent2 = person_parent2;
//		    this.person_brother= person_brother;

	  }

	  //更新（データの取り出し）
	  public Children(int person_id, String shelter_name1, String shelter_name2, String person_name1,String person_name2,String person_start,String person_end,int shelter_id,String person_parent1, String person_parent2) {
		    this.person_id = person_id;
		    this.shelter_name1 = shelter_name1;
		    this.shelter_name2 = shelter_name2;
		    this.person_name1= person_name1;
		    this.person_name2= person_name2;
		    this.person_start= person_start;
		    this.person_end= person_end;
		    this.shelter_id= shelter_id;
		    this.person_parent1 = person_parent1;
		    this.person_parent2 = person_parent2;
	  }

	  public int getPerson_id() {
	    return person_id;
	  }

	  public String getShelter_name1() {
	    return shelter_name1;
	  }

	  public String getShelter_name2() {
		    return shelter_name2;
		  }

	  public String getPerson_name1() {
		    return person_name1;
		  }

	  public String getPerson_name2() {
		    return person_name2;
		  }
	  public String getPerson_start() {
		    return person_start;
		  }
	  public String getPerson_end() {
		    return person_end;
		  }
	  public int getShelter_id() {
		    return shelter_id;
		  }
	  public String getPerson_parent1() {
		    return person_parent1;
		  }

	  public String getPerson_parent2() {
		    return person_parent2;
		  }

	  public int getPerson_brother() {
		    return person_brother;
		  }

	  public void setId(int id) {
		  this.person_id = id;
	  }
}